/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem.Model;
/**
 *
 * @author familia
 */
public class FrenchAmortizationTable extends AmortizationTableBuilder {
    
    @Override
    public void buildTable(LoanDTO loan)
    {
        int term = loan.getTerm();
        double initialDept = loan.getAmount();
        float interestRate = loan.getAnualInterest();
        amortizationTable = new AmortizationTable(loan.getAmount());
        CalculateFees(term, initialDept, interestRate);
        CalculateInterests(term,interestRate);
        CalculateAmortizationFee(term, interestRate);
        CalculateDepts(term, initialDept);
    }
    @Override
    public AmortizationTable getAmortizationTable(){ return amortizationTable;}
    
    public void CalculateFees(int term, double initialDept, float anualInterest)
    {
        double interestRate = (double)(anualInterest / 100);
        double fee = initialDept*((interestRate *(Math.pow((1 + interestRate),term)))/((Math.pow((1+interestRate),term))-1));
        double feeTotal = 0;
        
        for(int termCounter = 0; termCounter < term; termCounter++)
        {
          amortizationTable.getFees().add(fee);
          feeTotal += fee;
        }
        amortizationTable.getFees().add(feeTotal);
    }
    
    public void CalculateInterests(int term, float anualInterest)
    {
        double interestRate = (double)(anualInterest / 100);
        double initialFee =  amortizationTable.getFees().get(0);
        double currentInterest;
        double interestsTotal = 0;
        
        for(int termCounter = 0; termCounter < term; termCounter++)
        {  
            currentInterest = initialFee*(1-(1/(Math.pow((1+interestRate),(term+1-(termCounter+1))))));
            amortizationTable.getInterests().add(currentInterest);
            interestsTotal += currentInterest;
        }
        amortizationTable.getInterests().add(interestsTotal);
    }   
    
    public void CalculateAmortizationFee(int term, float anualInterest)
    {
      
        double interestRate = (double)(anualInterest / 100);
        double initialFee =  amortizationTable.getFees().get(0);
        double currentFee;
        double amortizationFeeTotal = 0;
        
        for(int termCounter = 0 ; termCounter < term ; termCounter++)
        {
            currentFee = initialFee / Math.pow((1 + interestRate),(term+1-(termCounter+1)));
            amortizationTable.getAmortizationFees().add(currentFee);
            amortizationFeeTotal += currentFee; 
        }
        amortizationTable.getAmortizationFees().add(amortizationFeeTotal);
    }
    
    public void CalculateDepts(int term, double initialDept)
    {   
        double currentDept = initialDept;
        double currentAmortizationFee;
        for(int termCounter = 0; termCounter < term - 1; termCounter++)
        {
          currentAmortizationFee = amortizationTable.getAmortizationFees().get(termCounter);
          currentDept -= currentAmortizationFee;
          amortizationTable.getDepts().add(currentDept);
          
        }
    } 

}
