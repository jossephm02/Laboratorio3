/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author PC
 */
public class CentralBank {

    private float finance;

    public CentralBank(float finance) {
        this.finance = finance;
    }

    public float getFinance() {
        return finance;
    }

    public void setFinance(float finance) {
        this.finance = finance;
    }

    @Override
    public String toString() {
        return "CENTRAL BANK INFORMATION"
                + "\n finance:" + this.finance;
    }
}
