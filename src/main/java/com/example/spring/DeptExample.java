package com.example.spring;

public class DeptExample {

	public static void main(String[] args) {
		
		Dept dept = new Dept();		// create
		dept.setDeptno(20);			// reset
		dept.setDname("Developer");	
		dept.setLoc("Seoul");
		
		System.out.println(dept);
		System.out.println(dept.getDeptno() + ", " + dept.getDname() + ", " + dept.getLoc());
	}
}
