package com.bridgelabz.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.bean.Question;

public class Test 
{
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("springConfig2.xml");
	Question question=(Question)context.getBean("q");
	question.displayInfo();

}
}

