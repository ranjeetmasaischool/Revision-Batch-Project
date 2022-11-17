package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;
import com.example.demo.repositry.AdminJpa;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminJpa adminJpa;

	@Override
	public Admin addAdmin(Admin admin) {

		Admin savedAdmin = adminJpa.save(admin);
		return savedAdmin;

	}

	@Override
	public Admin getAdminById(Integer adminId) {

		Optional<Admin> findedAdmin = adminJpa.findById(adminId);

		return findedAdmin.get();

	}

	@Override
	public List<Admin> getAllAdmin() {
		List<Admin> findedAdmin = adminJpa.findAll();
		return findedAdmin;
	}

}
