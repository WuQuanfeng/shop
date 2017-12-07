package com.shopwork.user.dao;


import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.shopwork.entity.User;

@Repository("userDao")  
public class UserDaoImpl {
	@Resource
	private SessionFactory sessionFactory;

	public void saveUser(User u) {
		this.sessionFactory.getCurrentSession().save(u);
	}
	
	public User findById(String mail) {
		User u = this.sessionFactory.getCurrentSession().get(User.class, mail);
		return u;
	}
	
}
