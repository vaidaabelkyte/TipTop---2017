package com.tipTopBites.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tipTopBites.domain.security.CartItem;
import com.tipTopBites.domain.security.CartItemService;
import com.tipTopBites.domain.security.DeliveryCart;
import com.tipTopBites.domain.security.User;
import com.tipTopBites.domain.security.UserService;

@Controller
@RequestMapping("/deliveryCart")
public class DeliveryCartController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CartItemService cartItemService;
	
	@RequestMapping("/cart")
	public String deliveryCart(Model model, Principal principal) {
		User user = userService.findByUsername(principal.getName());
		DeliveryCart deliveryCart = user.getDeliveryCart();
		
		List<CartItem> cartItemList = cartItemService.findByDeliveryCart(deliveryCart);
		
		deliveryCartService.updateDeliveryCart(deliveryCart);
		
		model.addAttribute("cartItemList", cartItemList);
		model.addAttribute("deliveryCart", deliveryCart);
		
		return "deliveryCart";
	}
	
	

}
