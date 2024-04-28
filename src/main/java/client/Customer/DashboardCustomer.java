/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package client.Customer;

import client.Login;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.*;
import services.boarding_houses.BoardingHouseService;
import services.boarding_houses.entities.BoardingHouseEntity;

/**
 * @author ACER
 */
public class DashboardCustomer extends javax.swing.JFrame {
    ArrayList<BoardingHouseEntity> listOfKos;

	/**
	 * Creates new form DashboardUser
	 */
	public DashboardCustomer() {
		initComponents();
                // ngisi data
                listOfKos = BoardingHouseService.getDataToEntity();
                lbl_icon.setIcon(new javax.swing.ImageIcon("./img/icons8_home_50px.png"));
                iconkost.setIcon(new javax.swing.ImageIcon("./img/Apartment.png"));
                iconlogout.setIcon(new javax.swing.ImageIcon("./img/Logout.png"));
                icontransaksi.setIcon(new javax.swing.ImageIcon("./img/Transaction.png"));
                
                
                
                Kost kost = new Kost();
                
                pn_utama.add(kost);
                pn_utama.repaint();
                pn_utama.revalidate();  
                
             
            
	}
        
       

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_kiri1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbl_icon = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnMenu_Kost = new javax.swing.JPanel();
        pnLine = new javax.swing.JPanel();
        btnDashboard = new javax.swing.JLabel();
        iconkost = new javax.swing.JLabel();
        pnMenu_Transaksi = new javax.swing.JPanel();
        pnLineTransaksi = new javax.swing.JPanel();
        btnTransaksi = new javax.swing.JLabel();
        icontransaksi = new javax.swing.JLabel();
        pnLogout = new javax.swing.JPanel();
        pnLineUser_Logout = new javax.swing.JPanel();
        btnLogout = new javax.swing.JLabel();
        iconlogout = new javax.swing.JLabel();
        pn_kanan = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pn_dasar = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_kiri1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel2.setText("SayKost");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Menu");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("User");

        pnMenu_Kost.setBackground(new java.awt.Color(255, 255, 255));

        pnLine.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnLineLayout = new javax.swing.GroupLayout(pnLine);
        pnLine.setLayout(pnLineLayout);
        pnLineLayout.setHorizontalGroup(
            pnLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pnLineLayout.setVerticalGroup(
            pnLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnDashboard.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnDashboard.setText("Kost");
        btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDashboardMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnMenu_KostLayout = new javax.swing.GroupLayout(pnMenu_Kost);
        pnMenu_Kost.setLayout(pnMenu_KostLayout);
        pnMenu_KostLayout.setHorizontalGroup(
            pnMenu_KostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMenu_KostLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconkost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(pnLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnMenu_KostLayout.setVerticalGroup(
            pnMenu_KostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenu_KostLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(iconkost, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(btnDashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnMenu_Transaksi.setBackground(new java.awt.Color(255, 255, 255));

        pnLineTransaksi.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnLineTransaksiLayout = new javax.swing.GroupLayout(pnLineTransaksi);
        pnLineTransaksi.setLayout(pnLineTransaksiLayout);
        pnLineTransaksiLayout.setHorizontalGroup(
            pnLineTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pnLineTransaksiLayout.setVerticalGroup(
            pnLineTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnTransaksi.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnTransaksi.setText("Transaksi");
        btnTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTransaksiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTransaksiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTransaksiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnMenu_TransaksiLayout = new javax.swing.GroupLayout(pnMenu_Transaksi);
        pnMenu_Transaksi.setLayout(pnMenu_TransaksiLayout);
        pnMenu_TransaksiLayout.setHorizontalGroup(
            pnMenu_TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMenu_TransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icontransaksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTransaksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(pnLineTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnMenu_TransaksiLayout.setVerticalGroup(
            pnMenu_TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenu_TransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnLineTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(icontransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(btnTransaksi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnLogout.setBackground(new java.awt.Color(255, 255, 255));

        pnLineUser_Logout.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnLineUser_LogoutLayout = new javax.swing.GroupLayout(pnLineUser_Logout);
        pnLineUser_Logout.setLayout(pnLineUser_LogoutLayout);
        pnLineUser_LogoutLayout.setHorizontalGroup(
            pnLineUser_LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pnLineUser_LogoutLayout.setVerticalGroup(
            pnLineUser_LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnLogout.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnLogoutLayout = new javax.swing.GroupLayout(pnLogout);
        pnLogout.setLayout(pnLogoutLayout);
        pnLogoutLayout.setHorizontalGroup(
            pnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconlogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(pnLineUser_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnLogoutLayout.setVerticalGroup(
            pnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnLineUser_Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(iconlogout, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pn_kiri1Layout = new javax.swing.GroupLayout(pn_kiri1);
        pn_kiri1.setLayout(pn_kiri1Layout);
        pn_kiri1Layout.setHorizontalGroup(
            pn_kiri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiri1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pn_kiri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(pn_kiri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addGroup(pn_kiri1Layout.createSequentialGroup()
                            .addComponent(lbl_icon)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2))
                        .addComponent(pnMenu_Kost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnMenu_Transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pn_kiri1Layout.setVerticalGroup(
            pn_kiri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiri1Layout.createSequentialGroup()
                .addGroup(pn_kiri1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_kiri1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lbl_icon))
                    .addGroup(pn_kiri1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(pnMenu_Kost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnMenu_Transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(pnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pn_kiri1, java.awt.BorderLayout.LINE_START);

        pn_kanan.setBackground(new java.awt.Color(255, 255, 255));
        pn_kanan.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pn_kanan.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pn_utama.setBackground(new java.awt.Color(255, 255, 255));
        pn_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_dasarLayout = new javax.swing.GroupLayout(pn_dasar);
        pn_dasar.setLayout(pn_dasarLayout);
        pn_dasarLayout.setHorizontalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_dasarLayout.setVerticalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pn_kanan.add(pn_dasar, java.awt.BorderLayout.CENTER);

        getContentPane().add(pn_kanan, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseClicked
        // TODO add your handling code here:
        pnMenu_Kost.setBackground(new Color(250, 250, 250));
        pnLine.setBackground(new Color(0, 51, 153));

        pn_utama.removeAll();
        pn_utama.add(new Kost());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_btnDashboardMouseClicked

    private void btnDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseEntered
        // TODO add your handling code here:
        pnMenu_Kost.setBackground(new Color(250, 250, 250));
        pnLine.setBackground(new Color(0, 51, 153));
    }//GEN-LAST:event_btnDashboardMouseEntered

    private void btnDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseExited
        // TODO add your handling code here:
        pnMenu_Kost.setBackground(new Color(255, 255, 255));
        pnLine.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnDashboardMouseExited

    private void btnTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransaksiMouseClicked
        // TODO add your handling code here:
         pnMenu_Transaksi.setBackground(new Color(250, 250, 250));
        pnLineTransaksi.setBackground(new Color(0, 51, 153));

        pn_utama.removeAll();
        pn_utama.add(new Transaksi());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_btnTransaksiMouseClicked

    private void btnTransaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransaksiMouseEntered
        // TODO add your handling code here:
        pnMenu_Transaksi.setBackground(new Color(250, 250, 250));
        pnLineTransaksi.setBackground(new Color(0, 51, 153));
    }//GEN-LAST:event_btnTransaksiMouseEntered

    private void btnTransaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransaksiMouseExited
        // TODO add your handling code here:
        pnMenu_Transaksi.setBackground(new Color(255, 255, 255));
        pnLineTransaksi.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnTransaksiMouseExited

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(null, "Anda Yakin Akan Logout ?");
		if (choice == JOptionPane.YES_OPTION) {
			this.dispose();

			Login loginFrame = new Login();
			loginFrame.setVisible(true);
		}
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        // TODO add your handling code here:
        pnLogout.setBackground(new Color(250, 250, 250));
        pnLineUser_Logout.setBackground(new Color(0, 51, 153));
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited
        // TODO add your handling code here:
        pnLogout.setBackground(new Color(255, 255, 255));
        pnLineUser_Logout.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnLogoutMouseExited

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
			java.util.logging.Logger.getLogger(DashboardCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(DashboardCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(DashboardCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(DashboardCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new DashboardCustomer().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDashboard;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel btnTransaksi;
    private javax.swing.JLabel iconkost;
    private javax.swing.JLabel iconlogout;
    private javax.swing.JLabel icontransaksi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JPanel pnLine;
    private javax.swing.JPanel pnLineTransaksi;
    private javax.swing.JPanel pnLineUser_Logout;
    private javax.swing.JPanel pnLogout;
    private javax.swing.JPanel pnMenu_Kost;
    private javax.swing.JPanel pnMenu_Transaksi;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JPanel pn_kanan;
    private javax.swing.JPanel pn_kiri1;
    public static javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables
}