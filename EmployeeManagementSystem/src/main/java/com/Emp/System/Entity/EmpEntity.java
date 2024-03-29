package com.Emp.System.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmpEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String address;
	private long phno;
	private String email;
	private double salary;
	public EmpEntity(int id, String name, String address, long phno, String email, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phno = phno;
		this.email = email;
		this.salary = salary;
	}
	public EmpEntity() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmpEntity [id=" + id + ", name=" + name + ", address=" + address + ", phno=" + phno + ", email=" + email
				+ ", salary=" + salary + "]";
	}
	
	
	
	

}
