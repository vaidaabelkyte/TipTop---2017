package com.backEnd.domain.security;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DeliveryAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String DeliveryName;
	private String DeliveryStreet1;
	private String DeliveryStreet2;
	private String DeliveryCity;
	private String DeliveryCountry;
	
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeliveryName() {
		return DeliveryName;
	}

	public void setDeliveryName(String deliveryName) {
		DeliveryName = deliveryName;
	}

	public String getDeliveryStreet1() {
		return DeliveryStreet1;
	}

	public void setDeliveryStreet1(String deliveryStreet1) {
		DeliveryStreet1 = deliveryStreet1;
	}

	public String getDeliveryStreet2() {
		return DeliveryStreet2;
	}

	public void setDeliveryStreet2(String deliveryStreet2) {
		DeliveryStreet2 = deliveryStreet2;
	}

	public String getDeliveryCity() {
		return DeliveryCity;
	}

	public void setDeliveryCity(String deliveryCity) {
		DeliveryCity = deliveryCity;
	}

	public String getDeliveryCountry() {
		return DeliveryCountry;
	}

	public void setDeliveryCountry(String deliveryCountry) {
		DeliveryCountry = deliveryCountry;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}




	
}
