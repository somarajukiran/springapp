package com.ssd.gitspringproject.servicei;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssd.gitspringproject.entity.Employee;

@Service
public interface  EmployeeServiceI {
	
	public Employee createEmployee(Employee emp);
	public List<Employee> getAllEmployee();

}
