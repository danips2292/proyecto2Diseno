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
public class Bank {
    
    private IController userInterface;;
    private LoanDTO loan;
    AmortizationTableBuilder tableBuilder;
    AmortizationTable table;
            
    public void setInterface(IController pInterface)
    {
        this.userInterface = pInterface;
    }
    public void startInterface()
    {
        this.userInterface.Start();
    }
    
    public void getLoanFromClient()
    {
        
        this.loan = this.userInterface.getLoanDTO();
    }
    
    public void showLoanData()
    {
        this.userInterface.ShowLoanData(loan);
    }
    public void processLoan()
    {
        buildAmortizationTable(loan);
        setAmortizationTable();
    }
    public void buildAmortizationTable(LoanDTO loanDTO)
    {
        String amortizationSystem = loanDTO.getAmortizationSystem();
        
        switch(amortizationSystem)
        {
            case("German"):
                this.tableBuilder = new GermanAmortizationTable();
                break;
            case("French"):
                this.tableBuilder = new FrenchAmortizationTable();
                break;
            case("American"):
                this.tableBuilder = new AmericanAmortizationTable();
                break;
            default:
                System.out.println("Invalid System");
        }
        
        tableBuilder.buildTable(loanDTO);
    }
    
    public void setAmortizationTable()
    {
        this.loan.setTable( this.tableBuilder.getAmortizationTable());
    }
   
}
