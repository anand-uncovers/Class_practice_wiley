package com.wiley.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AWMain {

	public static void main(String[] args) {
		ApplicationContext context= 
				new ClassPathXmlApplicationContext("com/wiley/springcore/autowire/annotation/annotautowireconfig.xml");
	//	Emp emp1=(Emp)context.getBean("emp1");	
//Emp emp1=context.getBean("emp1",Emp.class);
//System.out.println(emp1);

//System.out.println(emp1.getPhones().getClass().getName());

//Person person1=context.getBean("person1",Person.class);
//System.out.println(person1);
//System.out.println(person1.getClass().getName());

Person map1=context.getBean("fees",Person.class);
//System.out.println(person1);
System.out.println(map1.getClass().getName());

	}

}
