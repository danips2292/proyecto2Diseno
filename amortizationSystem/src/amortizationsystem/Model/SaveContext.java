/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class SaveContext {
    private SaveStrategy strategy;
    
    public SaveContext(SaveStrategy strategy){
        this.strategy = strategy;
    }
    
    public String executeStrategy(LoanDTO loanDTO){
        return strategy.createFile(loanDTO);
    }
}
