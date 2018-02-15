package com.bridgelabz.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.bean.Question;

public class Test {
public static void main(String[] args) {
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("springConfiguration.xml");
	Question question=(Question)context.getBean("q");
	question.displayInfo();
	
}
}
