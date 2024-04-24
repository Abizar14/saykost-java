package client.test;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Date;

class filechooser extends JFrame implements ActionListener {
	// Jlabel to show the files user selects
	static JLabel l;

	// a default constructor
	filechooser() {
	}

	public static void main(String args[]) {
		// frame to contains GUI elements
		JFrame f = new JFrame("file chooser");

		// set the size of the frame
		f.setSize(400, 400);

		// set the frame's visibility
		f.setVisible(true);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// button to open save dialog
		JButton button1 = new JButton("save");

		// button to open open dialog
		JButton button2 = new JButton("open");

		// make an object of the class filechooser
		filechooser f1 = new filechooser();

		// add action listener to the button to capture user
		// response on buttons
		button1.addActionListener(f1);
		button2.addActionListener(f1);

		// make a panel to add the buttons and labels
		JPanel p = new JPanel();

		// add buttons to the frame
		p.add(button1);
		p.add(button2);

		// set the label to its initial value
		l = new JLabel("no file selected");

		// add panel to the frame
		p.add(l);
		f.add(p);

		f.show();
	}

	/**
	 * Handles the action event when a button is clicked.
	 * If the command is "save", it opens a file chooser dialog to select an image file.
	 * If the user selects a file, it copies the file to a destination folder and sets the icon of a label to the selected file.
	 * If the command is not "save", it opens a file chooser dialog to select a .jpg file.
	 * If the user selects a file, it prints the icon of the selected file.
	 *
	 * @param evt The action event.
	 */
	public void actionPerformed(ActionEvent evt) {
		String command = evt.getActionCommand();

		if (command.equals("save")) {
			JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.setDialogTitle("Select a image file");

			FileNameExtensionFilter filter = new FileNameExtensionFilter("Only .jpg and .png files", "jpg", "jpeg", "png");
			fileChooser.addChoosableFileFilter(filter);

			int result = fileChooser.showSaveDialog(null);

			if (result == JFileChooser.APPROVE_OPTION) {
				File selectedFile = fileChooser.getSelectedFile();
				File destinationFolder = new File("./img/upload");

				if (!destinationFolder.exists()) {
					destinationFolder.mkdir();
				}

				Path destinationFilePath = destinationFolder.toPath().resolve(new Date().getTime() + "-" + selectedFile.getName());

				try {
					Files.copy(selectedFile.toPath(), destinationFilePath, StandardCopyOption.REPLACE_EXISTING);
					l.setIcon(new javax.swing.ImageIcon("./img/boarding_houses/" + selectedFile.getName()));
					System.out.println("File copied successfully.");
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				l.setText("The user cancelled the operation");
			}
		} else {
			JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.setDialogTitle("Select a .jpg file");

			FileNameExtensionFilter filter = new FileNameExtensionFilter("Only .jpg or .png files", "jpg", "jpeg", "png");
			fileChooser.addChoosableFileFilter(filter);

			int result = fileChooser.showOpenDialog(null);

			if (result == JFileChooser.APPROVE_OPTION) {
				System.out.println(new javax.swing.ImageIcon("./img/boarding_houses/" + fileChooser.getSelectedFile().getName()));
			} else {
				l.setText("The user cancelled the operation");
			}
		}
	}
}
