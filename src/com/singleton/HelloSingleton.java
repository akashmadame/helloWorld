package com.singleton;

public class HelloSingleton {
	private String message;

	public String getMessage() {
		System.out.println("You are using " +message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
