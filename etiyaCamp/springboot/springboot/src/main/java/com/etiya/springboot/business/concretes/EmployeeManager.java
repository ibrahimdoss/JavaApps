package com.etiya.springboot.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.springboot.business.abstracts.EmployeeService;
import com.etiya.springboot.core.utilities.results.DataResult;
import com.etiya.springboot.core.utilities.results.SuccessDataResult;
import com.etiya.springboot.dataAccess.abstracts.EmployeeDao;
import com.etiya.springboot.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{
	
	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll());
	}

	

	

	

	
}
