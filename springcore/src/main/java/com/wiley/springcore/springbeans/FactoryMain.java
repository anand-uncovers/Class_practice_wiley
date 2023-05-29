package com.wiley.springcore.springbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/foobar/config.xml");
		Foo bean = context.getBean("myBean", Foo.class);
		System.out.println(bean.getMessage());
	}
}
