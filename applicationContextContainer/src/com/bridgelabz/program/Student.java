package com.bridgelabz.program;

public class Student {
private String name;//en

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public void displayInfo()
{
	System.out.println("this response is from application Context comntainer:"+name);
}
}
