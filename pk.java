/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rough;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author hksingh4343
 */
public class pk {
    int j=0,k=0,x=0,m=0;

    JFrame f = new JFrame(" Game Of NIM ");
    JPanel[] p =new JPanel[4];
    int[] a = new int[4];
    
    //ImageIcon im;
    
    private Random rnd = new Random();
    JLabel background;
    JLabel[] l1,l2,l3,l4;
    
    JButton b1 = new JButton("Pile 1");
    JButton b2 = new JButton("Pile 2");
    JButton b3 = new JButton("Pile 3");
    JButton b4 = new JButton("Instruction");
    JButton b5 = new JButton("PC Move");
    
    
    pk(){
    //im=new ImageIcon("/home/hksingh4343/Documents/rsz_backg5.jpg");  //image
    //background = new JLabel("",im,JLabel.CENTER); //image
    
    for(int po=0 ; po<4 ; po++)
    {a[po] = (int )(Math.random() * 5 + 1);}
    l1 =new JLabel[a[0]];
    l2 =new JLabel[a[1]];
    l3 =new JLabel[a[2]];
    l4 =new JLabel[a[3]];
    
    for(int yu=0; yu<4;yu++){
        p[yu]=new JPanel();

    }
        
    //background.setBounds(0, 0, 720, 480);//image
    //bg.setBounds(0, 0,500,50);
    b1.setBounds(600, 15, 80, 30);
    b2.setBounds(600, 75, 80, 30);
    b3.setBounds(600, 140, 80, 30);
    b4.setBounds(240, 260, 120, 40);
    b5.setBounds(520, 260, 100, 30);
    
    
    p[0].setBounds(5, 5,500,60); 
    p[0].setBackground(java.awt.Color.green);
    p[0].setLayout(new FlowLayout(FlowLayout.CENTER));
    p[1].setBounds(5, 65,500,60); 
   p[1].setBackground(java.awt.Color.green);
    p[1].setLayout(new FlowLayout(FlowLayout.CENTER));
    p[2].setBounds(5, 125,500,60); 
    p[2].setBackground(java.awt.Color.green);
    p[2].setLayout(new FlowLayout(FlowLayout.CENTER));
    p[3].setBounds(5, 185,500,60); 
    p[3].setBackground(java.awt.Color.green);
    p[3].setLayout(new FlowLayout(FlowLayout.RIGHT));
    
    
    
    Icon ic11=new ImageIcon("/home/hksingh4343/Documents/greenback1.jpg"); 
    Icon pic=new ImageIcon("/home/hksingh4343/Documents/matcho1.gif");
    
    f.setBackground(java.awt.Color.green);
    //l.setIcon(ic11);
    
    for(int i=0;i<a[0];i++){
        l1[i]= new JLabel();
        //b[i].setEnabled(true);
        l1[i].setIcon(pic);
        p[0].add(l1[i]);
    }
    
    for(int i=0;i<a[1];i++){
        l2[i]= new JLabel();
        //b[i].setEnabled(true);
        l2[i].setIcon(pic);
        p[1].add(l2[i]);
    }
    
    for(int i=0;i<a[2];i++){
        l3[i]= new JLabel();
        //b[i].setEnabled(true);
        l3[i].setIcon(pic);
        p[2].add(l3[i]);
    }
    
    for(int i=0;i<a[3];i++){
        l4[i]= new JLabel();
        //b[i].setEnabled(true);
        l4[i].setIcon(pic);
        p[3].add(l4[i]);
    }
    
    //p[0].add(bg);
   // p.add(l);

    b1.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            l1[j].setIcon(ic11);
            b2.setEnabled(false);
            b3.setEnabled(false);
            //b4.setEnabled(false);
            j++;    
            if((a[0]-j)==0){
        b1.setEnabled(false);
    }
            if((a[0]+a[1]+a[2]-j-k-x)==0){
            JDialog d = new JDialog(f, "Result"); 
  
            // create a label 
            JLabel l = new JLabel("  Sorry, You Loose!!!"); 
            l.setBounds(80, 10, 150, 100);
            
            
            JButton bn =new JButton(" new Game");
            JButton bn2 =new JButton(" Main menu ");
            
            
            bn.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                f.dispose();
                hk op =new hk();}
            });
            bn2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                f.dispose();
                Rough op =new Rough();}
            });
            
            
            bn.setBounds(100, 150, 120, 40);
            bn2.setBounds(100,100,120, 40);
            
            
            d.add(l); 
            d.add(bn);
            d.add(bn2);
            // setsize of dialog 
            d.setBounds(500, 250, 300, 300);
            
            // set visibility of dialog 
            d.setLayout(null);
            d.setVisible(true);
            b5.setEnabled(false); //ending disable
        
    }else{
            b5.setEnabled(true);}
            
    }  
    
    });
    
    b2.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            l2[k].setIcon(ic11);
            b1.setEnabled(false);
            b3.setEnabled(false);
            //b4.setEnabled(false);
            k++;        
            if((a[1]-k)==0){
        b2.setEnabled(false);
    }
            if((a[0]+a[1]+a[2]-j-k-x)==0){JDialog d = new JDialog(f, "Result"); 
  
            // create a label 
            JLabel l = new JLabel("  Sorry, You Loose!!!"); 
            l.setBounds(80, 10, 150, 100);
            
            
            JButton bn =new JButton(" new Game");
            JButton bn2 =new JButton(" Main menu ");
            
            
            bn.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                f.dispose();
                hk op =new hk();}
            });
            bn2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                f.dispose();
                Rough op =new Rough();}
            });
            
            
            bn.setBounds(100, 150, 120, 40);
            bn2.setBounds(100,100,120, 40);
            
            
            d.add(l); 
            d.add(bn);
            d.add(bn2);
            // setsize of dialog 
            d.setBounds(500, 250, 300, 300);
            
            // set visibility of dialog 
            d.setLayout(null);
            d.setVisible(true);
            b5.setEnabled(false); //ending disable
        
    }else{
            b5.setEnabled(true);            
    }  
            }
    });
    
    b3.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            l3[x].setIcon(ic11);
            b2.setEnabled(false);
            b1.setEnabled(false);
            //4.setEnabled(false);
            x++;    
            if((a[2]-x)==0){
        b3.setEnabled(false);
    }
            if((a[0]+a[1]+a[2]-j-k-x)==0){JDialog d = new JDialog(f, "Result"); 
  
            // create a label 
            JLabel l = new JLabel("  Sorry, You Loose!!!"); 
            l.setBounds(80, 10, 150, 100);
            
            
            JButton bn =new JButton(" new Game");
            JButton bn2 =new JButton(" Main menu ");
            
            
            bn.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                f.dispose();
                hk op =new hk();}
            });
            bn2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                f.dispose();
                Rough op =new Rough();}
            });
            
            
            bn.setBounds(100, 150, 120, 40);
            bn2.setBounds(100,100,120, 40);
            
            
            d.add(l); 
            d.add(bn);
            d.add(bn2);
            // setsize of dialog 
            d.setBounds(500, 250, 300, 300);
            
            // set visibility of dialog 
            d.setLayout(null);
            d.setVisible(true);
            b5.setEnabled(false); }//ending disable
           else{
            b5.setEnabled(true);}
             
    }});
    
    
    b4.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
              JDialog d = new JDialog(f, "Instruction"); 
               String myString = 
    "<html><p>   In one move, you can remove any number of matches but only from one row.  " + 
    "  Select any 'Row button' and click it to REMOVE matches. After each move click   " +
    "  'PC move' to make the computer play. You win if you leave the LAST match for  " +
    "                      the computer." +
                       "  Who Moves First</p>"+
                       "  At the start of a game, you have the first move, unless you allow the computer "+
                       "  to play first by pressing the 'PC move' button.</html>";
            // create a label 
            JLabel l = new JLabel(myString); 
            //JLabel l1= new JLabel(" Select any 'Row button' and click it to REMOVE matches.");
            d.add(l); 
            // setsize of dialog 
            d.setBounds(320, 330, 800, 200); 
            //d.setLayout(null);
  
            // set visibility of dialog 
            d.setVisible(true);
    }  
    });
    b5.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
        
                int[] size =new int[3];
            
                size[0] = a[0]-j;	//Returns the value of pile A and stores it into an integer
		size[1] = a[1]-k;	//Returns the value of pile B and stores it into an integer
		size[2] = a[2]-x;	//Returns the value of pile C and stores it into an integer
                
                for(int i=0;i<50;i++){
                    int y = (int )(Math.random() * 3 + 0);
                    if(size[y]!=0){
                        
                        int ok = (int )(Math.random() * size[y] + 1);
                        System.out.println(y+"  "+ok+"  "+size[y] );
                        
                                    switch(y) {
				
					//If the number is 1, it then picks a random but valid value and removes it from pile B
					case 0: 
						for (int m=0;m<ok;m++)
                                                {
                                                    l1[j].setIcon(ic11);
                                                    j++;
                                                }
                                                break;
			//			pileB.remove(numChoiceB);	
						//System.out.print("\nThe computer removed " + numChoiceB + " from pile B");
				
					//If the number is 2, it then picks a random but valid value and removes it from pile C
					case 1: 
						for (int m=0;m<ok;m++)
                                                {
                                                    l2[k].setIcon(ic11);
                                                    k++;
                                                }
			//			pileC.remove(numChoiceC);
						System.out.print("\nThe computer removed " + "numChoiceC" + " from pile C");
                                                break;
                                        case 2:
                                                for(int m=0;m<ok;m++)
                                                {
                                                    l3[x].setIcon(ic11);
                                                    x++;
                                                }
                                                break;
                                                
				}
                                
                        
                        
                        break;
                    }
                }
                
                
                
		
                size[0] = a[0]-j;	//Returns the value of pile A and stores it into an integer
		size[1] = a[1]-k;	//Returns the value of pile B and stores it into an integer
		size[2] = a[2]-x;
                
                if(size[0]!=0){
                    b1.setEnabled(true);
                }
                if(size[1]!=0){
                    b2.setEnabled(true);
                }
                if(size[2]!=0){
                    System.out.println("HK"+size[2]);
                    b3.setEnabled(true);
                }
                if((size[0]+size[1]+size[2])==0){JDialog d = new JDialog(f, "Result"); 
  
            // create a label 
            JLabel l = new JLabel("  You Win!!!"); 
            l.setBounds(110, 10, 150, 100);
            
            
            JButton bn =new JButton(" new Game");
            JButton bn2 =new JButton(" Main menu ");
            
            
            bn.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                f.dispose();
                hk op =new hk();}
            });
            bn2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                f.dispose();
                Rough op =new Rough();}
            });
            
            
            bn.setBounds(100, 150, 120, 40);
            bn2.setBounds(100,100,120, 40);
            
            
            d.add(l); 
            d.add(bn);
            d.add(bn2);
            // setsize of dialog 
            d.setBounds(500, 250, 300, 300);
            
            // set visibility of dialog 
            d.setLayout(null);
            d.setVisible(true);
            b5.setEnabled(false); //ending disable
	}}  
        
    }  
    );

    
    
    
    for(int u=0;u<3;u++){
        f.add(p[u]);
    }
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setBackground(java.awt.Color.yellow);
    //f.add(background); //image
    f.add(b1);f.add(b2);f.add(b3);
    f.add(b4);
    f.add(b5);
    f.setResizable(false);//to fix the size of frame
    f.setBounds(330, 200, 720, 480);
    //f.pack();
    Container c = f.getContentPane();

c.setBackground(java.awt.Color.green);
    f.setLayout(null);
    f.setVisible(true);
    
    }
}
