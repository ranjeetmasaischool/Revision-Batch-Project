package com.example.demo.repositry;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Admin;

public interface AdminJpa extends JpaRepository<Admin, Integer>{

	
	
}
