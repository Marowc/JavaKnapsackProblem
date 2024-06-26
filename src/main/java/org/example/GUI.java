package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JPanel panel1;
    private JTextField numberTextField1;
    private JTextField seedTextField1;
    private JTextField capacityTextField1;
    private JButton button1;
    private JTextArea resultTextArea1;
    private JTextArea instanceTextArea1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("KnapsackGUI");
        frame.setContentPane(new GUI().panel1);
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public GUI() {

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(numberTextField1.getText());
                int seed = Integer.parseInt(seedTextField1.getText());
                int capacity = Integer.parseInt(capacityTextField1.getText());
                int lowerBound = 1;
                int upperBound = 10;

                Problem problem = new Problem(number, seed, lowerBound, upperBound);
                instanceTextArea1.setText(problem.toString());
                Result result = problem.Solve(capacity);
                resultTextArea1.setText(result.toString());

            }
        });
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        final JPanel spacer1 = new JPanel();
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel1.add(spacer1, gbc);
        final JLabel label1 = new JLabel();
        label1.setText("Number");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label1, gbc);
        numberTextField1 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(numberTextField1, gbc);
        final JLabel label2 = new JLabel();
        label2.setText("Seed");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label2, gbc);
        seedTextField1 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(seedTextField1, gbc);
        final JLabel label3 = new JLabel();
        label3.setText("Capacity");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label3, gbc);
        capacityTextField1 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(capacityTextField1, gbc);
        button1 = new JButton();
        button1.setHideActionText(false);
        button1.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(button1, gbc);
        final JLabel label4 = new JLabel();
        label4.setText("Result");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label4, gbc);
        final JLabel label5 = new JLabel();
        label5.setText("Instance");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel1.add(label5, gbc);
        final JPanel spacer2 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel1.add(spacer2, gbc);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.gridheight = 10;
        gbc.weightx = 0.1;
        gbc.fill = GridBagConstraints.BOTH;
        panel1.add(panel2, gbc);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 10;
        gbc.weightx = 0.1;
        gbc.fill = GridBagConstraints.BOTH;
        panel1.add(panel3, gbc);
        final JScrollPane scrollPane1 = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridheight = 9;
        gbc.weightx = 1.0;
        gbc.weighty = 14.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel1.add(scrollPane1, gbc);
        instanceTextArea1 = new JTextArea();
        instanceTextArea1.setEditable(false);
        scrollPane1.setViewportView(instanceTextArea1);
        final JScrollPane scrollPane2 = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.weightx = 1.0;
        gbc.weighty = 50.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel1.add(scrollPane2, gbc);
        resultTextArea1 = new JTextArea();
        resultTextArea1.setEditable(false);
        scrollPane2.setViewportView(resultTextArea1);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }

}