package ICT104.week10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KiloConverter {
    private static final double KM_TO_MILE = 0.621371;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kilometer Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(310, 100);

        // create a label
        JLabel label = new JLabel("Enter a distance in kilometers");
        label.setBounds(5, 5, 170, 20);
        frame.add(label);

        // create a text box
        JTextField textField = new JTextField();
        textField.setBounds(190, 10, 100, 20);
        frame.add(textField);

        // create a button
        JButton button = new JButton("Press");
        button.setBounds(100,32,100,25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double kilometers = Double.parseDouble(textField.getText());
                double miles = kilometers * KM_TO_MILE;
                JOptionPane.showMessageDialog(null, kilometers + "kilometers is " + miles + " miles.");
            }
        });
        frame.add(button);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
