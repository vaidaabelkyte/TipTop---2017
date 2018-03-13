package com.tipTopBites.domain.security;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserDelivery {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String userDeliveryName;
	private String userDeliveryStreet1;
	private String userDeliveryStreet2;
	private String userDeliveryCity;
	private String userDeliveryArea;
	private String userDeliveryCountry;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserDeliveryName() {
		return userDeliveryName;
	}

	public void setUserDeliveryName(String userDeliveryName) {
		this.userDeliveryName = userDeliveryName;
	}

	public String getUserDeliveryStreet1() {
		return userDeliveryStreet1;
	}

	public void setUserDeliveryStreet1(String userDeliveryStreet1) {
		this.userDeliveryStreet1 = userDeliveryStreet1;
	}

	public String getUserDeliveryStreet2() {
		return userDeliveryStreet2;
	}

	public void setUserDeliveryStreet2(String userDeliveryStreet2) {
		this.userDeliveryStreet2 = userDeliveryStreet2;
	}

	public String getUserDeliveryCity() {
		return userDeliveryCity;
	}
	
	

	public String getUserDeliveryArea() {
		return userDeliveryArea;
	}

	public void setUserDeliveryArea(String userDeliveryArea) {
		this.userDeliveryArea = userDeliveryArea;
	}

	public void setUserDeliveryCity(String userDeliveryCity) {
		this.userDeliveryCity = userDeliveryCity;
	}

	public String getUserDeliveryCountry() {
		return userDeliveryCountry;
	}

	public void setUserDeliveryCountry(String userDeliveryCountry) {
		this.userDeliveryCountry = userDeliveryCountry;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
}
