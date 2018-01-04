package com.tipTopBites.securityConfiguration;

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

	
}
