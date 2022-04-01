/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4_maven;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author student
 */
public class CustomJPanel extends JPanel {

    CustomJPanel() {
        super.setPreferredSize(new Dimension(800, 800));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

//        Rectangle2D rec = new Rectangle2D.Double(10,20,30,40);
        for (int i = 0; i < 8; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < 8; j = j + 2) {
                    Rectangle2D rec = new Rectangle2D.Double(j * 100, i * 100, 100, 100);
                    g2d.setPaint(Color.BLACK);
                    g2d.fill(rec);
                }
            } else {
                for (int z = 1; z < 8; z = z + 2) {
                    Rectangle2D rec = new Rectangle2D.Double(z * 100, i * 100, 100, 100);
                    g2d.setPaint(Color.BLACK);
                    g2d.fill(rec);
                }
            }

        }
    }

}
