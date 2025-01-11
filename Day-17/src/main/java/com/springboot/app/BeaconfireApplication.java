package com.springboot.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeaconfireApplication {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

		Employee employee = ac.getBean("rachel",Employee.class);
		Employee employee2 = (Employee) ac.getBean("employee1");
		Employee employee3 = (Employee) ac.getBean("employee1");
		System.out.println(employee);
		System.out.println(employee2);
		System.out.println(employee3);

	}

}
