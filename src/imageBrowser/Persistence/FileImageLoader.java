package imageBrowser.Persistence;

import imageBrowser.Model.Image;
import imageBrowser.Model.RealImage;
import imageBrowser.Persistence.ImageLoader;
import imageBrowser.UI.SwingBitmap;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class FileImageLoader implements ImageLoader {
    
    private final String filename;

    public FileImageLoader(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    @Override
    public Image load() {
        return new RealImage(new SwingBitmap(loadBufferedImage()));
    }

    private BufferedImage loadBufferedImage() {
        try {
            return ImageIO.read(new File(filename));
        } 
        catch (IOException ex) {
            return null;
        }
    }
    
    
    
    

}
