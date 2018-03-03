package com.tipTopBites.securityConfiguration;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tipTopBites.domain.security.Food;




public interface FoodRepository  extends CrudRepository<Food, Long>{
	List<Food> findByCategory(String category);
	
	List<Food> findByFoodNameContaining(String foodName);
	
	
	
	
}
