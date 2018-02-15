package com.bridgelabz.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.bean.Student;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

			  Student studentObj=(Student)context.getBean("studentBean");
			  studentObj.displayInfo();
	}
}
