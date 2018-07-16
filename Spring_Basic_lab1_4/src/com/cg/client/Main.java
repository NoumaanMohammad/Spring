package com.cg.client;

import java.util.Scanner;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.dto.Employee;
import com.cg.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		
		int id ;
		System.out.print("\nEnter Employee Id : ");
		id = new Scanner(System.in).nextInt();
		Employee emp = service.getEmployee(id);
		System.out.println("Employee : "+emp);
	}
}
