/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem;

import java.util.ArrayList;

/**
 *
 * @author familia
 */
public class AmortizationTable {
    
    private ArrayList<Double> depts = new ArrayList<Double>();
    private ArrayList<Double> interests = new ArrayList<Double>();
    private ArrayList<Double> fees = new  ArrayList<Double>();
    private ArrayList<Double> amortizationFees = new  ArrayList<Double>();

    public AmortizationTable(double amount)
    {
        this.getDepts().add(amount);
    }
    
    public ArrayList<Double> getDepts() {
        return depts;
    }

    public void setDepts(ArrayList<Double> depts) {
        this.depts = depts;
    }

    public ArrayList<Double> getInterests() {
        return interests;
    }

    public void setInterests(ArrayList<Double> interests) {
        this.interests = interests;
    }

    public ArrayList<Double> getFees() {
        return fees;
    }

    public void setFees(ArrayList<Double> fees) {
        this.fees = fees;
    }

    public ArrayList<Double> getAmortizationFees() {
        return amortizationFees;
    }

    public void setAmortizationFees(ArrayList<Double> amortizationFees) {
        this.amortizationFees = amortizationFees;
    }

    
    
}
