package com.amar.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amar.model.Employee;

@Repository
public class EmployeeDaoImpl  implements EmployeeDao{
	
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public long saveEmployee(Employee employee) {
		
		sessionFactory.getCurrentSession().save(employee);
		
		return employee.getId();
	}

	@Override
	public Employee getEmployeeById(long id) {
		
	return	sessionFactory.getCurrentSession().get(Employee.class,id);
		
	}

}
