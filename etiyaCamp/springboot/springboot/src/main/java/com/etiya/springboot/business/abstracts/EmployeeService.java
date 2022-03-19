package com.etiya.springboot.business.abstracts;

import java.util.List;

import com.etiya.springboot.core.utilities.results.DataResult;
import com.etiya.springboot.entities.concretes.Employee;

public interface EmployeeService {
	
	DataResult<List<Employee>> getAll();
}
