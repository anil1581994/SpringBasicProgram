package com.bridgelabz.bean;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/bridgelabz/bean/ApplicationContext.xml");
	EmployeeDao empDao=(EmployeeDao)context.getBean("empDao");
	Employee e=new Employee();
	e.setName("harshal");
	e.setId(112);
	e.setSalary(1500);
	 Boolean status1=false;
      status1=empDao.saveEmployeeByPreparedStatement(e);
      System.out.println(status1+"-->record save succesfully"); 
      
}
}
