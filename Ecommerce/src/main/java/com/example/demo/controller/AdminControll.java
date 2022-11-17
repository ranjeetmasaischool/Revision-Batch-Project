package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Admin;
import com.example.demo.service.AdminService;

import antlr.collections.List;

@RestController
public class AdminControll {
	
	@Autowired
	private AdminService adminServ;
	
	@GetMapping("/test")
	public String test() {
		return "Work Fine..";
	}
	
	
	@PostMapping("/admin")
	public Admin addAdmin(@RequestBody Admin admin) {
		return adminServ.addAdmin(admin);
		
	}
	@GetMapping("/admin")
	public java.util.List<Admin> getAllAdmin(){
		return adminServ.getAllAdmin();
	}
	
	@GetMapping("/admin/{id}")
	public Admin getAdminById(@PathVariable("id") Integer adminId) {
		return adminServ.getAdminById(adminId);
	}

}
