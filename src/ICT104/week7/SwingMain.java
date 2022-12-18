package ICT104.week7;

import javax.swing.*;
import java.awt.*;

public class SwingMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("JLabel By Example");
        JButton button = new JButton();

        button.setText("Button");

        panel.add(label);
        panel.add(button);

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
