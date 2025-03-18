package com.training.bank;

public class SavingAccount implements PrimaryAccount {
	// Attributes
	private double roi;
	private double minBalance;

	public SavingAccount() {
		System.out.println("SavingAccount Constructor");
	}

	// // Constructor
	// public SavingAccount(int accountNumber, String name, double roi, double
	// amount) {
	// super();
	// this.accountNumber = accountNumber;
	// this.Name = name;
	// this.roi = roi;
	// this.Amount = amount;
	// }
	//
	// // Calculate method
	// public double calculate() {
	// return Amount + (Amount * roi);
	// }
	//
	//
	// // Getters and Setters
	// public int getAccountNumber() {
	// return accountNumber;
	// }
	//
	// public void setAccountNumber(int accountNumber) {
	// this.accountNumber = accountNumber;
	// }
	//
	// public String getName() {
	// return Name;
	// }
	//
	// public void setName(String name) {
	// Name = name;
	// }
	//
	// public double getRoi() {
	// return roi;
	// }
	//
	// public void setRoi(double roi) {
	// this.roi = roi;
	// }
	//
	// public double getAmount() {
	// return Amount;
	// }
	//
	// public void setAmount(double amount) {
	// Amount = amount;
	// }
	//
	// public String toString() {
	// return "Account Number: " + accountNumber + ", Account Holder Name: " + Name
	// + ", Rate of Investment = "
	// + roi + ", amount = " + Amount;
	// }
	//
	public double calculate(double Amount, double roi) {
		return Amount + (Amount * roi / 100);
	}

	@Override
	public String display() {
		return super.display() + ", Minimum Balance: " + this.minBalance;
	}

	// Method Overload
	public String display(int roi) {
		return "Overloaded method";
	}

}
