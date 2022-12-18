package ICT104.week7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorChangingWindow extends JFrame implements ActionListener {
    private final JPanel panel;
    private final JLabel label;
    private final JButton redButton;
    private final JButton yellowButton;
    private final JButton blueButton;

    public ColorChangingWindow() {
        // Set the title and default close operation for the window
        super("Color Changing Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the panel and label
        panel = new JPanel();
        label = new JLabel("Click a button to change the colors!");
        panel.add(label);

        // Create the buttons and add an action listener to each
        redButton = new JButton("Red");
        redButton.addActionListener(this);
        panel.add(redButton);

        yellowButton = new JButton("Yellow");
        yellowButton.addActionListener(this);
        panel.add(yellowButton);

        blueButton = new JButton("Blue");
        blueButton.addActionListener(this);
        panel.add(blueButton);

        // Add the panel to the window
        add(panel);

        // Set the size of the window and display it
        setSize(300, 100);
        setVisible(true);
    }

    // Handle button clicks by changing the background and foreground colors
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            panel.setBackground(Color.RED);
            label.setForeground(Color.WHITE);
        } else if (e.getSource() == yellowButton) {
            panel.setBackground(Color.YELLOW);
            label.setForeground(Color.BLACK);
        } else if (e.getSource() == blueButton) {
            panel.setBackground(Color.BLUE);
            label.setForeground(Color.WHITE);
        }
    }

    public static void main(String[] args) {
        new ColorChangingWindow();
    }
}