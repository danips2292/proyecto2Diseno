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
    
    
    public String toString(int term)
    {
        String header = "Amortization Table\n";
        String rowTags = "\nTerm k\t\tInitialDept\t\tInterests(sk)\t\tAmortization(vk)\tFee(ck)";
        String values = "";
        String tableString = "";
        String total = "\ntotal\t\t\t\t\t" + interests.get(term) + "\t\t" + amortizationFees.get(term) + "\t\t" + fees.get(term);
        for(int termCounter = 0; termCounter < term; termCounter++)
        {
   
            values = values.concat("\n" + (termCounter+1) + "\t\t" + depts.get(termCounter) +
                                   "\t\t" + interests.get(termCounter)+ "    \t\t" + amortizationFees.get(termCounter)+
                                   "\t\t" + fees.get(termCounter));  
        }
        //System.out.print(values);
        tableString = header + rowTags + values + total;
        return tableString; 
    }

    
    
}
