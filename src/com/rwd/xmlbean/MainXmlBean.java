package com.rwd.xmlbean;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MainXmlBean {

	public static void main(String args[]) {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		HelloXml obj = (HelloXml) factory.getBean("xmlBean");
		obj.getMessage();
	}
}
