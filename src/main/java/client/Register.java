/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package client;

import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import services.user.UserService;
import services.user.entities.UserEntity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ACER
 */
public class Register extends JFrame {

	int xx, xy;

	/**
	 * Creates new form Login
	 */
	public Register() {
		initComponents();
		image.setIcon(new ImageIcon("./img/SAY1.png"));
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new JPanel();
		txtUsername = new JTextField();
		jLabel1 = new JLabel();
		btnRegister = new JButton();
		txtPassword = new JPasswordField();
		jLabel6 = new JLabel();
		txtNohp = new JTextField();
		txtNama = new JTextField();
		image = new JLabel();
		jPanel2 = new JPanel();
		jLabel2 = new JLabel();
		pnLogin = new JPanel();
		jLabel3 = new JLabel();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent evt) {
				formMouseDragged(evt);
			}
		});
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
				formMousePressed(evt);
			}
		});
		getContentPane().setLayout(new AbsoluteLayout());

		jPanel1.setBackground(new Color(255, 255, 255));

		txtUsername.setFont(new Font("Poppins", 0, 12)); // NOI18N
		txtUsername.setText("Username");
		txtUsername.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent evt) {
				txtUsernameFocusGained(evt);
			}

			public void focusLost(FocusEvent evt) {
				txtUsernameFocusLost(evt);
			}
		});
		txtUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				txtUsernameActionPerformed(evt);
			}
		});

		jLabel1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				jLabel1MouseClicked(evt);
			}
		});

		btnRegister.setBackground(new Color(51, 51, 255));
		btnRegister.setFont(new Font("Poppins", 1, 12)); // NOI18N
		btnRegister.setForeground(new Color(255, 255, 255));
		btnRegister.setText("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnRegisterActionPerformed(evt);
			}
		});

		txtPassword.setText("Password\n");
		txtPassword.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent evt) {
				txtPasswordFocusGained(evt);
			}

			public void focusLost(FocusEvent evt) {
				txtPasswordFocusLost(evt);
			}
		});
		txtPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				txtPasswordActionPerformed(evt);
			}
		});

		jLabel6.setFont(new Font("Poppins", 1, 18)); // NOI18N
		jLabel6.setForeground(new Color(0, 51, 204));
		jLabel6.setText("Buat Akun\n");

		txtNohp.setFont(new Font("Poppins", 0, 12)); // NOI18N
		txtNohp.setText("No Hp");
		txtNohp.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent evt) {
				txtNohpFocusGained(evt);
			}

			public void focusLost(FocusEvent evt) {
				txtNohpFocusLost(evt);
			}
		});
		txtNohp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				txtNohpActionPerformed(evt);
			}
		});

		txtNama.setFont(new Font("Poppins", 0, 12)); // NOI18N
		txtNama.setText("Nama");
		txtNama.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent evt) {
				txtNamaFocusGained(evt);
			}

			public void focusLost(FocusEvent evt) {
				txtNamaFocusLost(evt);
			}
		});
		txtNama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				txtNamaActionPerformed(evt);
			}
		});

		image.setHorizontalAlignment(SwingConstants.CENTER);

		jPanel2.setBackground(new Color(255, 255, 255));

		jLabel2.setText("Sudah Mempuntai Akun?");

		pnLogin.setBackground(new Color(255, 255, 255));
		pnLogin.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				pnLoginMouseClicked(evt);
			}
		});

		jLabel3.setFont(new Font("Segoe UI", 1, 12)); // NOI18N
		jLabel3.setForeground(new Color(35, 77, 167));
		jLabel3.setText("Login");

		GroupLayout pnLoginLayout = new GroupLayout(pnLogin);
		pnLogin.setLayout(pnLoginLayout);
		pnLoginLayout.setHorizontalGroup(
				pnLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(GroupLayout.Alignment.TRAILING, pnLoginLayout.createSequentialGroup()
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel3)
								.addContainerGap())
		);
		pnLoginLayout.setVerticalGroup(
				pnLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(jLabel3)
		);

		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addComponent(jLabel2)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pnLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(jLabel2)
						.addComponent(pnLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		);

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel1))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addGap(249, 249, 249)
												.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
														.addComponent(txtUsername, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
														.addComponent(txtPassword, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
														.addComponent(txtNohp, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
														.addComponent(txtNama, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addGap(32, 32, 32)
																.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
																		.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(btnRegister, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)))))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addGap(259, 259, 259)
												.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addGap(55, 55, 55)
																.addComponent(jLabel6)
																.addGap(68, 68, 68))
														.addComponent(image, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(282, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel1)
								.addGap(9, 9, 9)
								.addComponent(jLabel6)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(image, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(txtNama, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addGap(27, 27, 27)
								.addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addGap(29, 29, 29)
								.addComponent(txtNohp, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addGap(28, 28, 28)
								.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(btnRegister, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(28, Short.MAX_VALUE))
		);

		getContentPane().add(jPanel1, new AbsoluteConstraints(0, 0, 770, 470));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * Handles the event when the mouse is pressed on the form.
	 *
	 * @param evt the MouseEvent object representing the mouse press event
	 */
	private void formMousePressed(MouseEvent evt) {//GEN-FIRST:event_formMousePressed
		xx = evt.getX();
		xy = evt.getY();

	}//GEN-LAST:event_formMousePressed

	/**
	 * Handles the event when the mouse is dragged on the form.
	 *
	 * @param evt the MouseEvent object representing the mouse drag event
	 */
	private void formMouseDragged(MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
		int x = evt.getXOnScreen();
		int y = evt.getYOnScreen();
		this.setLocation(x - xx, y - xy);
	}//GEN-LAST:event_formMouseDragged

	/**
	 * Handles the event when the mouse is clicked on jLabel1, which will close the form.
	 *
	 * @param evt the MouseEvent object representing the mouse click event
	 */
	private void jLabel1MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
		dispose();
	}//GEN-LAST:event_jLabel1MouseClicked

	/**
	 * Handles the event when the login button is clicked.
	 * <p>
	 * if the user is {@code admin}, it will open the dashboard admin.
	 * <p>
	 * if the user is {@code customer}, it will open the dashboard customer.
	 *
	 * @param evt the ActionEvent object representing the button click event
	 */
	private void btnRegisterActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
		try {
			UserEntity user = new UserEntity();
			user.setFullName(txtNama.getText());
			user.setPhoneNumber(txtNohp.getText());
			user.setUsername(txtUsername.getText());
			user.setPassword(txtPassword.getText());

			String registeredUser = UserService.registerCustomer(user);

			if (registeredUser == null) {
				JOptionPane.showMessageDialog(null, "Username sudah terdaftar");
			} else {
				JOptionPane.showMessageDialog(null, registeredUser);
				Login loginPage = new Login();
				loginPage.setVisible(true);
				this.dispose();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}//GEN-LAST:event_btnRegisterActionPerformed

	/**
	 * Handles the event when the username text field gains focus.
	 *
	 * @param evt the FocusEvent object representing the focus event
	 */
	private void txtUsernameFocusGained(FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
		String username = txtUsername.getText();

		if (username.equals("Username")) {
			txtUsername.setText("");
		}
	}//GEN-LAST:event_txtUsernameFocusGained

	/**
	 * Handles the event when the username text field loses focus.
	 *
	 * @param evt the FocusEvent object representing the focus event
	 */
	private void txtUsernameFocusLost(FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
		String username = txtUsername.getText();

		if (username.isEmpty() || username.equals("Username")) {
			txtUsername.setText("Username");
		}
	}//GEN-LAST:event_txtUsernameFocusLost

	/**
	 * Handles the event when the password text field is activated.
	 *
	 * @param evt the ActionEvent object representing the action event
	 */
	private void txtPasswordActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_txtPasswordActionPerformed

	/**
	 * Handles the event when the password text field gains focus.
	 *
	 * @param evt the FocusEvent object representing the focus event
	 */
	private void txtPasswordFocusGained(FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
		String password = txtPassword.getText();

		if (password.equals("Password")) {
			txtPassword.setText("");
		}

	}//GEN-LAST:event_txtPasswordFocusGained

	/**
	 * Handles the event when the password text field loses focus.
	 *
	 * @param evt the FocusEvent object representing the focus event
	 */
	private void txtPasswordFocusLost(FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
		String password = txtPassword.getText();

		if (password.equals("") || password.equals("Password")) {
			txtPassword.setText("Password");
		}
	}//GEN-LAST:event_txtPasswordFocusLost


	private void txtUsernameActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_txtUsernameActionPerformed

	private void txtNohpFocusGained(FocusEvent evt) {//GEN-FIRST:event_txtNohpFocusGained
		// TODO add your handling code here:
		String nohp = txtNohp.getText();
		if (nohp.equals("No Hp")) {
			txtNohp.setText("");
		}
	}//GEN-LAST:event_txtNohpFocusGained

	private void txtNohpFocusLost(FocusEvent evt) {//GEN-FIRST:event_txtNohpFocusLost
		// TODO add your handling code here:
		String nohp = txtNohp.getText();

		if (nohp.equals("") || nohp.equals("No Hp")) {
			txtNohp.setText("No Hp");
		}
	}//GEN-LAST:event_txtNohpFocusLost

	private void txtNohpActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtNohpActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_txtNohpActionPerformed

	private void txtNamaFocusGained(FocusEvent evt) {//GEN-FIRST:event_txtNamaFocusGained
		// TODO add your handling code here:
		String nama = txtNama.getText();
		if (nama.equals("Nama")) {
			txtNama.setText("");
		}
	}//GEN-LAST:event_txtNamaFocusGained

	private void txtNamaFocusLost(FocusEvent evt) {//GEN-FIRST:event_txtNamaFocusLost
		// TODO add your handling code here:
		String nama = txtNama.getText();

		if (nama.equals("") || nama.equals("Nama")) {
			txtNama.setText("Nama");
		}
	}//GEN-LAST:event_txtNamaFocusLost

	private void txtNamaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_txtNamaActionPerformed

	private void pnLoginMouseClicked(MouseEvent evt) {//GEN-FIRST:event_pnLoginMouseClicked
		// TODO add your handling code here:
		Login lg = new Login();
		lg.setVisible(true);
		this.dispose();
	}//GEN-LAST:event_pnLoginMouseClicked

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Register().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JButton btnRegister;
	private JLabel image;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel6;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JPanel pnLogin;
	private JTextField txtNama;
	private JTextField txtNohp;
	private JPasswordField txtPassword;
	private JTextField txtUsername;
	// End of variables declaration//GEN-END:variables
}
