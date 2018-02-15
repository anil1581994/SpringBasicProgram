package com.bridgelabz.bean;

public class Employee {
	private int id;
	private String name;
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	public void displayInfo() {
		System.out.println("...............Employee--Info..............");
		System.out.println("empid:"+id+"\t"+"name:"+name);
		System.out.println(address);
	}
}
