package com.bridgelabz.program;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test 
{
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("SpringBean.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Student studnetObj=(Student)factory.getBean("studentBean");
		studnetObj.displayInfo();
	}
}
