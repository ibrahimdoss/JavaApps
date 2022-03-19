package com.etiya.reCapProject.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.etiya.reCapProject.entities.abstracts.Customer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="credit_cards")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler"})

public class CreditCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int cardId;
	
	@Column(name="card_name")
	private String cardName;
	
	@Column(name="card_number")
	private String cardNumber;
	
	@Column(name="expiration")
	private String expiration;
	
	@Column(name="cvc")
	private String cvc;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	
}
