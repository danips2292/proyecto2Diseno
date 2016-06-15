/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem;

import amortizationsystem.Controller.ConsoleController;
import amortizationsystem.Controller.GUIController;
import amortizationsystem.Model.Bank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author familia
 */
public class AmortizationSystem {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Bank bank = new Bank();
        System.out.println("Select a Interface");
        System.out.println("[1] Console \t [2] GUI");
        int option =  Integer.valueOf(input.readLine());
        if (option == 1){
            ConsoleController view = new ConsoleController();
            bank.setInterface(view);
            bank.startInterface();
            bank.getLoanFromClient();
            bank.processLoan();
            bank.SaveLoan();
            bank.showLoanData();
            
            
        }if (option == 2){
            GUIController controller = new GUIController();
            bank.setInterface(controller);
            bank.startInterface();
            bank.getLoanFromClient();
            bank.processLoan();
            bank.SaveLoan();
            bank.showLoanData();
            
                    
        }
        
        

    } 
}
