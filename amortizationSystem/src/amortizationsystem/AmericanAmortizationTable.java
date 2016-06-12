/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem;

/**
 *
 * @author familia
 */
public class AmericanAmortizationTable extends AmortizationTableBuilder {
    

    public AmericanAmortizationTable()
    {
        this.strategy = new AmericanStrategy();
    }
    @Override
    public void buildTable(AmortizationSystemType system)
    {
        amortizationTable.setInitialDept(strategy.CalculateInitialDept());
    }
    @Override
    public AmortizationTable getAmortizationTable(){ return amortizationTable;}
    
}
