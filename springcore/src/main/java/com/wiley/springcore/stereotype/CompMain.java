package com.wiley.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompMain {

	public static void main(String[] args) {
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/wiley/springcore/stereotype/studconfig.xml");
		
		Student student=context.getBean("sob",Student.class);
		System.out.println(student);
		//Student student1=context.getBean("mycities",Student.class);
		//System.out.println(student1);

	}

}
