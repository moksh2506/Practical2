package com.company;

public class pr2_3_class {

    private static int count;
    private final String id;
    private double balance;

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public pr2_3_class() {
        count++;
        if (count < 10) {
            id = "AC00" + (count);
        } else {
            id = "AC0" + (count);
        }
        balance = 300;
    }

    public void withdraw(double money) {
        if (balance - money >= 300) {
            balance -= money;
            System.out.println(money + "Amount successfully withdrawn..");
            System.out.println("Remaining Balance : " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw the amount.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "Amount deposited to your account.");
        System.out.println("Current Balance : " + balance);
    }

    public void MoneyTransfer(pr2_3_class obj, double amount) {
        if (balance - amount >= 300) {
            balance -= amount;
            obj.balance += amount;
            System.out.println(amount + "Amount Transferred Succesfully...");
            System.out.println("Balance Left: " + balance);
        } else {
            System.out.println("Insufficient balance to transfer the amount.");
        }
    }

}
