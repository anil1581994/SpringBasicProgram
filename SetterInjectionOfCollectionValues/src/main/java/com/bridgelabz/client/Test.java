package com.bridgelabz.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.bean.Question;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/springConfiguration.xml");
		Question question = (Question) context.getBean("questionBean");
		question.displayInfo();

	}
}
