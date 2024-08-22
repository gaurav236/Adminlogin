package com.tcs.Adminlogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.Adminlogin.model.Admin;
import com.tcs.Adminlogin.service.Adminservice;

@RestController
public class Admincontroller {
	@Autowired
	Adminservice ad;

	@PostMapping(value = "/adm")
	public String addAdmin(@RequestBody Admin a) {
		if (a != null) {
			String msg = ad.addAdmindata(a);
			return msg;
		} else {
			return "please send valid data";
		}
	}

	@GetMapping(value = "/adm")
	public List<Admin> getAdmindata() {
		List<Admin> l = ad.getAdminList();
		return l;
	}
	
	@GetMapping(value = "/adm/{id}")
	public Admin getDatat(@PathVariable int id) {
		Admin a=ad.getAdmin(id);
		return a;
	}

}
