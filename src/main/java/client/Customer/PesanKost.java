/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package client.Customer;

import client.utils.Utils;
import services.boarding_houses.entities.BoardingHouseEntity;
import services.transaction.TransactionService;
import services.transaction.entities.TransactionEntity;
import services.user.dto.UserDto;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Bam
 */
public class PesanKost extends javax.swing.JPanel {
	UserDto session;
	BoardingHouseEntity boardingHouseEntity;
	int totalPrice;
	int qty;

	/**
	 * Creates new form
	 */
	public PesanKost(BoardingHouseEntity boardingHouseEntity, UserDto session) {
		this.boardingHouseEntity = boardingHouseEntity;
		this.session = session;
		initComponents();

		txtHarga.setText(integerToRupiah(boardingHouseEntity.getPrice()));
		txtNamaKost.setText(boardingHouseEntity.getName());

		SpinnerNumberModel spinnerModel = new SpinnerNumberModel();
		spinnerModel.setMinimum(0);

		spnSewa.setModel(spinnerModel);
		spnSewa.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				qty = (int) spnSewa.getValue();

				totalPrice = qty * boardingHouseEntity.getPrice();
				txtTotal.setText(integerToRupiah(qty * boardingHouseEntity.getPrice()));
			}
		});
	}

	public static String integerToRupiah(int number) {
		Locale myIndonesianLocale = new Locale("in", "ID");
		NumberFormat formater = NumberFormat.getCurrencyInstance(myIndonesianLocale);
		return formater.format(number);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		panelTambah = new javax.swing.JPanel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		txtNamaKost = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		txtHarga = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		txtTotal = new javax.swing.JTextField();
		spnSewa = new javax.swing.JSpinner();
		btnBatal = new javax.swing.JButton();
		btnBayar = new javax.swing.JButton();

		setBackground(new java.awt.Color(255, 255, 255));
		setPreferredSize(new java.awt.Dimension(688, 501));

		panelTambah.setBackground(new java.awt.Color(255, 255, 255));

		jLabel12.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
		jLabel12.setText("Menu > Kost > Pesan");

		jLabel13.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N

		jLabel21.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
		jLabel21.setText("Pesan Kost");

		txtNamaKost.setEditable(false);
		txtNamaKost.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
		txtNamaKost.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
		jLabel1.setText("Nama Kost");

		jLabel3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
		jLabel3.setText("Durasi Sewa / Bulan");

		jLabel4.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
		jLabel4.setText("Harga");

		txtHarga.setEditable(false);
		txtHarga.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
		txtHarga.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel5.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
		jLabel5.setText("Total");

		txtTotal.setEditable(false);
		txtTotal.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
		txtTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		spnSewa.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

		javax.swing.GroupLayout panelTambahLayout = new javax.swing.GroupLayout(panelTambah);
		panelTambah.setLayout(panelTambahLayout);
		panelTambahLayout.setHorizontalGroup(
				panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(panelTambahLayout.createSequentialGroup()
								.addGap(25, 25, 25)
								.addGroup(panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(txtTotal)
										.addGroup(panelTambahLayout.createSequentialGroup()
												.addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGap(527, 527, 527))
										.addGroup(panelTambahLayout.createSequentialGroup()
												.addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGap(533, 533, 533))
										.addComponent(txtHarga)
										.addComponent(txtNamaKost)
										.addGroup(panelTambahLayout.createSequentialGroup()
												.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 0, Short.MAX_VALUE))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTambahLayout.createSequentialGroup()
												.addGroup(panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(spnSewa)
														.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGap(489, 489, 489))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTambahLayout.createSequentialGroup()
												.addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(panelTambahLayout.createSequentialGroup()
																.addGap(220, 220, 220)
																.addComponent(jLabel13)
																.addGap(213, 213, 213))
														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTambahLayout.createSequentialGroup()
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jLabel12)
																.addGap(22, 22, 22)))))
								.addContainerGap())
											);
		panelTambahLayout.setVerticalGroup(
				panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(panelTambahLayout.createSequentialGroup()
								.addGap(10, 10, 10)
								.addComponent(jLabel13)
								.addGap(18, 18, 18)
								.addGroup(panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(27, 27, 27)
								.addComponent(jLabel1)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(txtNamaKost, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
								.addGap(12, 12, 12)
								.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(spnSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(txtHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
								.addGap(62, 62, 62))
										  );

		btnBatal.setBackground(new java.awt.Color(255, 0, 51));
		btnBatal.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
		btnBatal.setForeground(new java.awt.Color(255, 255, 255));
		btnBatal.setText("Batal");
		btnBatal.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnBatalMouseClicked(evt);
			}
		});

		btnBayar.setBackground(new java.awt.Color(0, 51, 153));
		btnBayar.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
		btnBayar.setForeground(new java.awt.Color(255, 255, 255));
		btnBayar.setText("Bayar");
		btnBayar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnBayarMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGap(68, 68, 68)
								.addComponent(btnBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(btnBatal, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
								.addGap(47, 47, 47))
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addGap(42, 42, 42)
										.addComponent(panelTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(42, 42, 42)))
								 );
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addContainerGap(389, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(72, 72, 72))
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(panelTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(84, Short.MAX_VALUE)))
							   );
	}// </editor-fold>//GEN-END:initComponents

	private void btnBatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseClicked
		// TODO add your handling code here:
		DetailCard detailcard = new DetailCard(boardingHouseEntity, session);

		DashboardCustomer.pn_utama.removeAll();
		DashboardCustomer.pn_utama.add(detailcard);
		DashboardCustomer.pn_utama.repaint();
		DashboardCustomer.pn_utama.revalidate();
	}//GEN-LAST:event_btnBatalMouseClicked

	private void btnBayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBayarMouseClicked
		// TODO add your handling code here:
		try {
			TransactionEntity transactionData = new TransactionEntity();
			transactionData.setBoardingHouseId(boardingHouseEntity.getId());
			transactionData.setRentalDuration(qty);
			transactionData.setTotalPrice(totalPrice);
			transactionData.setCustomerId(session.getId());
			System.out.println("id customer: " + session.getId());
			String createdTransaction = TransactionService.create(transactionData, session.getId());
			System.out.println(boardingHouseEntity.getId());
			if (!createdTransaction.contains("success")) {
				Utils.showMessageDialog("Something went wrong", createdTransaction, "./img/warning.gif", 210, 180);
				return;
			}
			Utils.showMessageDialog("Sukses", createdTransaction, "./img/success.gif", 100, 100);
		} catch (Exception e) {
			Utils.showMessageDialog("Something went wrong", e.getMessage(), "./img/warning.gif", 210, 180);
		}
	}//GEN-LAST:event_btnBayarMouseClicked


	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnBatal;
	private javax.swing.JButton btnBayar;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel panelTambah;
	private javax.swing.JSpinner spnSewa;
	private javax.swing.JTextField txtHarga;
	private javax.swing.JTextField txtNamaKost;
	private javax.swing.JTextField txtTotal;
	// End of variables declaration//GEN-END:variables
}
