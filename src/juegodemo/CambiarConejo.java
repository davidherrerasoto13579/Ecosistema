/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodemo;

import javax.swing.JLabel;

/**
 *
 * @author DavidH
 */
public class CambiarConejo extends Thread{
    private JLabel jLabel = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    
    public CambiarConejo(JLabel jLabel,JLabel jLabel2,JLabel jLabel3){
        this.jLabel = jLabel;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
    }
    
    @Override
    public void run(){
        int bandera = 0;

        while(true){
         
            
            if(bandera==0){
                this.jLabel.setLocation(240,320);
                this.jLabel2.setLocation(290,90);
                this.jLabel3.setLocation(370,230);
                bandera++;
            }
           
            try{
            Thread.sleep(300);
            }catch(Exception ex){ }
            
            if(bandera==1){
             this.jLabel.setLocation(170,320);
             this.jLabel2.setLocation(380,110);
             this.jLabel3.setLocation(270,20);
             bandera++;
              
            }
            
             try{
             Thread.sleep(50);
            }catch(Exception ex){ }
             
            if(bandera==2){
             this.jLabel.setLocation(560,260);
             this.jLabel2.setLocation(110,230);
             this.jLabel3.setLocation(300,20);
             bandera++;
              
            }
             try{
             Thread.sleep(700);
            }catch(Exception ex){ }
             
             if(bandera==3){
             this.jLabel.setLocation(560,260);
             this.jLabel2.setLocation(110,230);
             this.jLabel3.setLocation(300,20);
             bandera=0;
        
            }
             
             
        
            
        }
    }
}
    
   

