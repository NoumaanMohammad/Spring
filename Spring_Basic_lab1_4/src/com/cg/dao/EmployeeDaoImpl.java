package com.cg.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cg.dto.Employee;
import com.cg.util.Collection;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao 
{

	@Override
	public Employee getEmployee(int id) {
		
		for(Employee emp:Collection.getEmployees())
			if(emp.getEmpId()==id)
				return emp;
		return null;
	}
  
}
