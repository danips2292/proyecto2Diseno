/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class CSVFileStrategy implements SaveStrategy {

    @Override
    public String createFile(LoanDTO loanDTO) {
        
        /*String COMMA_DELIMITER = ",";
        String NEW_LINE_SEPARATOR = "\n";
        String FILE_HEADER = "holaaaaaaaa";
        try{
        //SimpleDateFormat sdf = new SimpleDateFormat();
        FileWriter fileWriter = new FileWriter("C:\\Users\\Daniel\\Documents\\TEC\\I Semestre 2016\\Diseno\\Proyecto2\\proyecto2Diseno\\amortizationSystem\\CSVFile.csv",true);
        //fileWriter.append(FILE_HEADER);
        fileWriter.append(NEW_LINE_SEPARATOR);
        fileWriter.append("\n");
        fileWriter.append("Perro");
        fileWriter.append(COMMA_DELIMITER);
        fileWriter.append("Zorro");
        //fileWriter.append(COMMA_DELIMITER);
        fileWriter.append("\n");
        fileWriter.flush();
        fileWriter.close();
        } catch (IOException ex) {
        Logger.getLogger(CSVFileStrategy.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        PrintWriter csvWriter;
        try
            {
                String filePath= "C:\\Users\\Daniel\\Documents\\TEC\\I Semestre 2016\\Diseno\\Proyecto2\\proyecto2Diseno\\amortizationSystem\\CSVFile.csv";
                //File file = new File(strFilePath);
                //String filePath = new File("").getPath();
                //filePath.concat("CSVFile.csv");
                File file = new File(filePath);
                if(!file.exists()){
                    file = new File(filePath);
                }
                csvWriter = new  PrintWriter(new FileWriter(file,true));

                AmortizationTable tab = loanDTO.getTable();
                csvWriter.print("Cliente "+loanDTO.getOwner()+","+" Currency "+loanDTO.getCurrency()+","+" Amount "+loanDTO.getAmount()+ "," + " AnualInterest " + loanDTO.getAnualInterest() + "," + " Term " + loanDTO.getTerm()+","+" Armotization " + loanDTO.getAmortizationSystem()+","+" Table "+tab.toString(loanDTO.getTerm()));
                csvWriter.append("\r\n");
                //csvWriter.print("world");


                csvWriter.close();


            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
         
        return loanDTO.getCurrency();
        
     }
}
