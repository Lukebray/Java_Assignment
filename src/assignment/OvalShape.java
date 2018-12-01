package assignment;

import javax.swing.*;
import java.awt.*;

public class OvalShape extends JPanel {
    private int diameter = 100;
    private Color myColor = Color.RED;

    //create the actual panel
    public OvalShape() {
        Dimension size = getPreferredSize();
        size.width = 300;
        size.height= 300;
        setPreferredSize(size);
        setBorder(BorderFactory.createLoweredSoftBevelBorder());
    }

    public void setMyColor(Color theColor) {
        this.myColor = theColor;
    }

    //create the oval
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(0, 0, diameter, diameter);
        g.setColor(myColor);
    }

    //method for setting the diameter
    public void setDiameter(int newDiameter) { //method to create diameter
        //if diam invalid set to 10
        diameter = (newDiameter >=0 ? newDiameter : 10);
        repaint(); //repaint panel
    }
}
