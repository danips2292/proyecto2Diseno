/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem;

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
