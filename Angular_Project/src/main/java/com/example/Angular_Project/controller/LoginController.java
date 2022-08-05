package com.example.Angular_Project.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Angular_Project.entity.Registration;
import com.example.Angular_Project.service.Employee_Service;

@RestController
@RequestMapping(value = "")
public class LoginController {
	@Autowired
	private Employee_Service service;
	@PostMapping(value="/login")
	public HashMap<String,Registration> login(@RequestBody Registration reg){
		HashMap<String,Registration> map=service.login(reg);
		return map;
		
	}
	

}
