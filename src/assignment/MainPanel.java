package assignment;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MainPanel extends JFrame {
    private JSlider diamSlider, redSlider, blueSlider, greenSlider;
    private JLabel redLabel, blueLabel, greenLabel;
    private OvalPanel oval;

    public MainPanel () {
        super("My Project");

        oval = new OvalPanel();
        oval.setBackground(Color.BLACK);

        //create the sliders
        diamSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
        redSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 255, 0);
        greenSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 255, 0);
        blueSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 255, 0);

        //set slider parameters
        diamSlider.setMajorTickSpacing(10);
        diamSlider.setPaintTicks(true);

        //create the labels
        redLabel = new JLabel("Red = 0");
        greenLabel = new JLabel("Green = 0");
        blueLabel = new JLabel("Blue = 0");

        //do event listeners for sliders
        diamSlider.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        oval.setDiameter(diamSlider.getValue());
                    }
                }
                );

        redSlider.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        redLabel.setText("Red = " + redSlider.getValue());
                    }
                }
        );

        greenSlider.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        greenLabel.setText("Green = " + greenSlider.getValue());
                    }
                }
        );

        blueSlider.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        blueLabel.setText("Blue = " + blueSlider.getValue());
                    }
                }
        );
        //add components to layout
        //add(diamSlider, BorderLayout.NORTH);
        add(redSlider, BorderLayout.NORTH);
        add(redLabel, BorderLayout.CENTER);
        //add(greenSlider, BorderLayout.SOUTH);
        //add(blueSlider, BorderLayout.SOUTH);
        //add(oval, BorderLayout.CENTER);

    }
}
