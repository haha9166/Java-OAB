package com.training.bank;

// Interface for primary bank account operations
public interface PrimaryAccount {
    
    // Abstract method to calculate the total account balance
    double calculateTotalAmount();

    // Abstract method to display account details
    String displayDetails();
}
