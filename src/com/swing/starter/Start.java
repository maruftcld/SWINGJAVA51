package com.swing.starter;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.LayoutManager2;
import java.awt.Rectangle;
import java.util.EventListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class Start {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setBounds(new Rectangle(new Dimension(500, 200)));
        jf.setLayout(new FlowLayout());
        
        JButton jb = new JButton("Click");
        jb.setBounds(new Rectangle(new Dimension(20, 50)));

        jf.add(jb);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
    }
}