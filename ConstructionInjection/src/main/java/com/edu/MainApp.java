package com.edu;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee e1= (Employee) context.getBean("empob");
		e1.display();
		Employee e2=(Employee) context.getBean("empob1");
		e2.display();
		Employee e3=(Employee) context.getBean("empob2");
		e3.display();
		

	}

}
