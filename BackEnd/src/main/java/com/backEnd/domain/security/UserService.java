package com.backEnd.domain.security;


import java.util.Set;



public interface UserService {
	
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);
}
