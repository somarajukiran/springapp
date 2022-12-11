package com.ssd.gitspringproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String address;
	private Long phNo;

	public Employee() {
		super();
	}

	public Employee(Long id, String name, String address, Long phNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phNo = phNo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhNo() {
		return phNo;
	}

	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", address=" + address + ", phNo=" + phNo + "]";
	}
	
	

}
