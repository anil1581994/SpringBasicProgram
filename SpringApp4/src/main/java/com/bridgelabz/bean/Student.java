package com.bridgelabz.bean;

public class Student {
	private int id;
	private String name;
     public Student()
     {
    	 System.out.println("this is default constructor");
     }
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void display()
	{
		System.out.println(id+" "+name);
	}
}