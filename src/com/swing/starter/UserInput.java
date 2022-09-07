package com.swing.starter;

import java.awt.FlowLayout;
import javax.swing.*;

public class UserInput {
    
    JFrame jf;
    JButton jb;
    JLabel jlbl;
    JTextField jtext;

    public UserInput() {
        jf = new JFrame();
        jf.setSize(500, 400);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);       
        jb = new JButton();
        jlbl = new JLabel();
        jlbl.setText("Name");
        jtext = new JTextField();
        jtext.setSize(120, 30);
        jtext.getText();

    }
    
    
    
    public static void main(String[] args) {
        new UserInput();
    }
}