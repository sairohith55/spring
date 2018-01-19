package com.beans;

import java.util.List;

public class Employee {

	private int id;
	private String name;
	private float salary;
	private List<Address> address;
	
	public Employee(int id,String name,float salary,List<Address> add) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		address=add;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ",Address="+address+"]";
	}
	
	
}
