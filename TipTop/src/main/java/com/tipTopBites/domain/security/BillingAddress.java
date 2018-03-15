package com.tipTopBites.domain.security;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BillingAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String BillingName;
	private String BillingStreet1;
	private String BillingStreet2;
	private String BillingCity;
	private String BillingCountry;
	
	@OneToOne 
	private Order order;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBillingName() {
		return BillingName;
	}

	public void setBillingName(String billingName) {
		BillingName = billingName;
	}

	public String getBillingStreet1() {
		return BillingStreet1;
	}

	public void setBillingStreet1(String billingStreet1) {
		BillingStreet1 = billingStreet1;
	}

	public String getBillingStreet2() {
		return BillingStreet2;
	}

	public void setBillingStreet2(String billingStreet2) {
		BillingStreet2 = billingStreet2;
	}

	public String getBillingCity() {
		return BillingCity;
	}

	public void setBillingCity(String billingCity) {
		BillingCity = billingCity;
	}

	public String getBillingCountry() {
		return BillingCountry;
	}

	public void setBillingCountry(String billingCountry) {
		BillingCountry = billingCountry;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	

	
	

}
