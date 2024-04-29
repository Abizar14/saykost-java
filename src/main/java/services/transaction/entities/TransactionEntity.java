package services.transaction.entities;

import java.sql.Timestamp;

public class TransactionEntity {

	private int id;
	private int rentalDuration;
	private int totalPrice;
	private Timestamp createdAt;
	private int boardingHouseId;
	private int customerId;

	public TransactionEntity(int rentalDuration, int totalPrice, Timestamp createdAt, int boardingHouseId, int customerId) {
		this.rentalDuration = rentalDuration;
		this.totalPrice = totalPrice;
		this.createdAt = createdAt;
		this.boardingHouseId = boardingHouseId;
		this.customerId = customerId;
	}

	public TransactionEntity() {

	}

	public int getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public int getBoardingHouseId() {
		return boardingHouseId;
	}

	public void setBoardingHouseId(int boardingHouseId) {
		this.boardingHouseId = boardingHouseId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}
