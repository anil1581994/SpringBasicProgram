package com.bridgelabz.bean;

public class Employee {
	private int id;
	private String name;

	public Employee() {
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void display()
	{
		System.out.println("name of employee:"+name);
		System.out.println("id of employee:"+id);
	}
}