package com.etiya.springboot.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.springboot.business.abstracts.EmployeeService;
import com.etiya.springboot.core.utilities.results.DataResult;
import com.etiya.springboot.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employee")
public class EmployeesController {
	
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("/getbyemployee")
	public DataResult<List<Employee>> getAll() {
		
		return this.employeeService.getAll();
	}
	
	
	

}
