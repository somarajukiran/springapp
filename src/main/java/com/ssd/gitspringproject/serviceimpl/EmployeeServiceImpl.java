package com.ssd.gitspringproject.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssd.gitspringproject.entity.Employee;
import com.ssd.gitspringproject.repository.EmployeeRepository;
import com.ssd.gitspringproject.servicei.EmployeeServiceI;


@Service
public class EmployeeServiceImpl implements EmployeeServiceI{
	@Autowired
	public EmployeeRepository emprepository;

	@Override
	public Employee createEmployee(Employee emp) {
		Employee empentity=	emprepository.save(emp);
		return empentity;
	}

	@Override
	public List<Employee> getAllEmployee() {
	List<Employee> empList = emprepository.findAll();
		return empList;
	}

}
