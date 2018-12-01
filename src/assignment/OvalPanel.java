package assignment;

//a class to make the oval shaped panel

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class OvalPanel extends JPanel {
    public int diameter;
    public JSlider diamSlider;
    public JLabel diamLabel;
    public OvalShape ovalShape;

    public OvalPanel() {

        Dimension size = getPreferredSize();
        size.width = 500;
        setPreferredSize(size);

        //create components
        diamSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 300, 100);
        diamSlider.setSnapToTicks(true);
        diamSlider.setMajorTickSpacing(100);
        diamSlider.setMinorTickSpacing(25);
        diamSlider.setPaintTicks(true);
        diamSlider.setPaintLabels(true);

        diamLabel = new JLabel("Diameter = " + diameter);
        ovalShape = new OvalShape();
        ovalShape.setDiameter(diamSlider.getValue());

        //set listeners
        diamSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                diamLabel.setText("Diameter = " + diamSlider.getValue());
                ovalShape.setDiameter(diamSlider.getValue());
            }
        });


        //set layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        ////////first row////////
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(ovalShape, gbc);

        ////////second row////////
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(diamSlider, gbc);

        ////////third row////////
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(diamLabel, gbc);
    }
}
