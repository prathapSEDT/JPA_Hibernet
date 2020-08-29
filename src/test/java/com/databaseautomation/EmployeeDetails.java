package com.databaseautomation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeedetails")
public class EmployeeDetails {
	@Id
	@Column(name = "emp_age")
	private int age;
	@Column(name = "emp_name")
	private String name;
	@Column(name = "emp_salary")
	private double salary;
	@Column(name = "emp_place")
	private String place;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [age=" + age + ", name=" + name + ", salary=" + salary + ", place=" + place
				+ ", getAge()=" + getAge() + ", getName()=" + getName() + ", getSalary()=" + getSalary()
				+ ", getPlace()=" + getPlace() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
