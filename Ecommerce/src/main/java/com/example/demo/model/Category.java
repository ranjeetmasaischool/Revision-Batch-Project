package com.example.demo.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Category {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	private Integer name;
	private Integer totalNoOfProduct;
	
	
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "catogry")
	private Set<Admin> admin =new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Product> productsUnderCategry = new HashSet<>();
	
	
}
