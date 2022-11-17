package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Product {
	
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	private String name;
	private String description;
	private double price;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Category catogry;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Admin admin;

}
