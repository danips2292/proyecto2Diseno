/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem;

/**
 *
 * @author familia
 */
public class Bank {
    
    private IController userInterface;
    private LoanDTO loan;
    
    public void setInterface(IController pInterface)
    {
        this.userInterface = pInterface;
    }
    
}
