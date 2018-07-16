package com.cg.util;

import java.util.ArrayList;
import java.util.List;

import com.cg.dto.Employee;

public class Collection {

	public static List<Employee> getEmployees()
	{
		List<Employee> list = new ArrayList<Employee>();
			
		list.add(new Employee(101,"Pradeep",5456));
		list.add(new Employee(102,"Akash",45524));
		list.add(new Employee(103,"Sarita",242142));
		list.add(new Employee(104,"Navin",2424242));
		list.add(new Employee(105,"Naomaan",908754));
		
		return list;
	}
}
