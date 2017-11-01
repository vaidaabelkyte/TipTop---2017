package com.backEnd.domain.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Food {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String foodName;
	private String type;
	private String allergyType;
	private String category;
	private int numberOfCalories;

	
	private double price;
	private boolean active=true;
	
	@Column(columnDefinition="text")
	private String description;
		
	@Transient
	private MultipartFile foodImage;

	
}
