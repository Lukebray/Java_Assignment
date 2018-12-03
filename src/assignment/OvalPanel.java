package assignment;

//a class to make the oval shaped panel

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class OvalPanel extends JPanel {
    public JSlider diamSlider, redSlider, greenSlider, blueSlider;
    public JLabel diamLabel, circumLabel, areaLabel;
    public OvalShape ovalShape;

    public OvalPanel() {

        Dimension size = getPreferredSize();
        size.width = 750;
        setPreferredSize(size);
        setBorder(BorderFactory.createLoweredSoftBevelBorder());

        //create components
        redSlider = new JSlider(SwingConstants.VERTICAL, 0, 255, 0);
        greenSlider = new JSlider(SwingConstants.VERTICAL, 0, 255, 0);
        blueSlider = new JSlider(SwingConstants.VERTICAL, 0, 255, 0);

        diamSlider = new JSlider(SwingConstants.VERTICAL, 0, 300, 100);
        diamSlider.setSnapToTicks(true);
        diamSlider.setMajorTickSpacing(100);
        diamSlider.setMinorTickSpacing(25);
        diamSlider.setPaintTicks(true);
        diamSlider.setPaintLabels(true);

        diamLabel = new JLabel("Diameter = " + diamSlider.getValue());

        //set listeners
        diamSlider.addChangeListener(
                new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ovalShape.setDiameter(diamSlider.getValue());
                diamLabel.setText("Diameter = " + diamSlider.getValue());
                areaLabel.setText("Area = " + ovalShape.area(diamSlider.getValue()));
                circumLabel.setText("Circumference = " + ovalShape.circum(diamSlider.getValue()));
            }
        });

        redSlider.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        ovalShape.red = redSlider.getValue();
                    }
                }
        );

        greenSlider.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        ovalShape.green = greenSlider.getValue();
                    }
                }
        );

        blueSlider.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        ovalShape.blue = blueSlider.getValue();
                    }
                }
        );

        ovalShape = new OvalShape();
        ovalShape.setDiameter(diamSlider.getValue());
        areaLabel = new JLabel("Area = " + ovalShape.area(diamSlider.getValue()));
        circumLabel = new JLabel("Circumference = " + ovalShape.circum(diamSlider.getValue()));

        //set layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(0,10,0,10);

        ////////first column////////
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(diamSlider, gbc);

        ////////second column////////
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(redSlider, gbc);

        ////////third column////////
        gbc.gridx = 2;
        gbc.gridy = 0;
        add(greenSlider, gbc);

        ////////fourth column////////
        gbc.gridx = 3;
        gbc.gridy = 0;
        add(blueSlider, gbc);

        ////////fifth column////////
        gbc.gridx = 4;
        gbc.gridy = 0;
        add(ovalShape, gbc);
    }
}
