/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4_maven;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final JFrame frame = new JFrame("APP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JPanel oknoglowne = new JPanel();
        oknoglowne.setLayout(new BorderLayout());

        frame.setLayout(new BorderLayout());

        JMenuBar menubar = new JMenuBar();
        JMenu menu = new JMenu("Menu");

        JMenuItem szachownica = new JMenuItem("szachownica");
        JMenuItem kalkulator = new JMenuItem("kalkulator");
        JMenuItem formularz = new JMenuItem("formularz");

        frame.add(oknoglowne, BorderLayout.CENTER);
        frame.add(menubar, BorderLayout.NORTH);
//        frame.add(new CustomJPanel(), BorderLayout.CENTER);
        oknoglowne.add(new CustomJPanel(), BorderLayout.CENTER);
        ActionListener sluchacz = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String var = e.getActionCommand();
                if (var.equals("kalkulator")) {
                    BorderLayout layout = (BorderLayout) oknoglowne.getLayout();

                    oknoglowne.remove(layout.getLayoutComponent(BorderLayout.CENTER));

                    oknoglowne.add(new Calculator());

                    frame.pack();

                }
                if (var.equals("szachownica")) {
                    BorderLayout layout = (BorderLayout) oknoglowne.getLayout();

                    oknoglowne.remove(layout.getLayoutComponent(BorderLayout.CENTER));

                    oknoglowne.add(new CustomJPanel());

                    frame.pack();
                }
                if (var.equals("formularz")) {
                    BorderLayout layout = (BorderLayout) oknoglowne.getLayout();

                    oknoglowne.remove(layout.getLayoutComponent(BorderLayout.CENTER));

                    oknoglowne.add(new Form());

                    frame.pack();
                }
            }
        };
        kalkulator.addActionListener(sluchacz);
        szachownica.addActionListener(sluchacz);
        formularz.addActionListener(sluchacz);

        menu.add(szachownica);
        menu.add(kalkulator);
        menu.add(formularz);

        menubar.add(menu);

        frame.pack();
        frame.setVisible(true);
    }
}
