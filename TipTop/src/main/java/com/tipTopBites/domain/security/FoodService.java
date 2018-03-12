package com.tipTopBites.domain.security;

import java.util.List;

public interface FoodService {

    List<Food> findAll();

    Food findOne(Long id);

    List<Food> findByCategory(String category);

    List<Food> blurrySearch(String foodName);

    List<Food> findByNumberOfCalories(String calories);
}
