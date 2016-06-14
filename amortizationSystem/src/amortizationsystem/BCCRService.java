/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.*;
import javax.xml.transform.stream.StreamSource;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

/**
 *
 * @author Diego
 */
public class  BCCRService extends BCCRServiceAdapter{

    private double exchangeBuyRate;
    
    // 317-Compra de Dolares 318-Venta de Dolares
    public String getExchangeRate(String pIndicador, String pFechaInicio, String pFechaFinal){
    
        StringBuffer response = new StringBuffer();
        
        try {
        
        String indicador = "318"; // 317-Compra de Dolares 318-Venta de Dolares
        String fechaInicio = "2016/06/14";
        String fechaFinal = "2016/06/14";
        
        String url = 
                "http://indicadoreseconomicos.bccr.fi.cr/indicadoreseconomicos/WebServices/wsIndicadoresEconomicos.asmx/"
                + "ObtenerIndicadoresEconomicosXML?tcIndicador="+pIndicador+"&tcFechaInicio="+pFechaInicio+"&tcFechaFinal="+pFechaFinal+"&tcNombre=S&tnSubNiveles=S";

        URL serviceURL = new URL(url);
        InputStream is = serviceURL.openStream();
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
   
        String nextLineFromService = br.readLine();
        while (nextLineFromService != null) {
            response.append(nextLineFromService);
            nextLineFromService = br.readLine();
        }

        }catch (Exception e) {
            System.out.println(e);
        }
        
        return response.toString();
        
    }//End Method
    
    public double getExchangeOfXML(String pResponse) throws JAXBException{

        String Exchange = null;
        
        JAXBContext jc = JAXBContext.newInstance(String.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        StreamSource xmlSource = new StreamSource(new StringReader(pResponse.toString()));
        JAXBElement<String> je = unmarshaller.unmarshal(xmlSource, String.class);
        String[] values =je.getValue().split(" ");
        for (String value: values){
            if (value.startsWith("<NUM_VALOR>")){
                String[] cutA = value.split(">");
                System.out.println(cutA[1].split("<")[0]);
                Exchange = cutA[1].split("<")[0];
            }
        }
        
        return Double.parseDouble(Exchange);

    }//End method
    
    public void doExchangeRate(String pFechaInicio, String pFechaFinal) throws JAXBException{
        
        String buy = this.getExchangeRate("318", pFechaInicio, pFechaFinal);
        this.setExchangeBuyRate(this.getExchangeOfXML(buy));
        
    }

    /**
     * @return the exchangeBuyRate
     */
    public double getExchangeBuyRate() {
        return exchangeBuyRate;
    }

    /**
     * @param exchangeBuyRate the exchangeBuyRate to set
     */
    public void setExchangeBuyRate(double exchangeBuyRate) {
        this.exchangeBuyRate = exchangeBuyRate;
    }
    
}//Class End
