package init.destroy;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainID {
	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloID obj = (HelloID) context.getBean("input");
		obj.getMessage();
		context.registerShutdownHook();
	}

}
