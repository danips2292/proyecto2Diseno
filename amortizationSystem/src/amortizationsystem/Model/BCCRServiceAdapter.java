/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem.Model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Diego
 */
public class BCCRServiceAdapter extends ResourceManager {
    
    private BCCRService service;
    
    public BCCRServiceAdapter(){
        this.service = new BCCRService();
    }
    
    @Override
    public String getResource(){
        
       Date ahora = new Date();
       SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
       
       try {
           this.service.doExchangeRate(formateador.format(ahora), formateador.format(ahora));
       } catch (JAXBException ex) {
           Logger.getLogger(BCCRServiceAdapter.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       return Double.toString(service.getExchangeBuyRate());

    }//end method
    
}//Class End
