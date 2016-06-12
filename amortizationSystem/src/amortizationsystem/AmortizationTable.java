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
    
    private ArrayList<Integer> term = new ArrayList<Integer>();
    private ArrayList<Double> initialDept = new ArrayList<Double>();
    private ArrayList<Float> interests = new ArrayList<Float>();
    private ArrayList<Double> fee = new  ArrayList<Double>();

    public ArrayList<Integer> getTerm() {
        return term;
    }

    public void setTerm(ArrayList<Integer> term) {
        this.term = term;
    }

    public ArrayList<Double> getInitialDept() {
        return initialDept;
    }

    public void setInitialDept(ArrayList<Double> initialDept) {
        this.initialDept = initialDept;
    }

    public ArrayList<Float> getInterests() {
        return interests;
    }

    public void setInterests(ArrayList<Float> interests) {
        this.interests = interests;
    }

    public ArrayList<Double> getFee() {
        return fee;
    }

    public void setFee(ArrayList<Double> fee) {
        this.fee = fee;
    }
    
    
}
