package com.wiley.springcore.springbeans.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainInstrument {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/springbeans/example/config.xml");
		Servicing c = context.getBean("Servicing", Servicing.class);
		c.displayCarDetails();
	}
}

