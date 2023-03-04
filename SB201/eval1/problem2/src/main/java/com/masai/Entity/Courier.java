package com.masai.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Courier {
	@Id
	private int shipmentId;
	private String packageNumber;
	private String content;
	private double weight;
	private String senderAddress;
	private String recipientAddress;
	private LocalDateTime created_timestamp;
	
	public Courier() {
		
	}

	public Courier(int shipmentId, String packageNumber, String content, double weight, String senderAddress,
			String recipientAddress, LocalDateTime created_timestamp) {
		super();
		this.shipmentId = shipmentId;
		this.packageNumber = packageNumber;
		this.content = content;
		this.weight = weight;
		this.senderAddress = senderAddress;
		this.recipientAddress = recipientAddress;
		this.created_timestamp = created_timestamp;
	}

	@Override
	public String toString() {
		return "Courier [shipmentId=" + shipmentId + ", packageNumber=" + packageNumber + ", content=" + content
				+ ", weight=" + weight + ", senderAddress=" + senderAddress + ", recipientAddress=" + recipientAddress
				+ ", created_timestamp=" + created_timestamp + "]";
	}

	public int getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(int shipmentId) {
		this.shipmentId = shipmentId;
	}

	public String getPackageNumber() {
		return packageNumber;
	}

	public void setPackageNumber(String packageNumber) {
		this.packageNumber = packageNumber;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSenderAddress() {
		return senderAddress;
	}

	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public String getRecipientAddress() {
		return recipientAddress;
	}

	public void setRecipientAddress(String recipientAddress) {
		this.recipientAddress = recipientAddress;
	}

	public LocalDateTime getCreated_timestamp() {
		return created_timestamp;
	}

	public void setCreated_timestamp(LocalDateTime created_timestamp) {
		this.created_timestamp = created_timestamp;
	}
	
}
