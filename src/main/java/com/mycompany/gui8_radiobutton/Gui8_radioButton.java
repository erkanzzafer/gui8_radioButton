/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gui8_radiobutton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author PC
 */
public class Gui8_radioButton {

    public static void main(String[] args) {
        JFrame frame = new JFrame("RadioButton Örneği");
        JRadioButton r1 = new JRadioButton("Kadın", true);
        r1.setActionCommand("k");
        r1.setBounds(100, 50, 100, 30);

        JRadioButton r2 = new JRadioButton("Erkek");
        r2.setBounds(100, 100, 100, 30);
        r2.setActionCommand("e");

        JRadioButton r3 = new JRadioButton("İstemiyorum");
        r3.setBounds(100, 150, 100, 30);
        r3.setActionCommand("n");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        JButton btn = new JButton("Gönder");
        btn.setBounds(100, 200, 100, 30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (r1.isSelected()) {
                    System.out.println(r1.getText() + " seçildi!");
                } else if (r2.isSelected()) {
                    System.out.println(r2.getText() + " seçildi!");
                } else if (r3.isSelected()) {
                    System.out.println(r3.getText() + " seçildi!");
                }

                System.out.println(bg.getSelection().getActionCommand());
            }
        });

        frame.add(r1);
        frame.add(r2);
        frame.add(r3);
        frame.add(btn);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
