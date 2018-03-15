package com.tipTopBites.domain.security;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class FoodToOrderItem {

	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	
	
	@ManyToOne
	@JoinColumn(name="food_id")	
	private Food food;
	
	
	@ManyToOne
	@JoinColumn(name="order_item_id")	
	private OrderItem OrderItem;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Food getFood() {
		return food;
	}


	public void setFood(Food food) {
		this.food = food;
	}


	public OrderItem getOrderItem() {
		return OrderItem;
	}


	public void setOrderItem(OrderItem orderItem) {
		OrderItem = orderItem;
	}
	
	
	
	
}
