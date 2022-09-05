package com.swing.starter;

import javax.swing.*;

public class JFrameExample extends JFrame{
    public static void main(String[] args) {
        JFrameExample jfe = new JFrameExample();
        jfe.setVisible(true);
    } 
}
class JFrameExample1{ 
    static void showFrame(){
        JFrame jf = new JFrame();
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        showFrame();
    } 
}
class JFrameExample2{
    static JFrame jf;
    public JFrameExample2() {
        jf = new JFrame();
    }
    public static void main(String[] args) {
        new JFrameExample2();
        jf.setVisible(true);
    } 
}


