package com.wiley.springcore.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class ConfMain {
	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(SpringConfig.class);

		Student student = con.getBean("st1",Student.class);
	//	Student student = con.getBean("getStudent",Student.class);
		System.out.println(student);
		student.study();
	}

}
