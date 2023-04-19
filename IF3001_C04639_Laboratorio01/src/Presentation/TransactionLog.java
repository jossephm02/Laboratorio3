/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentation;

import Domain.Account;
import java.util.Date;

/**
 *
 * @author Laboratorios
 */
public class TransactionLog {

    private int transationId;
    private String event;
    private Date date;
    private Account accountSend;
    private Account accountReceiver;
    private double movement;

    private static int consecutive = 0;

    public TransactionLog() {
        this.transationId = ++consecutive;
    }

    public TransactionLog(String event, Account accountSend, double movement) {
        this();
        this.date = new java.util.Date();
        this.event = event;
        this.accountSend = accountSend;
        this.movement = movement;
    }

    public TransactionLog(String event, Account accountSend, Account accountReceiver, double movement) {
        this();
        this.date = new java.util.Date();
        this.event = event;
        this.accountSend = accountSend;
        this.accountReceiver = accountReceiver;
        this.movement = movement;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Account getAccountSend() {
        return accountSend;
    }

    public void setAccountSend(Account accountSend) {
        this.accountSend = accountSend;
    }

    public double getMovement() {
        return movement;
    }

    public void setMovement(double movement) {
        this.movement = movement;
    }

    public Account getAccountReceiver() {
        return accountReceiver;
    }

    public void setAccountReceiver(Account accountReceiver) {
        this.accountReceiver = accountReceiver;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------------------------"
                + "\n GENERAL BANK INFORMATION"
                + "\n Event Id= " + this.transationId
                + "\n Event Tepy= " + this.getEvent()
                + "\n Date= " + this.date
                + "\n Movement= " + this.movement
                + "\n Affected Account" + this.accountSend;
    }

    public String toStringSinpeMovil() {
        return "\n-----------------------------------------------------"
                + "\n GENERAL BANK INFORMATION"
                + "\n Event Id= " + this.transationId
                + "\n Event Tepy= " + this.getEvent()
                + "\n Date= " + this.date
                + "\n Movement= " + this.movement
                + "\n Send Account" + this.accountSend
                + "\n Receiver Account" + this.accountReceiver;
    }

}
