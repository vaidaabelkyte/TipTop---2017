package com.tipTopBites;
import com.tipTopBites.domain.security.*;
import com.tipTopBites.securityConfiguration.SecurityUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class TipTopBitesApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(TipTopBitesApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setFirstName("vaida");
		user1.setLastName("abelkyte");
		user1.setUsername("v");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("a"));
		user1.setEmail("123@mail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1= new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));
		user1.setDeliveryCart(new DeliveryCart());
		
		userService.createUser(user1, userRoles);
	}
	
	
	//jhhjgugkhkgh
}
