/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodemo;

import javax.swing.JButton;

/**
 *
 * @author DavidH
 */
public class Tiempo extends Thread{
    JButton jButton = new JButton();
    
    public Tiempo(JButton jButton){
        this.jButton = jButton;
    }
    
    public void run(){
        int segundos=0;
        while(true){
            segundos++;
            try{
                Thread.sleep(1000);
            }catch(Exception ex){}
            
           this.jButton.setText(""+segundos);
        }
    }
    
}
