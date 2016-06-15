/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem.Controller;

import amortizationsystem.Model.LoanDTO;

/**
 *
 * @author familia
 */
public interface IController {
        
    public void ShowLoanData(LoanDTO loan);
    public void Start();
    public LoanDTO getLoanDTO();
    /*
    
    haha
    */
}
