package assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private DetailsPanel detailsPanel;
    private OvalPanel ovalPanel;
    private OvalShape ovalShape;

    public MainFrame(String title) {
        super(title);

        //Set layout manager
        setLayout(new BorderLayout());


        //create swing components
        final JTextArea textArea = new JTextArea();
        JButton button = new JButton("Click me!");

        detailsPanel = new DetailsPanel();
        ovalPanel = new OvalPanel();
        ovalPanel.ovalShape.setMyColor(detailsPanel.redSlider.getValue(), detailsPanel.greenSlider.getValue(), detailsPanel.blueSlider.getValue());

        //add swing components to content pane
        Container c = getContentPane();

        c.add(button, BorderLayout.SOUTH);
        c.add(detailsPanel, BorderLayout.WEST);
        c.add(ovalPanel, BorderLayout.EAST);


        //add behaviour
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Hello\n");
            }
        });

    }
}
