package com.tipTopBites.securityConfiguration;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tipTopBites.domain.security.CartItem;
import com.tipTopBites.domain.security.CartItemService;
import com.tipTopBites.domain.security.DeliveryCart;
import com.tipTopBites.domain.security.DeliveryCartService;

@Service
public class DeliveryCartServiceImpl implements DeliveryCartService{
	
	@Autowired
	private CartItemService cartItemService;
	
	@Autowired
	private DeliveryCartRepository deliveryCartRepository;
	
	
	
	
	public DeliveryCart updateDeliveryCart(DeliveryCart deliveryCart) {
		BigDecimal cartTotal = new BigDecimal(0);
		
		List<CartItem> cartItemList = cartItemService.findByDeliveryCart(deliveryCart);
		
		
		for (CartItem cartItem : cartItemList) {
			if(cartItem.getFood().getId()>0) {
				cartItemService.updateCartItem(cartItem);
				cartTotal = cartTotal.add(cartItem.getSubtotal());
				
			}

		}
		
	deliveryCart.setGrandTotal(cartTotal);
		deliveryCartRepository.save(deliveryCart);
		return deliveryCart;
		
		
		
	}

}
