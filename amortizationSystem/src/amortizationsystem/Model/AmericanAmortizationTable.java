/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem.Model;

/**
 *
 * @author familia
 */
public class AmericanAmortizationTable extends AmortizationTableBuilder {
    
    @Override
    public void buildTable(LoanDTO loan)
    {
        int term = loan.getTerm();
        double initialDept = loan.getAmount();
        float interestRate = loan.getAnualInterest();
        amortizationTable = new AmortizationTable(loan.getAmount());
        
        CalculateDepts(term, initialDept);
        CalculateInterests(term, interestRate);
        CalculateAmortizationFee(term, initialDept);
        CalculateFees(term, initialDept);
    }
    @Override
    public AmortizationTable getAmortizationTable(){ return amortizationTable;}
    
    public void CalculateDepts(int term, double initialDept)
    {   
        for(int termCounter = 1; termCounter < term; termCounter++)
        {
          amortizationTable.getDepts().add(initialDept);
        }
    }    

    public void CalculateInterests(int term, float anualInterest)
    {
        double interestRate = (double)anualInterest;
        double initialDept =  amortizationTable.getDepts().get(0);
        double deptInterest = (double)(initialDept*(interestRate / 100));
        setInterests(term, deptInterest);
    }
    
    public void setInterests(int term, double interest)
    {
        double interestsTotal = 0;
        for(int termCounter = 0; termCounter < term; termCounter++)
        {  
            amortizationTable.getInterests().add(interest);
            interestsTotal += interest;
        }
        amortizationTable.getInterests().add(interestsTotal);
    }
    
    public void CalculateAmortizationFee(int term, double initialDept)
    {
        double amortizationFeeTotal = initialDept; 
                
        for(int termCounter = 1 ; termCounter < term ; termCounter++)
        {
            amortizationTable.getAmortizationFees().add(0.0);
        }
        amortizationTable.getAmortizationFees().add(initialDept);
        amortizationTable.getAmortizationFees().add(amortizationFeeTotal);
    }

    public void CalculateFees(int term, double initialDept)
    {
        double interest;
        double amortization;
        double fee;
        double finalFee = 0;
      
        for(int termCounter = 0; termCounter <= term; termCounter++)
        {
          interest = amortizationTable.getInterests().get(termCounter);
          amortization = amortizationTable.getAmortizationFees().get(termCounter);
          fee = interest + amortization;
          amortizationTable.getFees().add(fee);
        }
        
    }
}
