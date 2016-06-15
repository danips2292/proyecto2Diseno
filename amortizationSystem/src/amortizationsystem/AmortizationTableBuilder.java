/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem;

/**
 *
 * @author familia
 */
public abstract class AmortizationTableBuilder {
    
    protected BCCRService exchangeRate;
    protected AmortizationTable amortizationTable;
    //protected AmortizationSystemStrategy strategy;
    
    public abstract void buildTable(LoanDTO loan);
    public abstract AmortizationTable getAmortizationTable();
    
    
}
