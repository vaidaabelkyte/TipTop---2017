package com.tipTopBites.securityConfiguration;

import org.springframework.data.repository.CrudRepository;

import com.tipTopBites.domain.security.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long>{

}
