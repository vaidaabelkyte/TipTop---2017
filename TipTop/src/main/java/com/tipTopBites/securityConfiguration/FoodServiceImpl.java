package com.tipTopBites.securityConfiguration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tipTopBites.domain.security.Food;
import com.tipTopBites.domain.security.FoodService;


@Service
public class FoodServiceImpl implements FoodService{
	@Autowired
	private FoodRepository foodRepository;
	
	public List<Food> findAll() {
		return (List<Food>) foodRepository.findAll();
	}

	public Food findOne(Long id) {
		return foodRepository.findOne(id);
	}
	
	public List<Food> findByCategory(String category)
	 {
		List<Food> foodList = foodRepository.findByCategory(category);
		
		List<Food> activeFoodList = new ArrayList<>();
		
		for (Food food: foodList) {
			if(food.isActive()) {
				activeFoodList.add(food);
				
			}
		}
		
		return activeFoodList;
	}
	
		public List<Food> blurrySearch(String foodName) {
		
		List <Food> foodList = foodRepository.findByFoodNameContaining(foodName);
		List<Food> activeFoodList = new ArrayList<>();
		
		for (Food food: foodList) {
			if(food.isActive()) {
				activeFoodList.add(food);
				
			}
		
	}
		return activeFoodList;
		}
}
