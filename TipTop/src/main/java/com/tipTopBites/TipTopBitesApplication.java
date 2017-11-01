package com.tipTopBites;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tipTopBites.domain.security.Role;
import com.tipTopBites.domain.security.User;
import com.tipTopBites.domain.security.UserRole;
import com.tipTopBites.domain.security.UserService;
import com.tipTopBites.securityConfiguration.SecurityUtility;

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
		
		userService.createUser(user1, userRoles);
	}
	
	
	//jhhjgugkhkgh
}
