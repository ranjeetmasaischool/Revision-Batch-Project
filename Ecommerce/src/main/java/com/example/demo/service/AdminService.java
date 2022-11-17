package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Admin;



public interface AdminService {
	
	
	public Admin addAdmin(Admin admin);
	public Admin getAdminById(Integer adminId);
	public List<Admin> getAllAdmin();

}
