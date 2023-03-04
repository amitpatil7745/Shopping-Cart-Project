package com.example.sampleproject.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private int ProductID;
		private String ProductName;
		private String productType;
		private String ProductCategory;
		private String ProductPrice;
		
		@OneToOne(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
		
		private CategoryCharge categoryCharge;
		
		
		public int getProductID() {
			return ProductID;
		}
		public void setProductID(int productID) {
			ProductID = productID;
		}
		public String getProductName() {
			return ProductName;
		}
		public void setProductName(String productName) {
			ProductName = productName;
		}
		public String getProductType() {
			return productType;
		}
		public void setProductType(String productType) {
			this.productType = productType;
		}
		public String getProductCategory() {
			return ProductCategory;
		}
		public void setProductCategory(String productCategory) {
			ProductCategory = productCategory;
		}
		public String getProductPrice() {
			return ProductPrice;
		}
		public void setProductPrice(String productPrice) {
			ProductPrice = productPrice;
		}
		
		
		public CategoryCharge getCategoryCharge() {
			return categoryCharge;
		}
		public void setCategoryCharge(CategoryCharge charge) {
			this.categoryCharge = charge;
		}
		
		@Override
		public String toString() {
			return "Product [ProductID=" + ProductID + ", ProductName=" + ProductName + ", productType=" + productType
					+ ", ProductCategory=" + ProductCategory + ", ProductPrice=" + ProductPrice + "]";
		}
		
		

	}



