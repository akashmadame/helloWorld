package com.rwd;

public class HelloSpring {
private String message;

public String getMessage() {
	System.out.println("Message is:- " +message);
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

}
