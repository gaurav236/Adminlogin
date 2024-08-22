package com.tcs.Adminlogin.service;

import java.util.List;

import com.tcs.Adminlogin.model.Admin;

public interface Adminservice {

	public String addAdmindata(Admin a);

	public List<Admin> getAdminList();

	public Admin getAdmin(int id);

}
