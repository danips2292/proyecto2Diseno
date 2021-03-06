/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem.Model;

import amortizationsystem.Controller.IController;
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
        if(this.loan.getCurrency().equals("Dollars"))
        {
            this.loan.setAmount((double)((double)this.loan.getAmount() / (double)Float.valueOf(this.loan.getResourceManagerList().get(1).getResource())));
        }
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
    
    public void SaveLoan(){
        SaveContext context2 = new SaveContext(new XMLFileStrategy());
        System.out.println("Xml Pruebaaaaaa" + context2.executeStrategy(this.loan));
        SaveContext context = new SaveContext(new CSVFileStrategy());
        System.out.println("Prueba " + context.executeStrategy(this.loan));
    }
    
    public void setAmortizationTable()
    {
        this.loan.setTable( this.tableBuilder.getAmortizationTable());
    }
   
}
