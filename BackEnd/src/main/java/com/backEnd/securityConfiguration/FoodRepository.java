package com.backEnd.securityConfiguration;

import org.springframework.data.repository.CrudRepository;

import com.backEnd.domain.security.Food;

public interface FoodRepository extends CrudRepository<Food, Long> {

}
