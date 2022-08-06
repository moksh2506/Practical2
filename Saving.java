package com.company;

public class Saving
 		extends Account {
	public Saving() {
 		super();
 	}
	 public Saving(int id, double balance) {
 		super(id, balance);
 	}
 	public void withdraw(double amount) {
 		if (amount < getBalance()) {
 			setBalance(getBalance() - amount);
 		}
 		else
 			System.out.println(
 				"Error! Savings account overdrawn transtaction rejected");
 	}
}