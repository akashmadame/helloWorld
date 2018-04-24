package com.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloSingleton obj1 = (HelloSingleton) context.getBean("singleton");
		obj1.setMessage("Akash");
		obj1.getMessage();
		
		HelloSingleton obj2 = (HelloSingleton) context.getBean("singleton");
		obj2.getMessage();

	}

}
