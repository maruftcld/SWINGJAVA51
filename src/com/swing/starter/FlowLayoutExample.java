package com.swing.starter;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutExample {
    JFrame jf;
    JButton jb1, jb2, jb3, jb4, jb5;

    public FlowLayoutExample() {
        jf = new JFrame("FlowLayout Example");
        jf.setSize(900, 500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(3);
        
        LayoutManager _fl = new FlowLayout(FlowLayout.LEFT);
        //LayoutManager fl = new FlowLayout(FlowLayout.LEADING, 50, 100);
        
        jf.setLayout(_fl); // setting a layout
        jb1 = new JButton("button 1");
        //jb1.setBounds(15,20, 85, 25);
        jb2 = new JButton("button 2");
        //jb2.setBounds(110, 20, 85, 25);
        jb3 = new JButton("button 3");
        //jb3.setBounds(210, 20, 85, 25);
        jb4 = new JButton("button 4");
        //jb4.setBounds(15, 60, 85, 25);
        jb5 = new JButton("button 5");
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jb4); 
        jf.add(jb5);
       
    }
    
    
    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}