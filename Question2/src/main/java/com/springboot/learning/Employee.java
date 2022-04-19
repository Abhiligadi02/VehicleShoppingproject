package com.springboot.learning;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long ID;
	@Column(name="product_ID")
	private String productID;
	@Column(name="product_name")
	private String productname;
	@Column(name="product_cat")
	private String productcat;
	public Employee() {
		
	}
public Employee(long iD, String productID, String productname, String productcat) {
		super();
		ID = iD;
		this.productID = productID;
		this.productname = productname;
		this.productcat = productcat;
	}
 
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductcat() {
		return productcat;
	}
	public void setProductcat(String productcat) {
		this.productcat = productcat;
	}

}
