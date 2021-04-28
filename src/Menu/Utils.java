package Menu;



import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class Utils {
    public static Image loadImageFromFile(String url) {
        Image image = null;
        try {
            image = ImageIO.read(new File("images/" + url));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }
}
