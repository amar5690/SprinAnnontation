package com.amar.dao;

import com.amar.model.Employee;

public interface EmployeeDao {

	long saveEmployee(Employee employee);

	Employee getEmployeeById(long id);

}
