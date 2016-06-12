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
    
    protected ExchangeRate exchangeRate;
    protected AmortizationTable amortizationTable;
    protected AmortizationSystemStrategy strategy;
    
    public abstract void buildTable(AmortizationSystemType system);
    public abstract AmortizationTable getAmortizationTable();
    
    
}
