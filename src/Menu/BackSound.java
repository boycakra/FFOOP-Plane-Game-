package Menu;

/**
 *
 * @author Yasin
 */
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class BackSound {
    
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


