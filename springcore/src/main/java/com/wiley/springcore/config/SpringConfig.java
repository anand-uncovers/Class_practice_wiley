package com.wiley.springcore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
//@ComponentScan(basePackages=" com.wiley.springcore.config")
public class SpringConfig {
	
	@Bean
	public Beer getBeer() {
		return new Beer();
	}
	@Bean(name= {"st1"})
public Student getStudent() {
	Student student=new Student(getBeer());
	return student;
}
}
