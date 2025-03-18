package com.training.bank;

public class Account {

	private int accountNumber;
	private String Name;
	private double Amount;
	
	
	
	public Account(int accountNumber, String name, double amount) {
		super();
		this.accountNumber = accountNumber;
		Name = name;
		Amount = amount;
	}



	public Account() {
		System.out.println("Account Constructor");
	}
	
	public String display() {
		return "Account number: "+this.accountNumber+"Amount: "+this.Amount;
	}
	
	public abstract double calculateTotalAmount();
	
	
}
