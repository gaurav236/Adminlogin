package com.tcs.Adminlogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		Admin a = ad.getAdmin(id);
		return a;
	}

	@DeleteMapping(value = "/adm/{id}")
	public String deleteAdmin(@PathVariable int id) {
		if (id != 0) {
			String msg = ad.deleteData(id);
			return msg;
		} else {
			return "please show valid data";
		}
	}
	
	@PutMapping(value="/adm")
	public Admin updateData(@RequestBody Admin am){
		Admin a = ad.getAdmin(am.getId());
		if(a.getId()==am.getId())
		{
			a.setName(am.getName());
			a.setUser(am.getUser());
			a.setPassword(am.getPassword());
			String msg=ad.updateAdmin(a);
			return a;
		}else {
		return null;
		}
		
	}

}
