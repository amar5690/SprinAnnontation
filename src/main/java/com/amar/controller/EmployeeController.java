package com.amar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amar.manager.Employeeservice;

@RestController
public class EmployeeController {
	
	
	@Autowired
	Employeeservice employeeService;
	
	@RequestMapping("/hellow")
	public String getMessage()
	{
	
		return "hello world";
	}

}
