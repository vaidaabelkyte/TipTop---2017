package com.backEnd.domain.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backEnd.securityConfiguration.FoodRepository;

@Service
public class FoodServiceImpl implements FoodService {

	@Autowired
	private FoodRepository foodRepository;
	
	public Food save(Food food){
		return foodRepository.save(food);
	}
	
	public List<Food> findAll() {
		return (List<Food>) foodRepository.findAll();
	}
	
	public Food findOne(Long id) {
		return foodRepository.findOne(id);
		
	}
	
	 public void removeOne(Long id) {
		 foodRepository.delete(id);
	 }
}


