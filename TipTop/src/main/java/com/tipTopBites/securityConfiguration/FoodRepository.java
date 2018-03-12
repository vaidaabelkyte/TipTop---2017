package com.tipTopBites.securityConfiguration;

import com.tipTopBites.domain.security.Food;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FoodRepository extends CrudRepository<Food, Long> {
    List<Food> findByCategory(String category);

    List<Food> findByFoodNameContaining(String foodName);

    List<Food> findByNumberOfCalories(String calories);
}
