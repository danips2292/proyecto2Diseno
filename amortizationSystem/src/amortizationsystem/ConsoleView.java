/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author familia
 */
public class ConsoleView {
    
    private String owner;
    private double amount;
    private int term;
    private float anualInterest;
    private String amortizationSystem;
    private String currency;
    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    public String getOwner() {
        return owner;
    }

    public double getAmount() {
        return amount;
    }

    public int getTerm() {
        return term;
    }

    public float getAnualInterest() {
        return anualInterest;
    }

    public String getAmortizationSystem() {
        return amortizationSystem;
    }

    public String getCurrency() {
        return currency;
    }
    
    public void setOwner(String s)
    {
        this.owner = s;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public void setAnualInterest(float anualInterest) {
        this.anualInterest = anualInterest;
    }

    public void setAmortizationSystem(String amortizationSystem) {
        this.amortizationSystem = amortizationSystem;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setInput(BufferedReader input) {
        this.input = input;
    }

    public void getUserInput()
    {
        try {
            System.out.println("Loan Consulting System");
            System.out.println("Provide the requested info:");
            System.out.println("");
            System.out.print("Your Name:");
            this.setOwner(input.readLine());
            System.out.println("");
            System.out.print("Loan Amount: ");
            this.setAmount(Double.valueOf(input.readLine()));
            System.out.println("");
            System.out.print("Term In Years: ");
            this.setTerm(Integer.valueOf(input.readLine()));
            System.out.println("");
            System.out.print("Interests Rate: ");
            this.setAnualInterest(Float.valueOf(input.readLine()));
            System.out.println("");
            System.out.println("System : German/French/American ");
            System.out.print("Your Choose: ");
            this.setAmortizationSystem(input.readLine());
            System.out.println("");
            System.out.println("Currency : Colons/Dolars ");
            System.out.print("Your Choose: ");
            this.setCurrency(input.readLine());
            System.out.println("");
        } catch (IOException ex) {
            Logger.getLogger(ConsoleView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void showResult(LoanDTO loan)
    {
       System.out.println
               ("Owner: " + loan.getOwner() + "\n" +
                "Amount: " + loan.getAmount() + "\n" +
                "Term In Years: " + loan.getTerm() + "\n" +
                "Interest Rate: " + loan.getAnualInterest() + "\n" +
                "System: " + loan.getAmortizationSystem() + "\n" +
                "Currency: " + loan.getCurrency());
    }
}
