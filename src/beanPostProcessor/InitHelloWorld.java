package beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld  implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName) 
		throws BeansException {
		System.out.println("Before Initializeion :" + beanName);
		return bean;
		
	}
	public Object postProcessAfterInitilization (Object bean, String beanName)
	throws BeansException {
		System.out.println("After Initilization : "+ beanName);
		return bean;
	}
	

}
