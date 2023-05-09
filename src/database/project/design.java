package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class design extends  JFrame implements ActionListener{
    
    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2;
    
    public design()
    {
        setSize(416, 376);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        
        
        l1=new JLabel();
        l2=new JLabel();
        l3=new JLabel();
        l4=new JLabel();
        l5=new JLabel();
        
        t1=new JTextField();
        t2=new JTextField();
        
        t1.setBounds(60,20,30,20);
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
    }
    
}
