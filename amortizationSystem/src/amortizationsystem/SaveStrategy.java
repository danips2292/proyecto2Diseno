/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public interface SaveStrategy {
    public String createFile(LoanDTO loanDTO);
}
