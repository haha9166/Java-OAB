package com.training.bank;

// Abstract class to serve as a base class for different account types
public abstract class Account {
    protected int accountNumber;
    protected String name;
    protected double amount;

    // Parameterized Constructor
    public Account(int accountNumber, String name, double amount) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.amount = amount;
    }

    // Default Constructor
    public Account() {
        System.out.println("Account Constructor");
    }

    // Display Account Information
    public String display() {
        return "Account Number: " + this.accountNumber + ", Name: " + this.name + ", Balance: " + this.amount;
    }

    // Abstract Method - Must be implemented by subclasses
    public abstract double calculateTotalAmount();
}
