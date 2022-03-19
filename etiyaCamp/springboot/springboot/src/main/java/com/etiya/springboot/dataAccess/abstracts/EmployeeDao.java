package com.etiya.springboot.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import com.etiya.springboot.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
}
