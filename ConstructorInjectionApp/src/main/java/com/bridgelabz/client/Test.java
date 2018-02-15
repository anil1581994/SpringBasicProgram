package com.bridgelabz.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.bean.Employee;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("cfg.xml"); 
	Employee emp=(Employee)context.getBean("empObj");
	emp.display();
	  
		   
}
}
