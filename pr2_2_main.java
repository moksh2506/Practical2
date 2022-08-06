package com.company;

public class pr2_2_main {
    public static void main(String[] args) {
        pr2_2_class a = new pr2_2_class();

        System.out.println("Annual Interest: "+a.getAnnual() + "%");
        System.out.println("Balance: "+a.getBalance());
        System.out.println("Id: "+a.getId());
        System.out.println("Date: "+a.getDate());
        System.out.println("Monthly Interest Rate: "+a.getMonthlyrate());
        System.out.println("Get Monthly Interest: "+a.getMonthlyinterest());
        System.out.println("Balance After Deposit: "+a.deposit(1000));
        System.out.println("Balance After Withdraw: "+a.withdraw(1250));

    }
}
