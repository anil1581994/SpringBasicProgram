package com.bridgelabz.bean;

public class Answer {
	private int answerId;
	private String name;
	private String by;

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBy() {
		return by;

	}

	public void setBy(String by) {
		this.by = by;
	}

	@Override
	public String toString() {
		return answerId + " " + name + " " + "by " + by;
	}

}
