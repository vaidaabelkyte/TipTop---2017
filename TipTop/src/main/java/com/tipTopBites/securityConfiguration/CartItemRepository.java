package com.tipTopBites.securityConfiguration;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tipTopBites.domain.security.CartItem;
import com.tipTopBites.domain.security.DeliveryCart;

public interface CartItemRepository extends CrudRepository<CartItem, Long>{
	List<CartItem> findByDeliveryCart(DeliveryCart deliveryCart);

}
