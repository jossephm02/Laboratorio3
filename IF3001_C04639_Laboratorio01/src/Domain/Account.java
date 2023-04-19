/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Laboratorios
 */
public abstract class Account {

    private String accountNumber;
    private Client client;
    private double balance;
    private CommercialBank comercialbank;

    public Account(String accountNumber, Client client, double balance, CommercialBank comercialbank) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.balance = balance;
        this.comercialbank = comercialbank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CommercialBank getComercialbank() {
        return comercialbank;
    }

    public void setComercialbank(CommercialBank comercialbank) {
        this.comercialbank = comercialbank;
    }

    public void sendSinpeMovil(Account account, int sendMoney) {

        if (this.balance < sendMoney) {
            System.out.println("YOU DON'T HAVE ENOUGH MONEY");
        } else {

            if (this.comercialbank.getFinance()>sendMoney) {
                
                this.comercialbank.setFinance(this.comercialbank.getFinance()-sendMoney);
                account.getComercialbank().setFinance(account.getComercialbank().getFinance()+sendMoney);
                
                this.balance = this.balance - sendMoney;
                account.setBalance(account.getBalance() + sendMoney);
                System.out.println("\n SINPE MÓVIL \n"
                        + "Sent to the person with ID: " + account.client.getId()
                        + "\n A quantity of:" + sendMoney);
            }else{
            
                System.out.println("THE BANK DOES NOT HAVE ENOUGH FUNDS");
                
            }
        }

    }

    public abstract double interestCalculation();

    public abstract void whithdraw(double money);

    public abstract void deposit(double money);

    @Override
    public String toString() {
        return "Account information: \n"
                + "\n Account Number: " + accountNumber
                + "\n" + client.toString()
                + "\n Balance: " + balance + "\n"
                + "\n-----------------------------------------------------"
                + "\n" + this.comercialbank.toString()
                + "\n-----------------------------------------------------";
    }

}
