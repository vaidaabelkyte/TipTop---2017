package com.backEnd.securityConfiguration;

import org.springframework.data.repository.CrudRepository;

import com.backEnd.domain.security.Role;




public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
