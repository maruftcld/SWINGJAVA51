package com.swing.starter;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class AWTScreenSize {
     JFrame jf;

    public AWTScreenSize() {
        jf = new JFrame("Screen Size");
        jf.setVisible(true);
        jf.setDefaultCloseOperation(3);
        Toolkit tk = jf.getToolkit();
        Dimension dimen = tk.getScreenSize();
        double height = dimen.getHeight();
        double width = dimen.getWidth();
        System.out.println("Height : " + dimen.getHeight());
        System.out.println("Width : " + dimen.getWidth());
        jf.setBounds(200, 200, (int) width/2, (int) height/2);
    }
     
    public static void main(String[] args) {
        new AWTScreenSize();
    }
}