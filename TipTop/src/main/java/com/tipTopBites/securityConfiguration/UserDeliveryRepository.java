package com.tipTopBites.securityConfiguration;

import org.springframework.data.repository.CrudRepository;

import com.tipTopBites.domain.security.UserDelivery;

public interface UserDeliveryRepository extends CrudRepository<UserDelivery, Long> {

}
