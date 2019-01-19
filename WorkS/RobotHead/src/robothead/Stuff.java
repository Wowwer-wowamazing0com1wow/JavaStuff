package robothead;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import javax.imageio.ImageIO;

public class Stuff extends JApplet {

    Image aang;

    public void init() {
        try {
            URL pic = new URL(getDocumentBase(), "Background");
            aang = ImageIO.read(pic);
        } catch(Exception e) {
            // tell us if anything goes wrong!
            e.printStackTrace();
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        if (aang!=null) {
            g.drawImage(aang, 100, 100, this);
        }
    }
}