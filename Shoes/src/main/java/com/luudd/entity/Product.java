package com.luudd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Product extends BaseEntity {
	@Id  
   	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int productId;
	@Column
	private int categoryId;
	@Column
	private String productName;
	@Column
	private String description;
	@Column
	private int productImageId;
	@Column
	private float price;
	@Column
	private double size;
	@Column
	private String genderFor;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public String getGenderFor() {
		return genderFor;
	}
	public void setGenderFor(String genderFor) {
		this.genderFor = genderFor;
	}
	public int getProductId() {
		return productId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public int getProductImageId() {
		return productImageId;
	}
	
	
	
}
