package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.dao.EmployeeDao;
import com.cg.dao.EmployeeDaoImpl;
import com.cg.dto.Employee;

@Component("employeeService")
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
    EmployeeDao dao;

	public EmployeeServiceImpl() {
	}
	
	public EmployeeServiceImpl(EmployeeDao dao) {
		super();
		this.dao = dao;
	}


	@Override
	public Employee getEmployee(int id) {
		
		return dao.getEmployee(id);
	}
	
	
}
