package assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private OvalPanel ovalPanel;

    public MainFrame(String title) {
        super(title);

        //Set layout manager
        setLayout(new BorderLayout());

        //create swing components
        ovalPanel = new OvalPanel();
        JTextArea textArea = new JTextArea(5, 5);
        textArea.setEditable(false);

        textArea.insert("Position 1", 1);
        textArea.insert("Position 0", 0);

        //add swing components to content pane
        Container c = getContentPane();

        c.add(textArea, BorderLayout.SOUTH);
        c.add(ovalPanel, BorderLayout.EAST);
    }
}
