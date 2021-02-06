package lak.designPatterns.structural.proxyPattern.imageSlideShow.before;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageFile implements DisplayObject{

    BufferedImage image;


    public ImageFile(String path){
        image = load(path);
    }

    /* Here I'm using Swing, which is a gooey tool kit for Java to display the image. When this method is called, the image will be displayed on the screen.*/
    @Override
    public void display() {
        ImageIcon icon = new ImageIcon(image);
        JLabel label = new JLabel(icon);
        JOptionPane.showMessageDialog(null, label);
    }

    BufferedImage load(String path) {
        BufferedImage image = null;
        try {
            /*using the image IO library to read the file from disk  I'm assigning that file to a BufferedImage object and returning it.
             This is the sorts of expensive operation that consumes time and memory that we want to limit. */
            image = ImageIO.read(new File(path));
        } catch (IOException e){
            e.printStackTrace();
        }
        return image;
    }

}
