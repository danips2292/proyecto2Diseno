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
public class GermanStrategy implements AmortizationSystemStrategy {
    
    @Override
    public ArrayList<Double> CalculateInitialDept();
    @Override
    public ArrayList<Double> CalculateFees();
    @Override
    public ArrayList<Float> CalculateInterests();
    @Override
    public ArrayList<Double> CalculateAmortizationFee();
}
