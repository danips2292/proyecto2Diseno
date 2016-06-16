/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem.Model;

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

        PrintWriter csvWriter;
        try
            {
                //String filePath= "C:\\Users\\Daniel\\Documents\\TEC\\I Semestre 2016\\Diseno\\Proyecto2\\proyecto2Diseno\\amortizationSystem\\CSVFile.csv";
                String filePath= "C:\\Users\\familia\\Beto\\Cursos\\I Semestre 2016\\Diseño de Software\\proyecto2Diseno\\amortizationSystem\\CSVFile.csv";
                //File file = new File(strFilePath);
                //String filePath = new File("").getPath();
                //filePath.concat("CSVFile.csv");
                File file = new File(filePath);
                if(!file.exists()){
                    file = new File(filePath);
                }
                csvWriter = new  PrintWriter(new FileWriter(file,true));

                AmortizationTable tab = loanDTO.getTable();
                csvWriter.print("Tipo de Cambio "+loanDTO.getResourceManagerList().get(1).getResource()+" BCCR "+","+"Datos del cliente "+","+"Cliente "+loanDTO.getOwner()+","+" Currency "+loanDTO.getCurrency()+","+" Amount "+loanDTO.getAmount()+ "," + " AnualInterest " + loanDTO.getAnualInterest() + "," + " Term " + loanDTO.getTerm()+","+" Armotization " + loanDTO.getAmortizationSystem()+","+" Table "+tab.toString(loanDTO.getTerm()));
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
