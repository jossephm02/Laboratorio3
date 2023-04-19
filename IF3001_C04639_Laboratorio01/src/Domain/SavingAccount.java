/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.Date;

/**
 *
 * @author Laboratorios
 */
public class SavingAccount extends Account {

    private Date date;
    private int monthlyTerm;
    private float interest;

    public SavingAccount(Date date, int monthlyTerm, float interest, String accountNumber, Client client, double balance, CommercialBank comercialbank) {
        super(accountNumber, client, balance, comercialbank);
        this.date = date;
        this.monthlyTerm = monthlyTerm;
        this.interest = interest;
    }

    @Override
    public double interestCalculation() {
        double totalInterests;

        totalInterests = this.getMonthlyTerm()
                * this.getInterest()
                + this.getBalance();
        return totalInterests;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMonthlyTerm() {
        return monthlyTerm;
    }

    public void setMonthlyTerm(int monthlyTerm) {
        this.monthlyTerm = monthlyTerm;
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
                + "\n SAVING ACCOUNT DETAILS"
                + "\n Monthly Term= " + this.getMonthlyTerm()
                + "\n saving starDate= " + this.getDate()
                + "\n interest= " + this.getInterest()
                + "\n Balance + inetrest= " + interestCalculation()
                + "\n -----------------------------------------------------";
    }

}
