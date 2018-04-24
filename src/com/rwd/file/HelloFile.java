package com.rwd.file;

public class HelloFile {
	private String message;

	public String getMessage() {
		System.out.println("File :" +message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
