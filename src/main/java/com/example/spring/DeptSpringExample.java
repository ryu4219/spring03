package com.example.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeptSpringExample {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:/spring/beans.xml");
		
		Dept dept = ctx.getBean(Dept.class);
		
		System.out.println(dept);
		System.out.println(dept.getDeptno() + ", " + dept.getDname() + ", " + dept.getLoc());
		
		ctx.close();
	}
}
