package com.bridgelabz.bean;

import java.util.Date;

public class Answer {
	private int answerId;
	private String answer;
	private Date postDate;
   

	public int getAnswerId() {
		return answerId;
	}


	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public Date getPostDate() {
		return postDate;
	}


	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}


	public String toString() {
		return "answerId:" + answerId + " Answer:" + answer + " Posted Date:" + postDate;
	}

}
