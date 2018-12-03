package assignment;

import javax.swing.*;
import java.awt.*;

public class OvalShape extends JPanel {
    public int diameter, red, green, blue;
    public Color myColor;
    public double pi = 3.14;

    //create the actual panel
    public OvalShape() {
        Dimension size = getPreferredSize();
        size.width = 300;
        size.height= 300;
        setPreferredSize(size);
        setBorder(BorderFactory.createLoweredSoftBevelBorder());
    }

    //create the oval
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(myColor = new Color(red, green, blue));
        g.fillOval(0, 0, diameter, diameter);
        repaint();
    }

    //method for setting the diameter
    public void setDiameter(int newDiameter) { //method to create diameter
        //if diam invalid set to 10
        diameter = (newDiameter >=0 ? newDiameter : 10);
        repaint(); //repaint panel
    }

    public double area(double diameter) {
        double radius = diameter / 2;
        return pi*radius*radius;
    }

    public double circum(double diameter) {
        double radius  = diameter / 2;
        return 2*pi*radius;
    }
}
