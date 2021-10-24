/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acount;

/**
 *
 * @author NoteBook
 */

import java.util.Date;

class account {
     private int ID = 0;
    private double Balance = 0.0;
    private static double AnnualInterestRate = 0.0;
    private  Date DateCreated;

    public account() {
        DateCreated = new java.util.Date();
    }

    public account(int id, double balance) {
        this();
        ID = id;
      Balance = balance;
    }

    public int getId() {
        return ID;
    }

    public double getBalance() {
        return Balance;
    }

    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }

    public String getDateCreated() {
        return DateCreated.toString();
    }

    public void setId(int id) {
        ID = id;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        AnnualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (AnnualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return Balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        Balance -= amount;
    }

    public void deposit(double amount) {
        Balance += amount;
    }
    

}