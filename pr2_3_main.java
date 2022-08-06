package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class pr2_3_main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String id = "";
        String id2 = "";
        boolean flag = true;
        int choice;
        double amt;
        ArrayList<pr2_3_class> people = new ArrayList<pr2_3_class>();
        for (int i = 1; i <= 10; i++) {
            people.add(new pr2_3_class());
        }
        System.out.print("Enter Your Account Number : ");
        id = s.next();
        int userNumber = userID(id, people);

        while (flag) {
            System.out.println();
            System.out.println("Enter your Choice Number: ");
            System.out.println("1.Balance");
            System.out.println("2.Withdraw money ");
            System.out.println("3.Deposit money");
            System.out.println("4.Money Transfer ");
            System.out.println("5.Create Account ");
            System.out.println("6.Deactivate Account");
            System.out.println("7.Exit ");
            choice = s.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Account Number : " + id);
                    System.out.println("Current Balance : " + people.get(userNumber).getBalance());
                }
                case 2 -> {
                    System.out.print("Enter Amount To Withdraw : ");
                    amt = s.nextDouble();
                    people.get(userNumber).withdraw(amt);
                }
                case 3 -> {
                    System.out.print("Enter Amount To Deposit : ");
                    amt = s.nextInt();
                    people.get(userNumber).deposit(amt);
                }
                case 4 -> {
                    System.out.print("Enter Account Number To Transfer Money :");
                    id2 = s.next();
                    int u2 = userID(id2, people);
                    System.out.print("Enter Amount To Transfer : ");
                    amt = s.nextInt();
                    people.get(userNumber).MoneyTransfer(people.get(u2), amt);
                }
                case 5 -> {
                    people.add(new pr2_3_class());
                    System.out.println("Account Created Successfully.");
                    System.out.println("The New Account Number Is :" + people.get(people.size() - 1).getId());
                }
                case 6 -> {
                    people.remove(userNumber);
                    System.out.println("Account Deleted Successfully.");
                    flag = false;
                }
                case 7 -> flag = false;
                default -> System.out.println("Make a valid choice..");
            }
        }

    }

    public static int userID(String id, ArrayList<pr2_3_class> people) {
        Scanner s = new Scanner(System.in);
        int user = 10000;
        int i;
        for (i = 0; i < people.size(); i++) {
            if (id.equals(people.get(i).getId())) {
                user = i;
                break;
            }
        }
        if (i == people.size()) {
            System.out.println("Account Does not Exists.\nPlease Try Again..");
            System.out.print("Enter your Account ID :");
            id = s.next();
            return userID(id, people);
        } else return user;

    }
}
