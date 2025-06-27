package org.example.test1;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private final List<Transaction> transactions = new ArrayList<>();

    public void deposit(int amount, String date) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        transactions.add(new Transaction(amount, date));
    }

    public void withdraw(int amount, String date) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        transactions.add(new Transaction(-amount, date));
    }

    public void printStatement() {
        System.out.println("DATE | AMOUNT | BALANCE");
        int balance = 0;
        for (int i = 0; i < transactions.size(); i++) {
            Transaction t = transactions.get(i);
            balance += t.getAmount();
            System.out.println(t.getDate() + " | " + t.getAmount() + " | " + balance);
        }
    }
}

