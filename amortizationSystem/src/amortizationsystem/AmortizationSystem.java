/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem;

/**
 *
 * @author familia
 */
public class AmortizationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConsoleController view = new ConsoleController();
        Bank bank = new Bank();
        bank.setInterface(view);
        bank.StartInterface();
        bank.getLoanFromClient();
        bank.processLoan();
        bank.showLoanData();
    }
}
