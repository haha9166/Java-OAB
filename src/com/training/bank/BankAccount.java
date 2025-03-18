package com.training.bank;

import java.util.Scanner;

public class BankAccount {
    protected int accountNumber;
    protected String accountHolder;
    protected double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("OMR" + amount + " deposited. New Balance: OMR " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("OMR" + amount + " withdrawn. New Balance: OMR " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("====================================");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: OMR " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Bank of Hassan");
        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolder = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Interest Rate (in %): ");
        double interestRate = sc.nextDouble();

        SavingAccount myAccount = new SavingAccount(accountNumber, accountHolder, balance, interestRate);

        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Apply Interest");
            System.out.println("4. Display Account Info");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double depositAmount = sc.nextDouble();
                myAccount.deposit(depositAmount);
            } else if (choice == 2) {
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = sc.nextDouble();
                myAccount.withdraw(withdrawAmount);
            } else if (choice == 3) {
                myAccount.applyInterest();
            } else if (choice == 4) {
                myAccount.displayAccountInfo();
            } else if (choice == 5) {
                System.out.println("Thank you");
            } else {
                System.out.println("Invalid choice, Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
