package ICT104.week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {

    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        JLabel Label = new JLabel("First Number: ");
        JTextField firstTextField = new JTextField();
        firstTextField.setPreferredSize(new Dimension(70, 20));
        JLabel label2 = new JLabel("Second Number: ");
        JTextField secondTextField = new JTextField();
        secondTextField.setPreferredSize(new Dimension(70, 20));
        panel.add(Label);
        panel.add(firstTextField);
        panel.add(label2);
        panel.add(secondTextField);
        frame.add(panel, BorderLayout.NORTH);

        // create textArea
        JTextArea textArea = new JTextArea("Results will appear here");
        textArea.setRows(5);
        frame.add(textArea, BorderLayout.CENTER);

        // create buttons
        JPanel southPanel = new JPanel();
        JButton plus = new JButton("Plus");
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(firstTextField.getText());
                double secondNumber = Double.parseDouble(secondTextField.getText());
                textArea.append("\n" + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
            }
        });
        southPanel.add(plus);

        JButton minus = new JButton("Minus");
        southPanel.add(minus);
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(firstTextField.getText());
                double secondNumber = Double.parseDouble(secondTextField.getText());
                textArea.append("\n" + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
            }
        });

        JButton times = new JButton("Times");
        southPanel.add(times);
        times.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(firstTextField.getText());
                double secondNumber = Double.parseDouble(secondTextField.getText());
                textArea.append("\n" + firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
            }
        });

        JButton divides = new JButton("Divides");
        southPanel.add(divides);
        divides.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(firstTextField.getText());
                double secondNumber = Double.parseDouble(secondTextField.getText());
                textArea.append("\n" + firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
            }
        });
        frame.add(southPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);

    }
}