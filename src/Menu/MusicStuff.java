package Menu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Boy Cakaraningrat
 */
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Boy Cakaraningrat
 */
public class MusicStuff {
    
    Clip clip;
    
    public void playMusic(String musicLocation){
        
        try{
            File musicPath = new File(musicLocation);
            
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                
                //JOptionPane.showMessageDialog(null, "presss Ok to stop");
                
            }else{
                System.out.println("Cannot load the music");
            }
            
            
        }catch(IOException | LineUnavailableException | UnsupportedAudioFileException e){
            e.printStackTrace();
        }
    }
    
    public void stopMusic(){
        clip.stop();
        
    }
}

