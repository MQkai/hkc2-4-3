package com.example.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.UserModel;
import com.example.service.UserService;



@Controller
@RequestMapping("/")
public class MainController {

	@Resource
	UserService userService;
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/index")
	public String MainController1() {
		return "index";
	}

	@GetMapping("/AdminLogin")
	public String Admin() {
		return "AdminLogin";
	}

	@GetMapping("/DataList")
	public String DataList() {
		return "DataList";
	}
	
	
	@PostMapping("/index")
		public String goToIndex(UserModel userModel,Model model){
			userService.insert(userModel);
			
		return "index";
			
		
	}
	
	@PostMapping("/AdminLogin")
	public String Adminlogin(){
	
	return "AdminLogin";
		
	
}

	@PostMapping("/home")
	public String home1(){
	
	return "home";
		
	
}
	@PostMapping("/DataList")
	public String Datalist(){
	
	return "DataList";
		
	
}
	
}
