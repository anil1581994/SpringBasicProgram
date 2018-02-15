package com.bridgelabz.bean;

public class Student {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public void displayInfo()
{
	System.out.println("hello mr"+name+"this your first ApplicationContext Container Application");
}
}
