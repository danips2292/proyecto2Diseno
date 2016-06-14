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
import javax.xml.parsers.*;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

/**
 *
 * @author Diego
 */
public class  BCCRService extends BCCRServiceAdapter{
    
    private double exchangeSaleRate;
    private double exchangeBuyRate;
    
    // 317-Compra de Dolares 318-Venta de Dolares
    public String method(String pIndicador, String pFechaInicio, String pFechaFinal){
    
        StringBuffer response = new StringBuffer();
        
        try {
        
        String url = 
                "http://indicadoreseconomicos.bccr.fi.cr/indicadoreseconomicos/WebServices/wsIndicadoresEconomicos.asmx/"
                + "ObtenerIndicadoresEconomicosXML?tcIndicador="+pIndicador+"&tcFechaInicio="+pFechaInicio+"&tcFechaFinal="+pFechaFinal+"&tcNombre=S&tnSubNiveles=S";
        
        String request = url;

        URL serviceURL = new URL(request);
        InputStream is = serviceURL.openStream();
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        
        
        String nextLineFromService = br.readLine();
        while (nextLineFromService != null) {
            response.append(nextLineFromService);
            nextLineFromService = br.readLine();
        }
        
        System.out.println(response);
        }
        catch (Exception e) {
            System.out.println(e);
        }//End try
        
        return response.toString();
        
    }//End Method
    
    public void openXML(String xmlString){

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
        DocumentBuilder builder;  
        Document document=null;
        try{  
            builder = factory.newDocumentBuilder();  
            document = builder.parse( new InputSource( new StringReader( xmlString ) ) );  
        } catch (Exception e) {  
            e.printStackTrace();  
        } 
        
        System.out.println(document);
        
        
    }//End method
    
}//Class End
