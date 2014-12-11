/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author DavidH
 */
public class Tocar extends Thread{
    AudioStream audioStream = null;
    InputStream in = null;
    String soundFile = null;
    public Tocar(String soundFile){
       this.soundFile = soundFile;
    }
    
    public void run() {
        
        try {

            in = new FileInputStream(soundFile);
            audioStream = new AudioStream(in);
            AudioPlayer.player.start(audioStream);

        } catch (FileNotFoundException e) {
             e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
         
    }
    
}
