package com.bridgelabz.bean;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabz/bean/ApplicationContext.xml");
		EmployeeDao empDao = (EmployeeDao) context.getBean("empDao");
		
		List<Employee> list = empDao.getAllEmployeesRowMapper();

		for (Employee e : list)
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());

	}
}
