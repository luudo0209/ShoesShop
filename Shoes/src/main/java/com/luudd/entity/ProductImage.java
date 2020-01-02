package com.luudd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ProductImage extends BaseEntity {
	
	@Id  
   	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int productImageId;
	@Column
	private String image;
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getProductImageId() {
		return productImageId;
	}
	
}
