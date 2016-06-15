/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem;

import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class GUIController implements IController, GUIObserver {
    LoanDTO inputLoan; 
    boolean inputReceived = false;
    

    
    
    
    @Override
    public void ShowLoanData(LoanDTO loan) {
        ViewResult result = new ViewResult(loan);
        result.setVisible(true);
    }

    @Override
    public void Start() {
        ViewGetUserGUI gui = new ViewGetUserGUI();
        gui.registerObserver(this);
        gui.setVisible(true);
       
    }

    @Override
    public LoanDTO getLoanDTO() {
        while (inputReceived == false){
            System.out.println("Awaiting GUI...");
        }
        return this.inputLoan;
    }
    

    @Override
    public void infoReceived(ViewGetUserGUI view1){
        
        ArrayList<String> values = view1.getValues();
        LoanDTO loan = new LoanDTO();
        loan.setOwner(values.get(0));
        loan.setAmount(Float.parseFloat(values.get(1)));
        loan.setTerm(Integer.parseInt(values.get(2)));
        loan.setAnualInterest(Float.parseFloat(values.get(3)));
        loan.setAmortizationSystem(values.get(4));
        loan.setCurrency(values.get(5));     
        this.inputLoan = loan;
        inputReceived = true;
    }
    

    
    

}
