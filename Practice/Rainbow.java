package Practice;

import java.awt.*;
import java.applet.*;

public class Rainbow extends Applet {
    public void paint(Graphics gr) {
        gr.setColor(Color.red);
        gr.fillOval(54, 54, 200, 200);
        gr.setColor(Color.orange);
        gr.fillOval(55, 55, 190, 190);
        gr.setColor(Color.yellow);
        gr.fillOval(66, 66, 180, 180);
        gr.setColor(Color.green);
        gr.fillOval(62, 62, 170, 170);
        gr.setColor(Color.cyan);
        gr.fillOval(74, 74, 160, 160);
        gr.setColor(Color.blue);
        gr.fillOval(75, 75, 150, 150);
        gr.setColor(Color.magenta);
        gr.fillOval(85, 85, 140, 140);
    }
}
