package com.company;
import java.util.Date;

public class pr2_2_class {
    private int id=0 ;
    private double balance=500;
    private double annual=07;
    private Date date = new Date();

    pr2_2_class(){}
    pr2_2_class(int id ,double balance)
    {
        this.id=id;
        this.balance=balance;
    }

    public int getId()
    {
        return id;
    }

    public double getBalance()
    {
        return balance;
    }

    public double getAnnual()
    {
        return annual;
    }

    public Date getDate()
    {
        return date;
    }

    public void setId(int id)
    {

        this.id = id;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setAnnual(double annual)
    {
        this.annual = annual;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }
    public double getMonthlyrate()
    {
        return  annual/12;

    }
    public double getMonthlyinterest()
    {
        return balance*(annual/1200);
    }
    public double withdraw(double a)

    {
        balance=balance-a;
        return balance;
    }
    public double deposit(double a)
    {
        balance=balance+a;
        return balance;
    }

}