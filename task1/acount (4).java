/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acount;

/**
 *
 * @author NoteBook
 */
public class Acount {

    
    public static void main(String[] args) {
        account acc = new account(1122, 20000);
        acc.setAnnualInterestRate(4.5);
        acc.withdraw(2500.0);
        acc.deposit(3000.0);
        System.out.println("Balance: $" + acc.getBalance());
        System.out.println("Monthly Interest: " + acc.getMonthlyInterest());
        System.out.println("Date Created: " + acc.getDateCreated());

    }
    
}
