package com.amar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amar.dao.EmployeeDao;
import com.amar.dto.EmployeeDto;
import com.amar.model.Employee;

@Service
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired 
	private EmployeeDao employeeDao;

	@Override
	public Employee getEmployee(long id) {
	
		return employeeDao.getEmployeeById(id);
	}
	
	public List<EmployeeDto> getEmployeeList()
	{
		
		List<EmployeeDto> list=new ArrayList();
		
		
		EmployeeDto emp=new EmployeeDto();
		
		emp.setId(1);
		emp.setName("amar");
		
		EmployeeDto emp1=new EmployeeDto();
		
		emp.setId(2);
		emp.setName("amarGope");
		
		
		list.add(emp1);
		
		list.add(emp);
		
		return list;
		
	}

}
