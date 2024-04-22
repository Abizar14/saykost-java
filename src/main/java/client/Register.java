/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package client;

import services.auth.Authentication;

import javax.swing.*;

/**
 * @author ACER
 */
public class Register extends javax.swing.JFrame {

	int xx, xy;

	/**
	 * Creates new form Login
	 */
	public Register() {
		initComponents();
		image.setIcon(new javax.swing.ImageIcon("./img/SAY1.png"));
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
		txtUsername = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		btnRegister = new javax.swing.JButton();
		txtPassword = new javax.swing.JPasswordField();
		jLabel6 = new javax.swing.JLabel();
		txtNohp = new javax.swing.JTextField();
		txtNama = new javax.swing.JTextField();
		image = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		pnLogin = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();

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

		btnRegister.setBackground(new java.awt.Color(51, 51, 255));
		btnRegister.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
		btnRegister.setForeground(new java.awt.Color(255, 255, 255));
		btnRegister.setText("Register");
		btnRegister.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnRegisterActionPerformed(evt);
			}
		});

		txtPassword.setText("Password\n");
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

		jLabel6.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(0, 51, 204));
		jLabel6.setText("Buat Akun\n");

		txtNohp.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
		txtNohp.setText("No Hp");
		txtNohp.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				txtNohpFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				txtNohpFocusLost(evt);
			}
		});
		txtNohp.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtNohpActionPerformed(evt);
			}
		});

		txtNama.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
		txtNama.setText("Nama");
		txtNama.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				txtNamaFocusGained(evt);
			}

			public void focusLost(java.awt.event.FocusEvent evt) {
				txtNamaFocusLost(evt);
			}
		});
		txtNama.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtNamaActionPerformed(evt);
			}
		});

		image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		jPanel2.setBackground(new java.awt.Color(255, 255, 255));

		jLabel2.setText("Sudah Mempuntai Akun?");

		pnLogin.setBackground(new java.awt.Color(255, 255, 255));
		pnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				pnLoginMouseClicked(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(35, 77, 167));
		jLabel3.setText("Login");

		javax.swing.GroupLayout pnLoginLayout = new javax.swing.GroupLayout(pnLogin);
		pnLogin.setLayout(pnLoginLayout);
		pnLoginLayout.setHorizontalGroup(
				pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLoginLayout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel3)
								.addContainerGap())
		);
		pnLoginLayout.setVerticalGroup(
				pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabel3)
		);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addComponent(jLabel2)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabel2)
						.addComponent(pnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel1))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addGap(249, 249, 249)
												.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
														.addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
														.addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
														.addComponent(txtNohp, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
														.addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addGap(32, 32, 32)
																.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addGap(259, 259, 259)
												.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addGap(55, 55, 55)
																.addComponent(jLabel6)
																.addGap(68, 68, 68))
														.addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(282, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel1)
								.addGap(9, 9, 9)
								.addComponent(jLabel6)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(27, 27, 27)
								.addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(29, 29, 29)
								.addComponent(txtNohp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(28, 28, 28)
								.addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(28, Short.MAX_VALUE))
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
	private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
		try {
			String nohp = txtNohp.getText();
			String nama = txtNama.getText();
			String username = txtUsername.getText();
			String password = txtPassword.getText();

			String loginAdmin = Authentication.loginAdmin(username, password);
			String loginCustomer = Authentication.loginCustomer(username, password);

//          validate if the user is admin
			if (loginAdmin != null) {
				JOptionPane.showMessageDialog(null, "Kamu berhasil login " + loginAdmin);
				DashboardAdmin da = new DashboardAdmin();
				da.setVisible(true);
				this.dispose();
			}

//          validate if the user is customer
			else if (loginCustomer != null) {
				JOptionPane.showMessageDialog(null, "Kamu berhasil login " + loginCustomer);
				DashboardCustomer dc = new DashboardCustomer();
				dc.setVisible(true);
				this.dispose();
			} else {
				JOptionPane.showMessageDialog(null, "Kayaknya ada yang salah dari username atau password kamu, silahkan coba lagi!");
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

	private void txtNohpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNohpFocusGained
		// TODO add your handling code here:
		String nohp = txtNohp.getText();
		if (nohp.equals("No Hp")) {
			txtNohp.setText("");
		}
	}//GEN-LAST:event_txtNohpFocusGained

	private void txtNohpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNohpFocusLost
		// TODO add your handling code here:
		String nohp = txtNohp.getText();

		if (nohp.equals("") || nohp.equals("No Hp")) {
			txtNohp.setText("No Hp");
		}
	}//GEN-LAST:event_txtNohpFocusLost

	private void txtNohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNohpActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_txtNohpActionPerformed

	private void txtNamaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNamaFocusGained
		// TODO add your handling code here:
		String nama = txtNama.getText();
		if (nama.equals("Nama")) {
			txtNama.setText("");
		}
	}//GEN-LAST:event_txtNamaFocusGained

	private void txtNamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNamaFocusLost
		// TODO add your handling code here:
		String nama = txtNama.getText();

		if (nama.equals("") || nama.equals("Nama")) {
			txtNama.setText("Nama");
		}
	}//GEN-LAST:event_txtNamaFocusLost

	private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_txtNamaActionPerformed

	private void pnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLoginMouseClicked
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
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Register().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnRegister;
	private javax.swing.JLabel image;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel pnLogin;
	private javax.swing.JTextField txtNama;
	private javax.swing.JTextField txtNohp;
	private javax.swing.JPasswordField txtPassword;
	private javax.swing.JTextField txtUsername;
	// End of variables declaration//GEN-END:variables
}