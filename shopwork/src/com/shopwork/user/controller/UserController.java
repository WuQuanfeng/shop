package com.shopwork.user.controller;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shopwork.entity.User;
import com.shopwork.user.dao.UserDaoImpl;
import com.shopwork.user.service.UserServiceImpl;  
  
  
@Controller  
public class UserController {  
	
	@Resource
	private UserServiceImpl userServiceImpl;
      
    @PostMapping("/index")  
    public String login(@RequestParam("name") String name,
			@RequestParam("password") String password,
			Model model, HttpSession session){  
    	User u = userServiceImpl.login(name, password);
    	if(u != null) {
    		session.setAttribute("u", u);
    	}
        return "index";   
    }  
    
    @RequestMapping("/mailValidating")
    public @ResponseBody String mailValidating(@RequestParam(value="mail",required=true) String mail) {
    	boolean b = userServiceImpl.isMailExisted(mail);
    	String registError = null;
    	if(b) {
			registError = "mail unavailable";
    	}else {
			registError = "mail available";
    	}
    	return registError;
    }
    
}  