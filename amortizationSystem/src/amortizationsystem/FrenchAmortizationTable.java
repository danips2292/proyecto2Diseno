/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem;

/**
 *
 * @author familia
 */
public class FrenchAmortizationTable extends AmortizationTableBuilder {
    
    public FrenchAmortizationTable()
    {
        this.strategy = new FrenchStrategy();
    }
    @Override
    public void buildTable(AmortizationSystemType system)
    {
        amortizationTable.setInitialDept(strategy.CalculateInitialDept());
    }
    @Override
    public AmortizationTable getAmortizationTable(){ return amortizationTable;}
    
}
