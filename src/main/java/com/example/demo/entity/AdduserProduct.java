package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
 
@Entity
@Table(name = "AddUserProductDetails")
public class AdduserProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="ownerName")
    private String ownerName;
    
    @Column(name="phoneNumber")
    private long phoneNumber;
    
    @Column(name="ownerAdress")
    private String ownerAdress;
    
    @Column(name="vehicleName")
    private String vehicleName;
    
    @Column(name="price")
    private int price;
    
    @Column(name="vehicleImage")
    private String vehicleImage;
    
    @Column(name="category")
    private String category;
    
    @Column(name="VehicleDetails")
    private String vehicleDetails;

	public AdduserProduct(int id, String ownerName, long phoneNumber, String ownerAdress, String vehicleName, int price,
			String vehicleImage, String category, String vehicleDetails) {
		super();
		this.id = id;
		this.ownerName = ownerName;
		this.phoneNumber = phoneNumber;
		this.ownerAdress = ownerAdress;
		this.vehicleName = vehicleName;
		this.price = price;
		this.vehicleImage = vehicleImage;
		this.category = category;
		this.vehicleDetails = vehicleDetails;
	}
	public AdduserProduct() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getOwnerAdress() {
		return ownerAdress;
	}

	public void setOwnerAdress(String ownerAdress) {
		this.ownerAdress = ownerAdress;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getVehicleImage() {
		return vehicleImage;
	}

	public void setVehicleImage(String vehicleImage) {
		this.vehicleImage = vehicleImage;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(String vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}
    
    
    
    
    
}