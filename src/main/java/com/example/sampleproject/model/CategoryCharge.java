package com.example.sampleproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table (name = "CategoryCharge")

public class CategoryCharge {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int ID; 
	
	private String ProductCategory;
	
	private String Discount;
	private String GST;
	private String DeliveryCharge;
	
	@ManyToOne
    @JoinColumn(name = "ProductID")
    private Product product;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getProductCategory() {
		return ProductCategory;
	}
	public void setProductCategory(String productCategory) {
		ProductCategory = productCategory;
	}
	public String getDiscount() {
		return Discount;
	}
	public void setDiscount(String discount) {
		Discount = discount;
	}
	public String getGST() {
		return GST;
	}
	public void setGST(String gST) {
		GST = gST;
	}
	public String getDeliveryCharge() {
		return DeliveryCharge;
	}
	public void setDeliveryCharge(String deliveryCharge) {
		DeliveryCharge = deliveryCharge;
	}
	
	@Override
	public String toString() {
		return "CategoryCharges [ID=" + ID + ", ProductCategory=" + ProductCategory + ", Discount=" + Discount
				+ ", GST=" + GST + ", DeliveryCharge=" + DeliveryCharge + "]";
	}
	
	

}
