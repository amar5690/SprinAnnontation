package com.amar.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.amar.dto.EmployeeDto;

@Service
public class EmployeeServiceImpl implements Employeeservice {

	@Override
	public EmployeeDto getEmployee(Integer id) {


			List<EmployeeDto> employeeList=getEmployeeList();
			
			
//			for(EmployeeDto emp:employeeList)
//			{
//				if(emp.getId().equals(id))
//				{
//					return emp;
//				}
//				
//			}
			
			
			
			EmployeeDto emp=new EmployeeDto();
			
			emp.setId(1);
			emp.setName("amar");
		
		return emp;
	}
	
	public List<EmployeeDto> getEmployeeList()
	{
		
		List<EmployeeDto> list=new ArrayList<>();
		
		
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
