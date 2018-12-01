package assignment;

import javax.swing.*;

public class appTest {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new MainFrame("My Main Frame");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(750, 500);
                frame.setVisible(true);
            }
        });
    }
}
