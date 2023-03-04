package com.example.sampleproject.model;

import org.springframework.stereotype.Component;

@Component
public class ProductRes {
	
		private int ProductID;
		private String ProductName;
		private String productType;
		private String ProductCategory;
		private String ProductPrice;
		private String FinalPrice;
		
		
		private CategoryCharge categoryCharge;
		
		public ProductRes() {
			
		}
		
		public ProductRes(Product pro){
			
			this.ProductID = pro.getProductID();
			this.ProductName = pro.getProductName();
			this.productType = pro.getProductType();
			this.ProductCategory = pro.getProductCategory();
			this.ProductPrice = pro.getProductPrice();		
			this.categoryCharge = pro.getCategoryCharge();
			this.FinalPrice = this.calFinalValue();
		}
		
		private String calFinalValue(){
			
			double Discount =Double.parseDouble(this.categoryCharge.getDiscount());
			double GST = Double.parseDouble(this.categoryCharge.getGST());
			double DeliveryCharge = Double.parseDouble(this.categoryCharge.getDeliveryCharge());
			Double finalValue= Double.parseDouble(this.ProductPrice);
			final double price = finalValue;
			
			finalValue = finalValue-((price*Discount)/100);
			finalValue = finalValue+(price*GST/100);
			finalValue = finalValue+DeliveryCharge;
				
			return finalValue.toString();
		}
		
		
		
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
		
		
		
		public String getFinalPrice() {
			return FinalPrice;
		}

		public void setFinalPrice(String finalPrice) {
			FinalPrice = finalPrice;
		}

		@Override
		public String toString() {
			return "Product [ProductID=" + ProductID + ", ProductName=" + ProductName + ", productType=" + productType
					+ ", ProductCategory=" + ProductCategory + ", ProductPrice=" + ProductPrice + "]";
		}
		
		

	}



