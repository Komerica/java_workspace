package ICT104.week7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangingButton {
    // ✔ Constants for window size
    final int WIDTH = 300;
    final int HEIGHT = 300;
    JFrame frame;
    JPanel panel;
    JLabel label;
    JButton redButton;
    JButton yellowButton;
    JButton blueButton;

    public ColorChangingButton() {
        // ✔ Frame & Panel
        frame = new JFrame("JFrame Example");
        panel = new JPanel();
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(new FlowLayout());
        // ✔ Components
        label = new JLabel("Click a button to change the color!");
        JButton redButton = new JButton("Red");
        JButton blueButton = new JButton("Blue");
        JButton yellowButton = new JButton("Yellow");

        // ✔ Add an action listener to each button
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                panel.setBackground(Color.RED);
                label.setForeground(Color.WHITE);
            }
        });
        blueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                panel.setBackground(Color.BLUE);
                label.setForeground(Color.WHITE);
            }
        });
        yellowButton.addActionListener(event -> {
            panel.setBackground(Color.YELLOW);
            label.setForeground(Color.BLACK);
        });

        // ✔ Adding all the components
        panel.add(label);
        panel.add(redButton);
        panel.add(blueButton);
        panel.add(yellowButton);
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ColorChangingButton();
    }
}
