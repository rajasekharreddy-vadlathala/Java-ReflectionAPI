package com.raja.reflection.model;

public class Person {
	
	
	
	public String name;
	public Integer age;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	public static String getPerson() {
		return "Person";
	}

}
