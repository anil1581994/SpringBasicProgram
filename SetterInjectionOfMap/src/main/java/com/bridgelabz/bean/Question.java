package com.bridgelabz.bean;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int qid;
	private String question;
	private Map<String, String> answers;

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

	public Map<String, String> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
    public void displayInfo()//get data  in the form of key,value pair
    {
    	System.out.println("the quetsion id is:"+qid);
    	System.out.println("question is:"+question);
    	System.out.println(".......answers:");
    	
    	Set<Entry<String,String>> set=answers.entrySet();
       Iterator<Entry<String,String>> itr=set.iterator();
       while(itr.hasNext())
       {
    	  Entry <String,String> entry=itr.next();
    	  System.out.println("answer"+entry.getKey()+"......."+"posted by"+entry.getValue());
       }
    }
	
}
