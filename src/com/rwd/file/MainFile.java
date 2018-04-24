package com.rwd.file;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainFile {
	public static void main(String args[]) {
		ApplicationContext factory = new FileSystemXmlApplicationContext("D:/Workspace Manya/spring_tutorials_point/HelloSpring/src/Beans.xml");
		HelloFile obj = (HelloFile) factory.getBean("fileBean");
		obj.getMessage();
		
	}

}
