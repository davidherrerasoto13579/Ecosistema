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
public class MoverBoton extends Thread{
    JButton jButton1 = new JButton();
    int x;
    int y;
    public MoverBoton(JButton jButton1,int x,int y){
        this.jButton1 = jButton1;
        this.x=x;
        this.y=y;
    }
    public void run(){
        
        this.jButton1.setLocation(x,y);
        try{
            Thread.sleep(3000);
        }catch(Exception ex){}
        
    }
    
}
