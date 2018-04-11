package com.backEnd.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backEnd.domain.security.FoodService;

@RestController
public class ResourceController {
	
	@Autowired
	private FoodService foodService;
	
	@RequestMapping(value="/food/removeList", method=RequestMethod.POST)
	public String removeList(
			@RequestBody ArrayList<String> foodIdList, Model model
			) {
		for (String id : foodIdList) {
			String foodId=id.substring(8);
			foodService.removeOne(Long.parseLong(foodId));
		}
		return "delete success";
	}

}
