package com.tcs.Adminlogin.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tcs.Adminlogin.model.Admin;
import com.tcs.Adminlogin.repository.Adminrepository;
import com.tcs.Adminlogin.service.Adminservice;

@Service
public class Adminserviceimpl implements Adminservice {
	@Autowired
	Adminrepository ar;

	@Override
	public String addAdmindata(Admin a) {
		ar.save(a);
		return "Admin data added successfully";
	}

	@Override
	public List<Admin> getAdminList() {
		List<Admin> ad = (List<Admin>) ar.findAll();
		return ad;
	}

	@Override
	public Admin getAdmin(int id) {
		Optional<Admin> a = ar.findById(id);
		if (a.isPresent()) {
			Admin am = a.get();
			return am;
		} else {
			return null;
		}

	}

}
