package com.tipTopBites.securityConfiguration;

import org.springframework.data.repository.CrudRepository;

import com.tipTopBites.domain.security.DeliveryCart;

public interface DeliveryCartRepository extends CrudRepository<DeliveryCart, Long> {

}
