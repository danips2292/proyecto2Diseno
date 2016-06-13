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
public class GermanAmortizationTable extends AmortizationTableBuilder {
    
    @Override
    public void buildTable(LoanDTO loan)
    {
        int term = loan.getTerm();
        double initialDept = loan.getAmount();
        float interestRate = loan.getAnualInterest();
        amortizationTable = new AmortizationTable(loan.getAmount());
        
        CalculateAmortizationFee(term, initialDept);
        CalculateDepts(term);
        CalculateInterests(term, interestRate);
        CalculateFees(term);
    }
    @Override
    public AmortizationTable getAmortizationTable(){ return amortizationTable;}
    
    public void CalculateAmortizationFee(int term, double initialDept)
    {
 
        double amortizationFee = initialDept/term;
        setTableAmortizationFees(term, amortizationFee);
    }
    
    public void setTableAmortizationFees(int term, double amortizationFee)
    {
        for(int termCounter = 0 ; termCounter < term ; termCounter++)
        {
            amortizationTable.getAmortizationFees().add(amortizationFee);
        }
    }
    
    public void CalculateDepts(int term)
    {
        double previousDept;
        double amortizationFee = amortizationTable.getAmortizationFees().get(0);
        double nextDept;
        
        for(int termCounter = 0; termCounter < term; termCounter++)
        {
          previousDept = (double)amortizationTable.getDepts().get(termCounter);
          nextDept = previousDept - amortizationFee;
          amortizationTable.getDepts().add(nextDept);
        }
        
    }
    
    public void CalculateInterests(int term, float anualInterest)
    {
        double currentDept;
        double deptInterest;
        double interestRate = (double)anualInterest;
        for(int termCounter = 0; termCounter < term; termCounter++)
        {
            currentDept = amortizationTable.getDepts().get(termCounter);
            deptInterest = (double)(currentDept*(interestRate / 100));  
            amortizationTable.getInterests().add(deptInterest);
        }
    }

    public void CalculateFees(int term)
    {
        double fee;
        double debtInterest;
        double amortizationFee = amortizationTable.getAmortizationFees().get(0);
        
        for(int termCounter = 0; termCounter < term; termCounter++)
        {
          debtInterest = (double)amortizationTable.getInterests().get(termCounter);
          fee = amortizationFee + debtInterest;
          amortizationTable.getFees().add(fee);
        }
    }
    
}
