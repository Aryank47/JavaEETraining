package com.netcracker.beans;

import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private String name;
	private float salary;
	
	public Employee() {
		super();
		System.out.println("Employee bean obj is created.");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
	

}
