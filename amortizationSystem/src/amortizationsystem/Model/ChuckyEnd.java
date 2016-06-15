/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizationsystem.Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class ChuckyEnd extends ResourceManager{
    
    //Atributes
    private String chuckyTime;
    
    @Override
    public String getResource(){
        
        String date;
        
        final String host = "localhost";
        final int portNumber = 8666;
        System.out.println("Creating socket to '" + host + "' on port " + portNumber);

        while (true) {
            try {
                Socket socket = new Socket(host, portNumber);
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                
                date = br.readLine();
                
                this.setChuckyTime(br.readLine());
                
                socket.close();
                break;
            } catch (IOException ex) {
                Logger.getLogger(ChuckyEnd.class.getName()).log(Level.SEVERE, null, ex);
            }//End try
            
        }// End While
        
        this.chuckyTime = date;
        
        return date;
        
    }//End Method

    /**
     * @return the chuckyTime
     */
    public String getChuckyTime() {
        return chuckyTime;
    }

    /**
     * @param chuckyTime the chuckyTime to set
     */
    public void setChuckyTime(String chuckyTime) {
        this.chuckyTime = chuckyTime;
    }
    
}//Class End
