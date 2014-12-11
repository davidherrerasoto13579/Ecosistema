/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodemo;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author DavidH
 */
public class PintarMar extends Thread{
    private JLabel JLabel1 = new JLabel();
    
    public PintarMar(JLabel JLabel1){
 
        this.JLabel1 = JLabel1;

    }
    
    @Override
    public void run(){
        int incremento=0;
        int x=500;
        while(true){
            incremento++;
            try{
                Thread.sleep(20);
            }catch(Exception ex){
            
            }
            if(incremento==540){
                incremento=0;
                x=540;
            }
            this.JLabel1.setLocation(x-incremento,300);

        }
        
    }
    
    
}
