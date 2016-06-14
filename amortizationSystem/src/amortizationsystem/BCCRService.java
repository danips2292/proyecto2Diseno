/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author Diego
 */
public class  BCCRService extends BCCRServiceAdapter{
    
    private double exchangeRate;
    
    
    public void method(String pIndicador, String pFechaInicio, String pFechaFinal){
    
        try {
        
        String url = 
                "http://indicadoreseconomicos.bccr.fi.cr/indicadoreseconomicos/WebServices/wsIndicadoresEconomicos.asmx/"
                + "ObtenerIndicadoresEconomicosXML?tcIndicador="+pIndicador+"&tcFechaInicio="+pFechaInicio+"&tcFechaFinal="+pFechaFinal+"&tcNombre=S&tnSubNiveles=S";
        
        String request = url;

        URL serviceURL = new URL(request);
        InputStream is = serviceURL.openStream();
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        
        StringBuffer response = new StringBuffer();
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
        
    }//End Method
    
}//Class End
