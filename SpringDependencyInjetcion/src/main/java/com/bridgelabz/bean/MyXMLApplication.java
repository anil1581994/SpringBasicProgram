package com.bridgelabz.bean;

import com.bridgelabz.service.MessageService;

public class MyXMLApplication {
  private MessageService service;

public MessageService getService() {
	return service;
}

public void setService(MessageService service) {
	this.service = service;
}
public boolean processMessage(String msg, String rec) {
	// some magic like validation, logging etc
	return this.service.sendMessage(msg, rec);
}
}
