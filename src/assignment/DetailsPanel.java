package assignment;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;


public class DetailsPanel extends JPanel {

    private JSlider redSlider, blueSlider, greenSlider;
    private JLabel redLabel, blueLabel, greenLabel;

    public DetailsPanel() {


        Dimension size = getPreferredSize();
        size.width = 250;
        setPreferredSize(size);

        setBorder(BorderFactory.createTitledBorder("Sliders"));

        //create components

        redLabel = new JLabel("Red = 0");
        greenLabel = new JLabel("Green = 0");
        blueLabel = new JLabel("Blue = 0");

        redSlider = new JSlider(SwingConstants.VERTICAL, 0, 255, 0);
        redSlider.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        redLabel.setText("Red = " + redSlider.getValue());
                    }
                }
        );

        greenSlider = new JSlider(SwingConstants.VERTICAL, 0, 255, 0);
        greenSlider.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        greenLabel.setText("Green = " + greenSlider.getValue());
                    }
                }
        );

        blueSlider = new JSlider(SwingConstants.VERTICAL, 0, 255, 0);
        blueSlider.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        blueLabel.setText("Blue = " + blueSlider.getValue());
                    }
                }
        );

        //create layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        /////// FIRST ROW //////////

        gbc.gridy = 0;
        gbc.gridx = 0;
        add(redSlider, gbc);

        gbc.gridy = 0;
        gbc.gridx = 1;
        add(greenSlider, gbc);

        gbc.gridy = 0;
        gbc.gridx = 2;
        add(blueSlider, gbc);

        ///////// SECOND ROW ////////////
        gbc.weightx = 1;

        gbc.gridy = 1;
        gbc.gridx = 0;
        add(redLabel, gbc);

        gbc.gridy = 1;
        gbc.gridx = 1;
        add(greenLabel, gbc);

        gbc.gridy = 1;
        gbc.gridx = 2;
        add(blueLabel, gbc);
    }
}
