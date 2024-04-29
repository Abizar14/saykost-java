/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package client;

import client.Admin.DashboardAdmin;
import client.Customer.DashboardCustomer;
import client.utils.Utils;
import services.auth.Authentication;
import services.user.dto.UserDto;

/**
 * @author ACER
 */
public class Login extends javax.swing.JFrame {

	int xx, xy;

	/**
	 * Creates new form Login
	 */
	public Login() {
		initComponents();
		image.setIcon(new javax.swing.ImageIcon("./img/yee.png"));
		img.setIcon(new javax.swing.ImageIcon("./img/SAY2.png"));
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		img = new javax.swing.JLabel();
		txtUsername = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		image = new javax.swing.JLabel();
		btnLogin = new javax.swing.JButton();
		txtPassword = new javax.swing.JPasswordField();
		jLabel4 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jPanel4 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		pnregister = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent evt) {
				formMouseDragged(evt);
			}
		});
		addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				formMousePressed(evt);
			}
		});
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		img.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
		img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		txtUsername.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
		txtUsername.setText("Username");
		txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				txtUsernameFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				txtUsernameFocusLost(evt);
			}
		});
		txtUsername.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtUsernameActionPerformed(evt);
			}
		});

		jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel1MouseClicked(evt);
			}
		});

		image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		btnLogin.setBackground(new java.awt.Color(51, 51, 255));
		btnLogin.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
		btnLogin.setForeground(new java.awt.Color(255, 255, 255));
		btnLogin.setText("Login");
		btnLogin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnLoginActionPerformed(evt);
			}
		});

		txtPassword.setText("Password");
		txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				txtPasswordFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				txtPasswordFocusLost(evt);
			}
		});
		txtPassword.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtPasswordActionPerformed(evt);
			}
		});

		jLabel6.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(0, 51, 204));
		jLabel6.setText("SELAMAT DATANG DI SAYKOST");

		jPanel2.setBackground(new java.awt.Color(255, 255, 255));
		jPanel2.setForeground(new java.awt.Color(255, 255, 255));

		jPanel4.setBackground(new java.awt.Color(255, 255, 255));
		jPanel4.setRequestFocusEnabled(false);

		jLabel2.setText("Belum Mempunyai Akun? ");

		pnregister.setBackground(new java.awt.Color(255, 255, 255));
		pnregister.setRequestFocusEnabled(false);
		pnregister.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				pnregisterMouseClicked(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(35, 77, 167));
		jLabel5.setText("Register");

		javax.swing.GroupLayout pnregisterLayout = new javax.swing.GroupLayout(pnregister);
		pnregister.setLayout(pnregisterLayout);
		pnregisterLayout.setHorizontalGroup(
				pnregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnregisterLayout.createSequentialGroup()
								.addGap(0, 0, Short.MAX_VALUE)
								.addComponent(jLabel5))
										   );
		pnregisterLayout.setVerticalGroup(
				pnregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
										 );

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(
				jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
								.addContainerGap(141, Short.MAX_VALUE)
								.addComponent(pnregister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(12, 12, 12))
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel4Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel2)
										.addContainerGap(55, Short.MAX_VALUE)))
										);
		jPanel4Layout.setVerticalGroup(
				jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel4Layout.createSequentialGroup()
								.addComponent(pnregister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap())
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel4Layout.createSequentialGroup()
										.addGap(4, 4, 4)
										.addComponent(jLabel2)
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
									  );

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap())
										);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))
									  );

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addContainerGap(47, Short.MAX_VALUE)
												.addComponent(jLabel4)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
												.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
																.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
																		.addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(2, 2, 2))
														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
																.addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(30, 30, 30))
														.addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
												.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
																.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(27, 27, 27))
														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
																.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
								.addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel1))
										);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addComponent(jLabel1)
																.addGap(90, 90, 90))
														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
																.addComponent(jLabel6)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
												.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18)
												.addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(39, 39, 39)
												.addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 92, Short.MAX_VALUE)))
								.addContainerGap())
									  );

		getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 470));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * Handles the event when the mouse is pressed on the form.
	 *
	 * @param evt the MouseEvent object representing the mouse press event
	 */
	private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
		xx = evt.getX();
		xy = evt.getY();

	}//GEN-LAST:event_formMousePressed

	/**
	 * Handles the event when the mouse is dragged on the form.
	 *
	 * @param evt the MouseEvent object representing the mouse drag event
	 */
	private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
		int x = evt.getXOnScreen();
		int y = evt.getYOnScreen();
		this.setLocation(x - xx, y - xy);
	}//GEN-LAST:event_formMouseDragged

	/**
	 * Handles the event when the mouse is clicked on jLabel1, which will close the form.
	 *
	 * @param evt the MouseEvent object representing the mouse click event
	 */
	private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
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
	private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
		try {
			String username = txtUsername.getText();
			String password = String.valueOf(txtPassword.getPassword());

			UserDto user = Authentication.loginUser(username, password);
			if (user.getRole() == null) {
				Utils.showMessageDialog("Something went wrong", "Invalid Username and Password, try again!", "./img" +
								"/warning.gif", 120,
						120);
			} else {
				Utils.showMessageDialog("Success", "Selamat Datang " + user.getFullName(), "./img/success.gif", 100, 100);
				if (user.getRole().equals("admin")) {
					new DashboardAdmin().setVisible(true);
					dispose();
				} else if (user.getRole().equals("customer")) {
					new DashboardCustomer().setVisible(true);
					dispose();
				}
			}
		} catch (Exception e) {
			Utils.showMessageDialog("Something went wrong", e.getMessage(), "./img/doraemon-sad.gif", 210, 180);
		}
	}//GEN-LAST:event_btnLoginActionPerformed

	/**
	 * Handles the event when the username text field gains focus.
	 *
	 * @param evt the FocusEvent object representing the focus event
	 */
	private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
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
	private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
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
	private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_txtPasswordActionPerformed

	/**
	 * Handles the event when the password text field gains focus.
	 *
	 * @param evt the FocusEvent object representing the focus event
	 */
	private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
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
	private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
		String password = txtPassword.getText();

		if (password.equals("") || password.equals("Password")) {
			txtPassword.setText("Password");
		}
	}//GEN-LAST:event_txtPasswordFocusLost


	private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_txtUsernameActionPerformed

	private void pnregisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnregisterMouseClicked
		// TODO add your handling code here:
		Register rg = new Register();
		rg.setVisible(true);
		this.dispose();
	}//GEN-LAST:event_pnregisterMouseClicked

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
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Login().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnLogin;
	private javax.swing.JLabel image;
	private javax.swing.JLabel img;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel pnregister;
	private javax.swing.JPasswordField txtPassword;
	private javax.swing.JTextField txtUsername;
	// End of variables declaration//GEN-END:variables
}
