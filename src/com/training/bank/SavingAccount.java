package com.training.bank;

public class SavingAccount extends BankAccount {
    private double interestRate;
    private static final double MIN_BALANCE = 1000;

    public SavingAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest of OMR" + interest + " applied. New Balance: OMR" + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("OMR" + amount + " withdrawn. New Balance: OMR" + balance);
        } else {
            System.out.println("Withdrawal failed! Minimum balance of OMR" + MIN_BALANCE + " required.");
        }
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
