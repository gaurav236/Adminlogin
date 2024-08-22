package com.tcs.Adminlogin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.Adminlogin.model.Admin;
@Repository
public interface Adminrepository extends CrudRepository<Admin, Integer> {

}
