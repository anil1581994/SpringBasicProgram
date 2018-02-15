package com.bridgelabz.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgelabz.bean.Student;

public class App 
 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		Resource source=new ClassPathResource("cfg.xml");
		BeanFactory factory=new XmlBeanFactory(source);
		Student student=(Student)factory.getBean("studentObj");
		student.display();
		
	}
}
