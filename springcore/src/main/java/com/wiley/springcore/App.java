package com.wiley.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext ("config.xml");
     
		
		Student st=(Student)context.getBean("sturef");
		
		System.out.println(st.getOb().getCount());
       
       
      // Student wst1=(Student)context.getBean("wileystudent1");
      // Student wst2=(Student)context.getBean("wileystudent2");
      // Student wst3=(Student)context.getBean("wileystudent3");
      // System.out.println(wst1);
      // System.out.println(wst2);
       //System.out.println(wst3);
       
       //Student wst4=(Student)context.getBean("wileystudent4");
      // Student wst5=(Student)context.getBean("wileystudent5");
      // Student wst6=(Student)context.getBean("wileystudent6");
      // System.out.println(wst4);
      // System.out.println(wst5);
      // System.out.println(wst6);
    
      // Student wst7=(Student)context.getBean("wileystudent7");
       //System.out.println(wst7);
       
      // ApplicationContext context=new ClassPathXmlApplicationContext ("com/wiley/springcore/reftype/configref.xml");
		
		
		
		//System.out.println(wa.getOb().getCount());
    }
}
