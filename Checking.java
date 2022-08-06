package com.company;
public class Checking
 		extends Account {
 	// Data fields
 	private double overdraftLimit;

 	public Checking() {
 		super();
 		overdraftLimit = -20;
 	}

 	public Checking(int id, double balance, double overdraftLimit) {
 		super(id, balance);
 		this.overdraftLimit = overdraftLimit;
 	}

 	public void setOverdraftLimit(double overdraftLimit) {
 		this.overdraftLimit = overdraftLimit;
 	}
 	public double getOverdraftLimit() {
 		return overdraftLimit;
	 }
	 public void withdraw(double amount) {
 		if (getBalance() - amount > overdraftLimit) {
 			setBalance(getBalance() - amount);
 		}
 		else
 			System.out.println("Error! Amount exceeds overdraft limit.");
 	}

 	public String toString() {
 		return super.toString() + "\nOverdraft limit: $" + 
 		String.format("%.2f", overdraftLimit);
 	}
}
