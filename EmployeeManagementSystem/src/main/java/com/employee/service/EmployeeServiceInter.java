package com.employee.service;

import com.employee.exception.EmployeeException;
import com.employee.model.Employee;

public interface EmployeeServiceInter {
	
	public Employee saveEmployee(Employee employee) throws EmployeeException;
	
}
