/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rough;

import java.io.IOException;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author hksingh4343
 */
public class Rough {
    JFrame f = new JFrame(" Game Of NIM ");
    JRadioButton rb1,rb2;
    ButtonGroup G1;
    JButton b= new JButton("New Game");
    ImageIcon im;
    JLabel background;
    
    
    Rough(){
    im=new ImageIcon("/home/premnathdey/Documents/backmain.png");  //image
    background = new JLabel("",im,JLabel.CENTER); //image
    rb1 = new JRadioButton(); 
    rb2 = new JRadioButton(); 
    G1 = new ButtonGroup();
    
    b.setBounds(180, 310, 150, 30);
    rb1.setText("Easy"); 
    rb2.setText("Hard"); 
    
    background.setBounds(0, 0, 491, 480);//image
    rb1.setBounds(160, 245, 90, 25); 
    rb2.setBounds(250, 245, 90, 25); 
    
    b.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
        if(rb1.isSelected()){
            f.dispose();
            new pk();}
        else{
            f.dispose();
            new hk();
        }
    
   // op.setVisible()
   
    }
    });
    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setBackground(Color.yellow);
    
    
    
    //Container c = f.getContentPane();
    //c.setBackground(Color.red);
    f.add(background);
    f.add(rb1);
    f.add(rb2);
    G1.add(rb1); 
    G1.add(rb2);
    
    f.setBounds(500, 250, 491, 480);
    f.add(b);
    f.setResizable(false);
    f.setLayout(null);
    f.setVisible(true);
    
    }
    public static void main(String[] args) {
        new Rough();
        // TODO code application logic here
    }
    
}
