package Practice;

import java.applet.*;
import java.awt.*;

public class JanviApplet extends Applet {
    Image picture;

    public void init() {
        picture = getImage(getDocumentBase(),
                "https://media.istockphoto.com/vectors/rainbow-arch-vector-icon-decorative-pattern-weather-symbol-color-vector-id1271087162?k=20&m=1271087162&s=612x612&w=0&h=ghPtpwj5crUIN09p423kt_qUtF_mov3yl10wGiU11Lo=");
    }

    public void paint(Graphics g) {
        g.drawImage(picture, 30, 30, this);
    }
}