package com.bridgelabz.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.bean.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabz/cfg/springcfg.xml");
		Employee employee=(Employee)context.getBean("empObj");
		employee.display();

	}
}
