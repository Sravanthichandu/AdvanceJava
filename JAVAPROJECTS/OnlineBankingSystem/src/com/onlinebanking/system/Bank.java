package com.onlinebanking.system;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, BankAccount> accounts;

    // Constructor
    public Bank() {
        accounts = new HashMap<>();
    }

    // Method to create a new account
    public void createAccount(String accountNumber, String accountHolderName) {
        if (!accounts.containsKey(accountNumber)) {
            BankAccount account = new BankAccount(accountNumber, accountHolderName);
            accounts.put(accountNumber, account);
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Account with this number already exists.");
        }
    }

    // Method to get an account by account number
    public BankAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}

