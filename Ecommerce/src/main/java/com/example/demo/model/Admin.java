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

import antlr.collections.List;
import lombok.Data;

@Entity
@Data
public class Admin {
	
	
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	private String name;
	private String mobileNo;
	private String password;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Category> catogry=new HashSet<>();
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Product> products=new HashSet<>();
	
	
}
