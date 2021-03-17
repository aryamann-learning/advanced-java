package com.advanced.serialization;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee implements Serializable {
	public String name, company;
	public int age, salary;

	public Employee(String name, String company, int age, int salary) {
		this.name = name;
		this.age = age;
		this.company = company;
		this.salary = salary;
	}

}
