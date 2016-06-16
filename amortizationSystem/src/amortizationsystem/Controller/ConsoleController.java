/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem.Controller;

import amortizationsystem.View.ConsoleView;
import amortizationsystem.Model.LoanDTO;
import amortizationsystem.Model.BCCRServiceAdapter;
import amortizationsystem.Model.ChuckyEnd;

/**
 *
 * @author familia
 */
public class ConsoleController implements IController {
    
    LoanDTO loanDTO;
    ConsoleView consoleView;
    
    public ConsoleController()
    {
        this.consoleView = new ConsoleView();
    }
    
    @Override
    public void Start()
    {
        this.consoleView.getUserInput();
        
        LoanDTO inputLoan = new LoanDTO();
        
        inputLoan.setOwner(consoleView.getOwner());
        inputLoan.setAmount(consoleView.getAmount());
        inputLoan.setTerm(consoleView.getTerm());
        inputLoan.setAnualInterest(consoleView.getAnualInterest());
        inputLoan.setAmortizationSystem(consoleView.getAmortizationSystem());
        inputLoan.setCurrency(consoleView.getCurrency());
        inputLoan.getResourceManagerList().add(new ChuckyEnd());
        inputLoan.getResourceManagerList().add(new BCCRServiceAdapter());
        if(inputLoan.getCurrency().equals("Dolars"))
        {
            inputLoan.setAmount((double)((double)inputLoan.getAmount() / (double)Float.valueOf(inputLoan.getResourceManagerList().get(1).getResource())));
        }
        this.loanDTO = inputLoan;
        System.out.println("Console mssg: LoanDTO Wrapped");
    }
    
    @Override
    public void ShowLoanData(LoanDTO loanDTO)
    {
        this.consoleView.showResult(loanDTO);
    }

    public LoanDTO getLoanDTO() {
        return loanDTO;
    }

}
