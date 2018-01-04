package com.tipTopBites.securityConfiguration;

import org.springframework.data.repository.CrudRepository;

import com.tipTopBites.domain.security.Food;


public interface FoodRepository  extends CrudRepository<Food, Long>{

}
