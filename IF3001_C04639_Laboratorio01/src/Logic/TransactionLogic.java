/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Domain.Account;
import Domain.CentralBank;
import Domain.Client;
import Domain.CommercialBank;
import Domain.CurrentAccount;
import Domain.SavingAccount;
import Presentation.TransactionLog;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class TransactionLogic {
    private Client clients[];
    private CentralBank centralbank;
    private CommercialBank commercialBank[];
    private Date date;
    private float currentInterest;
    private Account account[];
    private TransactionLog tl[];

    public TransactionLogic() {
        this.clients = new Client[10];
        this.clients[0] = new Client("303580895", "Josseph", "68844884", "turri");
        this.clients[1] = new Client("305980853", "Diego", "84642738", "turri");

        this.centralbank = new CentralBank(3000000);

        this.commercialBank = new CommercialBank[2];
        this.commercialBank[0] = new CommercialBank(1000000, "BCR", this.centralbank);
        this.commercialBank[1] = new CommercialBank(1000000, "BAC", this.centralbank);

        this.date = new Date(2022, 3, 1);

        this.currentInterest = (float) (0.02);

        this.account = new Account[10];
        this.account[0] = new SavingAccount(this.date, 12, this.currentInterest, "1", this.clients[0], 1000000, this.commercialBank[0]);
        this.account[1] = new CurrentAccount(this.date, this.currentInterest, "2", this.clients[1], 1000000, this.commercialBank[1]);

        this.tl = new TransactionLog[5];
    }

    public void testWhithdraw() {

        this.account[0].whithdraw(250000);
        this.tl[0] = new TransactionLog("Whithdraw: ", this.account[0], 250000);

        for (int i = 0; i < this.tl.length; i++) {
            if (this.tl[i] != null) {
                System.out.println(this.tl[i]);
            }
        }
    }

    public void testDeposit() {

        this.account[1].deposit(250000);
        this.tl[0] = new TransactionLog("Deposit: ", this.account[0], 250000);

        for (int i = 0; i < this.tl.length; i++) {
            if (this.tl[i] != null) {
                System.out.println(this.tl[i]);
            }
        }
    }

    public void testSinpeMovil() {

        String phoneSendAccount = JOptionPane.showInputDialog("Write Your phone number");
        String phoneReceiverAccount = JOptionPane.showInputDialog("Write the phone number to which tou mant to make the SinpeMóvil");

        for (int i = 0; i < this.tl.length; i++) {
            if (this.account[i] != null) {
                if (this.account[i].getClient().getPhone().equals(phoneSendAccount)) {
                    for (int j = 0; j < this.tl.length; j++) {
                        if (this.account[j] != null) {
                            if (this.account[j].getClient().getPhone().equals(phoneReceiverAccount)) {
                                this.account[0].sendSinpeMovil(this.account[1], 250000);
                                this.tl[0] = new TransactionLog("Sinpe Movil: ", this.account[0], this.account[1], 250000);
                            }
                        }
                    }
                }
            }
        }


        for (int i = 0; i < this.tl.length; i++) {
            if (this.tl[i] != null) {
                System.out.println(this.tl[i].toStringSinpeMovil());
            }
        }
    }
}
