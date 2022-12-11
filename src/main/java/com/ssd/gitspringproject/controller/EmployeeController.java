package com.ssd.gitspringproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssd.gitspringproject.entity.Employee;
import com.ssd.gitspringproject.servicei.EmployeeServiceI;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceI empservice;
	
	
	@PostMapping("/save")
	public ResponseEntity<Employee> saveemployee(Employee emp){
		
		Employee employee = empservice.createEmployee(emp);
		
		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);	
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployes(){
		
		return new ResponseEntity<List<Employee>>(empservice.getAllEmployee(),HttpStatus.OK);
	}

}
