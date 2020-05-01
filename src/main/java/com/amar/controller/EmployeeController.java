package com.amar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amar.dto.EmployeeDto;
import com.amar.manager.Employeeservice;

@RestController // Spring 4 indroduced RestController which is combination of @Controller and @ResponseBody
public class EmployeeController {
	
	
	@Autowired
	Employeeservice employeeService;
	
	@RequestMapping(value="/employee/{id}",produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_XML_VALUE})
	public EmployeeDto getMessage(@PathVariable Integer id)
	{
		
		return employeeService.getEmployee(id);
	}

}
