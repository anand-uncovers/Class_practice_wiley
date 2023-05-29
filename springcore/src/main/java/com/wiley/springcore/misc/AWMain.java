package com.wiley.springcore.misc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//@Resource

//@Autowired

public class AWMain {

	public static void main(String[] args) {
		ApplicationContext context= 
				new ClassPathXmlApplicationContext("com/wiley/springcore/misc/config.xml");
		//Emp emp1=(Emp)context.getBean("emp1");	
Employee emp1=context.getBean("employee",Employee.class);
System.out.println(emp1);
emp1.displayEmployee();
System.out.println("****************************");

SingleTonA objA=context.getBean("venkat",SingleTonA.class);
objA.sayHello();


	}

}
