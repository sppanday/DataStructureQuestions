/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.hello;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author surendrapanday
 */
public class OrgMeHello {

    /**
     * @param args the command line arguments
     */
  private static final Dimension SIZE = new Dimension(600, 600);

  private static void createAndShowUI() {
    JFrame frame = new JFrame("SimpleSwingAnimation");
    frame.getContentPane().add(new AnimationPanel());
    frame.getContentPane().setPreferredSize(SIZE);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        createAndShowUI();
      }
    });
  }
}

@SuppressWarnings("serial")
class AnimationPanel extends JPanel {
  private static final int RADIUS = 20;
  private static final int TIMER_DELAY = 20;
  private int  xPos = 10;
  private int yPos = 100;

  public AnimationPanel() {
    setBackground(Color.blue);
    javax.swing.Timer timer = new javax.swing.Timer(TIMER_DELAY, new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        xPos++;
        yPos++;
        AnimationPanel.this.repaint();
      }
    });
    timer.start();
  }
  
  @Override
  // override a Swing JComponent's paintComponent, not the paint method
  protected void paintComponent(Graphics g) {
    super.paintComponent(g); // again to repaint the screen
    
    // set antialiasing rendering hints to smooth out the circle
    // this is not necessary but makes for prettier animation
    Graphics2D g2 = (Graphics2D)g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
        RenderingHints.VALUE_ANTIALIAS_ON);
    
    g.setColor(Color.red);
    g.fillOval(xPos  - RADIUS, yPos  - RADIUS, 2 * RADIUS, 2 * RADIUS);
  }
}