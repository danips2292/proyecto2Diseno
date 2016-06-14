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
        Bank bank = new Bank();
        GUIController controller = new GUIController();
        bank.setInterface(controller);
        bank.startInterface();
        bank.getLoanFromClient();

    }   
}
