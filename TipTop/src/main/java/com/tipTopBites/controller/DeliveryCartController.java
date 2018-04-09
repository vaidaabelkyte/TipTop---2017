package com.tipTopBites.controller;

import com.tipTopBites.domain.security.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/deliveryCart")
public class DeliveryCartController {
	private static Logger logger = LoggerFactory.getLogger(DeliveryCartController.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CartItemService cartItemService;
	
	@Autowired
	DeliveryCartService deliveryCartService;
	
	@RequestMapping(value = "/cart")
	public String deliveryCart(Model model, Principal principal) {


		User user = userService.findByUsername(principal.getName());
		DeliveryCart deliveryCart = user.getDeliveryCart();  //null

		List<CartItem> cartItemList = cartItemService.findByDeliveryCart(deliveryCart);


		
		deliveryCartService.updateDeliveryCart(deliveryCart);
		
		model.addAttribute("cartItemList", cartItemList);
		model.addAttribute("deliveryCart", deliveryCart);
		
		return "deliveryCart";
	}
	
	

}
