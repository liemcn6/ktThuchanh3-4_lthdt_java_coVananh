/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KiemTra;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Hoang Ngoc Anh
 */
public class Shape extends javax.swing.JPanel {
    private Rectangle2D.Double r1 = new Rectangle2D.Double(20, 20, 400, 100);
    private Rectangle2D.Double r2 = new Rectangle2D.Double(20, 125, 400, 400);
    private Rectangle2D.Double r3 = new Rectangle2D.Double(170, 150, 25, 75);
    private Line2D.Double l1 = new Line2D.Double(220, 120, 220, 520);
    private Line2D.Double l2 = new Line2D.Double(220, 470, 275, 525);
    private Ellipse2D.Double e1 = new Ellipse2D.Double(170, 345, 25, 25);
    private Ellipse2D.Double e2 = new Ellipse2D.Double(245, 345, 25, 25);
    private Ellipse2D.Double e3 = new Ellipse2D.Double(245, 245, 60, 75);
    private Ellipse2D.Double e4 = new Ellipse2D.Double(270, 270, 25, 25);
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g; 
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(5));
        g2d.draw(r1);  g2d.draw(r2); g2d.draw(r3);
        
        g2d.setFont(new Font("Times New Roman", Font.BOLD, 50));
        g2d.drawString("Phòng 305", 120, 95);
        g2d.draw(l1); g2d.draw(l2);
        g2d.draw(e1); g2d.draw(e2); g2d.draw(e3); g2d.draw(e4);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
