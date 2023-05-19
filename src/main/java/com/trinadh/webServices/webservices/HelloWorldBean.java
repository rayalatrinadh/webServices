package com.trinadh.webServices.webservices;

public class HelloWorldBean {
  private String message = "trinadh";
  public HelloWorldBean() {
		
	}

public HelloWorldBean(String message) {
	this.message = message;
}

public String getMessage() {
	return message;
}

@Override
public String toString() {
	return String.format("HelloWorldBean [message=%s]", message);
}
  
}
