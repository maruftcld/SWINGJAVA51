package com.swing.starter;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AddingComponent {

    JFrame jf;
    JButton jb1, jb2, jb3, jb4;
    
    public AddingComponent() {
        jf = new JFrame("Adding Components");
        jf.setSize(600, 400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(3);
        
        jb1 = new JButton("button 1");
        jb1.setBounds(15,20, 85, 25);
        jb2 = new JButton("button 2");
        jb2.setBounds(110, 20, 85, 25);
        jb3 = new JButton("button 3");
        jb3.setBounds(210, 20, 85, 25);
        jb4 = new JButton("button 4");
        jb4.setBounds(15, 60, 85, 25);
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jb4);
    }

    public static void main(String[] args) {
        new AddingComponent();
    }
}