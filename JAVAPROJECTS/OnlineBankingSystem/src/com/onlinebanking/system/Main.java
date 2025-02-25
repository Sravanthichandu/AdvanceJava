package com.onlinebanking.system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\nWelcome to Online Banking");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.next();
                    System.out.print("Enter account holder's name: ");
                    String accountHolderName = scanner.next();
                    bank.createAccount(accountNumber, accountHolderName);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    BankAccount account = bank.getAccount(accountNumber);
                    if (account != null) {
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account = bank.getAccount(accountNumber);
                    if (account != null) {
                        account.withdraw(withdrawalAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    account = bank.getAccount(accountNumber);
                    if (account != null) {
                        System.out.println("Account Balance: $" + account.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using Online Banking.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
