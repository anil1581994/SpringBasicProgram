package com.bridgelabz.bean;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int qid;
	private String question;
	private List<Answer> answers;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public void displayInfo()
	{  
	    System.out.println(qid+" "+question);  
	    System.out.println("answers are:");  
	    Iterator<Answer> itr=answers.iterator();  
	    while(itr.hasNext())
	    {  
	        System.out.println(itr.next());  
	    }  

	
}
}
