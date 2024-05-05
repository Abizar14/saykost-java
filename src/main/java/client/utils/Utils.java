package client.utils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Utils {

	/**
	 * Display a custom message dialog with custom title, message and image.
	 *
	 * @param title         The title of the dialog.
	 * @param detailMessage The message to be displayed.
	 * @param imageString   The path to the image file.
	 * @param width         The desired width of the image.
	 * @param height        The desired height of the image.
	 */
	public static void showMessageDialog(String title, String detailMessage, String imageString, int width, int height) {
		// Load the animated GIF
		ImageIcon originalIcon = new ImageIcon(imageString);
		// Resize the GIF
		Image originalImage = originalIcon.getImage();
		Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_DEFAULT); // Adjust the size as
		// needed
		// Create a new ImageIcon from the resized image
		ImageIcon resizedIcon = new ImageIcon(resizedImage);
		// Create a panel to hold the resized GIF and error message
		JPanel panel = new JPanel(new BorderLayout());
		panel.setBorder(new EmptyBorder(10, 10, 10, 10)); // Add some padding
		// Create a label to display the resized GIF
		JLabel imageLabel = new JLabel(resizedIcon);
		panel.add(imageLabel, BorderLayout.CENTER);
		// Create a text area for displaying the error message
		JLabel labelMessage = new JLabel(detailMessage);
		labelMessage.setHorizontalAlignment(SwingConstants.CENTER);
		labelMessage.setFont(new Font("Poppins", Font.PLAIN, 14));
		panel.add(labelMessage, BorderLayout.SOUTH);
		// Show the panel in a JOptionPane
		JOptionPane.showMessageDialog(null, panel, title, JOptionPane.PLAIN_MESSAGE);
	}

	public static int showConfirmDialog(String title, String detailMessage, String imageString, int width, int height) {
		// Load the animated GIF
		ImageIcon originalIcon = new ImageIcon(imageString);
		// Resize the GIF
		Image originalImage = originalIcon.getImage();
		Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_DEFAULT); // Adjust the size as
		// needed
		// Create a new ImageIcon from the resized image
		ImageIcon resizedIcon = new ImageIcon(resizedImage);
		// Create a panel to hold the resized GIF and error message
		JPanel panel = new JPanel(new BorderLayout());
		panel.setBorder(new EmptyBorder(10, 10, 10, 10)); // Add some padding
		// Create a label to display the resized GIF
		JLabel imageLabel = new JLabel(resizedIcon);
		panel.add(imageLabel, BorderLayout.CENTER);
		// Create a text area for displaying the error message
		JLabel labelMessage = new JLabel(detailMessage);
		labelMessage.setHorizontalAlignment(SwingConstants.CENTER);
		labelMessage.setFont(new Font("Poppins", Font.PLAIN, 14));
		panel.add(labelMessage, BorderLayout.SOUTH);
		// Show the panel in a JOptionPane
		return JOptionPane.showConfirmDialog(null, panel, title, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
	}
}
