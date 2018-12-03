package assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private OvalPanel ovalPanel;
    private String diam, circum, area;
    private JTextArea textArea;

    public MainFrame(String title) {
        super(title);

        //Set layout managers
        setLayout(new BorderLayout()); //main layout manager

        JPanel holder = new JPanel(); //panel to hold 2 components
        holder.setLayout(new BorderLayout());

        //create swing components
        ovalPanel = new OvalPanel();
        JButton calculate = new JButton("Calculate");
        textArea = new JTextArea(5, 5);
        textArea.setEditable(false);
        textArea.setBorder(BorderFactory.createTitledBorder("Information"));

        //populate textArea with initial values
        area = ovalPanel.areaLabel.getText();
        diam = ovalPanel.diamLabel.getText();
        circum = ovalPanel.circumLabel.getText();
        textArea.append(area + "\n");
        textArea.append(diam + "\n");
        textArea.append(circum + "\n");

        //button to recalculate values in textArea
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(null); //clear textArea
                area = ovalPanel.areaLabel.getText();
                diam = ovalPanel.diamLabel.getText();
                circum = ovalPanel.circumLabel.getText();
                textArea.append(area + "\n");
                textArea.append(diam + "\n");
                textArea.append(circum + "\n");
            }
        });

        Container c = getContentPane();

        //add components to layout
        c.add(ovalPanel, BorderLayout.CENTER);
        c.add(holder, BorderLayout.SOUTH);
        holder.add(textArea, BorderLayout.NORTH);
        holder.add(calculate, BorderLayout.SOUTH);
    }
}
