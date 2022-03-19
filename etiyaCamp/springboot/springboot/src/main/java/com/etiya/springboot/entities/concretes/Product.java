package com.etiya.springboot.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name=" products")
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","category"})

public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private int  id;
	
	//@Column(name="category_id")
	//private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
	@Column(name="units_in_stock")
	private int unitsInStock;
	
	//birden fazla products bir categoriye gider.
	//şeklinde bağlıyoruz.
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="category_id")
	private Category category;
}	
