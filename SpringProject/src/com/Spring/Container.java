package com.Spring;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Container{

		public static void main(String[] args)
		{
			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
			
			Employee employee1 = (Employee) context.getBean("emp1");
			System.out.println(employee1);
			
			System.out.println();
			
			Employee employee2 = (Employee) context.getBean("emp2");
			System.out.println(employee2);
			
			
		}

	}


