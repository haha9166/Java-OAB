package com.training.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionDemo {
    ArrayList<Task2> customers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    // Add a new customer
    public void addCustomer() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter Job: ");
        String job = scanner.nextLine();
        System.out.print("Enter Salary: ");
        int salary = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        customers.add(new Task2(name, gender, job, salary));
        System.out.println("Customer added!\n");
    }

    // Show all customers
    public void showCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers available.\n");
        } else {
            for (Task2 c : customers) {
                System.out.println("Name: " + c.getCustName() + ", Gender: " + c.getCustGender() +
                        ", Job: " + c.getCustJob() + ", Salary: " + c.getCustSalary());
            }
        }
    }

    // Update customer details
    public void updateCustomers() {
        System.out.print("Enter Name of Customer to Update: ");
        String name = scanner.nextLine();

        for (Task2 c : customers) {
            if (c.getCustName().equals(name)) {
                System.out.print("Enter new Job: ");
                c.setCustJob(scanner.nextLine());

                System.out.print("Enter new Salary: ");
                c.setCustSalary(scanner.nextInt());
                scanner.nextLine(); // Consume newline

                System.out.println("Customer updated successfully!\n");
                return;
            }
        }
        System.out.println("Customer not found!\n");
    }

    // Delete a customer
    public void deleteCustomers() {
        System.out.print("Enter Name of Customer to Delete: ");
        String name = scanner.nextLine();

        boolean removed = customers.removeIf(c -> c.getCustName().equalsIgnoreCase(name));

        if (removed) {
            System.out.println("Customer deleted successfully!\n");
        } else {
            System.out.println("Customer not found!\n");
        }
    }

    public static void main(String[] args) {
        CollectionDemo demo = new CollectionDemo();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Customer");
            System.out.println("2. Update Customer");
            System.out.println("3. Delete Customer");
            System.out.println("4. Show Customers");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> demo.addCustomer();
                case 2 -> demo.updateCustomers();
                case 3 -> demo.deleteCustomers();
                case 4 -> demo.showCustomers();
                case 5 -> {
                    System.out.println("Exiting");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice, try again.");
            }
        }
    }
}
