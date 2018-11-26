package assignment;

//a class to make the oval shaped panel

import javax.swing.*;
import java.awt.*;

public class OvalPanel extends JPanel {
    private int diameter = 10; //default diameter of the panel

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(10, 10, diameter, diameter);
    }

    public void setDiameter(int newDiameter) {
        diameter = (newDiameter >= 0 ? newDiameter : 10);
        repaint();
        }
    }
