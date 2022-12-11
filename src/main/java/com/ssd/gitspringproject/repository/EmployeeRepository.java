package com.ssd.gitspringproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssd.gitspringproject.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
