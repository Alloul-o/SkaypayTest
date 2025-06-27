package org.example.test2;

public class User {
    private int id;
    private int balance;

    public User(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public void deductBalance(int amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", balance=" + balance + "}";
    }
}
