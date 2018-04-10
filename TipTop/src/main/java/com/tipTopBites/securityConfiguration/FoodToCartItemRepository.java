package com.tipTopBites.securityConfiguration;

import org.springframework.data.repository.CrudRepository;

import com.tipTopBites.domain.security.FoodToCartItem;

public interface FoodToCartItemRepository extends CrudRepository<FoodToCartItem, Long>{

}
