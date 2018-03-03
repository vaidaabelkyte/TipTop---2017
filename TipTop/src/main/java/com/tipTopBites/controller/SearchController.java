package com.tipTopBites.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tipTopBites.domain.security.Food;
import com.tipTopBites.domain.security.FoodService;
import com.tipTopBites.domain.security.User;
import com.tipTopBites.domain.security.UserService;

@Controller
public class SearchController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private FoodService foodService;
	
	@RequestMapping("/searchByCategory")
	public String searchByCategory(
		@RequestParam("category") String category,
		Model model, Principal principal
	){
		if(principal!=null){
			String username = principal.getName();
			User user = userService.findByUsername(username);
			model.addAttribute("user", user);
		}
		
		String classActiveCategory = "active" + category;
		classActiveCategory =classActiveCategory.replaceAll("\\s+", "");
		classActiveCategory =classActiveCategory.replaceAll("&", "");
		model.addAttribute(classActiveCategory, true);
		
		List<Food> foodList = foodService.findByCategory(category);
		
		if (foodList.isEmpty()) {
			model.addAttribute("emptyList", true);
			return "menu";
		}
		
		model.addAttribute("foodList", foodList);
		
		return "menu";

	}
	
	@RequestMapping("/searchFood")
	public String searchFood (
			@ModelAttribute("keyword") String keyword,
			Principal principal, Model model
			
			) {
		if(principal!=null){
			String username = principal.getName();
			User user = userService.findByUsername(username);
			model.addAttribute("user", user);
		}
		List<Food> foodList = foodService.blurrySearch(keyword);
		
		if (foodList.isEmpty()) {
			model.addAttribute("emptyList", true);
			return "menu";
		}
		model.addAttribute("foodList", foodList);
		return "menu";
		
	}

}
