/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author PC
 */
public class CommercialBank {

    private float finance;
    private String name;
    private CentralBank centalBank;

    public CommercialBank(float finance, String name, CentralBank centalBank) {
        this.finance = finance;
        this.name = name;
        this.centalBank = centalBank;
    }

    public float getFinance() {
        return finance;
    }

    public void setFinance(float finance) {
        this.finance = finance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CentralBank getCentalBank() {
        return centalBank;
    }

    public void setCentalBank(CentralBank centalBank) {
        this.centalBank = centalBank;
    }

    @Override
    public String toString() {
        return this.name + " Bank"
                + "\n finance: " + this.finance
                + "\n" + this.centalBank.toString();
    }

}
