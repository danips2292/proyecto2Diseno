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
public interface AmortizationSystemStrategy {
    
    public ArrayList<Double> CalculateInitialDept();
    public ArrayList<Double> CalculateFees();
    public ArrayList<Float> CalculateInterests();
    public ArrayList<Double> CalculateAmortizationFee();

}
