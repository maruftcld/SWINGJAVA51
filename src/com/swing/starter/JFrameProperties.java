package com.swing.starter;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class JFrameProperties {
    JFrame jf;

    public JFrameProperties() {
        jf = new JFrame();
        jf.setVisible(true); // make a jframe visible
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close button operation
        jf.setTitle("JFrame Title"); // title of the frame
        //jf.setBounds(0, 0, 500, 400); // setting the dimension of the frame
        jf.setSize(500, 400); //set the size of the frame
        System.out.println(jf.getAlignmentX());
        System.out.println(jf.getAlignmentY());
        Rectangle rc = jf.getBounds();
        System.out.println(rc.height);
        System.out.println(rc.width);
        jf.setName("Frame-1");
        System.out.println(jf.getName());
        jf.setLayout(new CardLayout());
        //jf.setLocationRelativeTo(null); // cneter
        //jf.setLocation(200, 120); // location of the frame
        //jf.setBackground(Color.GREEN);
        //jf.setEnabled(false);
        jf.setExtendedState(1); // will open as minimized

    } 
    
    public static void main(String[] args) {
        new JFrameProperties();
    }
}