package com.shopwork.user.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shopwork.entity.User;
import com.shopwork.user.dao.UserDaoImpl;

@Service
public class UserServiceImpl {
	@Resource
	UserDaoImpl userDaoImpl;
	
	public User login(String name, String password) {
		User u = userDaoImpl.findById(name);
		if(u != null) {
			if(u.getPassword().equals(password)) {
				return u;
			}else {return null;}
		}else {
			return null;
		}
	}
	
	public boolean isMailExisted(String mail) {
		User u = this.userDaoImpl.findById(mail);
		if(u == null) {
			return false;
		}
		return true;
	}
}
