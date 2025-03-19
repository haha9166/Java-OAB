package com.training.collection;

import java.util.Scanner;

public class Task2 extends CollectionDemo {

	private String custName;
	private String custGender;
	private String custJob;
	private int custSalary;
	
	//Constructors
	public Task2(String custName, String custGender, String custJob, int custSalary) {
		super();
		this.custName = custName;
		this.custGender = custGender;
		this.custJob = custJob;
		this.custSalary = custSalary;
	}

	
	
	
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustGender() {
		return custGender;
	}

	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}

	public String getCustJob() {
		return custJob;
	}

	public void setCustJob(String custJob) {
		this.custJob = custJob;
	}

	public int getCustSalary() {
		return custSalary;
	}

	public void setCustSalary(int custSalary) {
		this.custSalary = custSalary;
	}
	
	
	
}
