package event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Evt1 extends JFrame implements ActionListener{
    JButton button, button2, button3;

    public Evt1() {
        button = new JButton("OK");
        button2 = new JButton("Cancel");
        button3 = new JButton("Test");
        
        
        add(button);
        add(button2);
        add(button3);
        
        
        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        setLayout(new FlowLayout());
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Evt1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource()==button){
//            System.out.println("You clicked OK");
            JOptionPane.showMessageDialog(null, "You clicked OK", "Alert", JOptionPane.INFORMATION_MESSAGE);
        }else if(e.getSource() == button3){
              JOptionPane.showMessageDialog(this, "You clicked Test", "Alert", JOptionPane.WARNING_MESSAGE);
        }
        else{
//            System.out.println("You clicked Cancel");
            JOptionPane.showMessageDialog(this, "You clicked Cancel", "Alert", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    
}
