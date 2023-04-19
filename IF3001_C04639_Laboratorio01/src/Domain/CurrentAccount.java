/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.util.Date;

/**
 *
 * @author PC
 */
public class CurrentAccount extends Account {

    private Date date;
    private float interest;

    public CurrentAccount(Date date, float interest, String accountNumber, Client client, double balance, CommercialBank comercialbank) {
        super(accountNumber, client, balance, comercialbank);
        this.date = date;
        this.interest = interest;
    }

    @Override
    public double interestCalculation() {

        return this.getBalance() * this.interest;

    }

    @Override
    public void whithdraw(double money) {

        if (money > this.getBalance()) {
            System.out.println("YOU DON'T HAVE ENOUGH MONEY");
        } else {
            super.setBalance(this.getBalance() - money);
            System.out.println("-----------------------------------------------------\n" + money + " HAS BEEN WITHDRAWN");
        }

    }

    @Override
    public void deposit(double money) {
        super.setBalance(this.getBalance() + money);
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n CURRENT ACCOUNT DETAILS"
                + "\n Interest: " + interestCalculation();
    }

}
