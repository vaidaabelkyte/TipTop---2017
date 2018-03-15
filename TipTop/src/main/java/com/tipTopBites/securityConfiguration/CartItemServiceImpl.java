package com.tipTopBites.securityConfiguration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tipTopBites.domain.security.CartItem;
import com.tipTopBites.domain.security.CartItemService;
import com.tipTopBites.domain.security.DeliveryCart;

@Service
public class CartItemServiceImpl implements CartItemService {
	
	@Autowired
	private CartItemRepository cartItemRepository;
	
	public List<CartItem> findByDeliveryCart(DeliveryCart deliveryCart) {
		
		return cartItemRepository.findByDeliveryCart(deliveryCart);
	}
	

}
