/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem.Model;

import java.util.ArrayList;

/**
 *
 * @author familia
 */
public class LoanDTO {
    
    private String owner;
    private double amount;
    private int term;
    private float anualInterest;
    private String amortizationSystem;
    private String currency;
    private AmortizationTable table;
    private ArrayList<ResourceManager> resourceManagerList;
    
    public LoanDTO(){
        this.resourceManagerList = new ArrayList();
    }
    
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public float getAnualInterest() {
        return anualInterest;
    }

    public void setAnualInterest(float anualInterest) {
        this.anualInterest = anualInterest;
    }

    public String getAmortizationSystem() {
        return amortizationSystem;
    }

    public void setAmortizationSystem(String amortizationSystem) {
        this.amortizationSystem = amortizationSystem;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    
    public AmortizationTable getTable() {
        return table;
    }

    public void setTable(AmortizationTable table) {
        this.table = table;
    }

    public ArrayList<ResourceManager> getResourceManagerList() {
        return resourceManagerList;
    }
     
   
   
}
