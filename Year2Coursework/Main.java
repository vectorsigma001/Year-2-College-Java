//frame manipulaions Classes and packages
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;

//making it look beautiful 
import java.awt.Color;

//events
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;


class Main{
  JFrame frame;
  JPanel studentPanel,regularPanel,dropoutPanel;
  public Main(){
    frame=new JFrame("college Coursework");
    Toolkit kit=Toolkit.getDefaultToolkit();
    Dimension screenDimension=kit.getScreenSize();
    int screenWidth=screenDimension.width;
    int screenHeight=screenDimension.height;
    frame.setSize(screenWidth,screenHeight );



    //working with studentPanel
    studentPanel=new JPanel();
    studentPanel.setSize(350,600);
    studentPanel.setBackground(new Color(155,66,245));
    studentPanel.setLocation(20,25);
    frame.add(studentPanel);
    
    //working with regularPanel
    regularPanel=new JPanel();
    regularPanel.setSize(350,600);
    regularPanel.setBackground(new Color(155,66,245));
    regularPanel.setLocation(450,25);
    frame.add(regularPanel);
   
    //working with dropoutPanel
    dropoutPanel=new JPanel();
    dropoutPanel.setSize(350,600);
    dropoutPanel.setBackground(new Color(155,66,245));
    dropoutPanel.setLocation(875,25);
    frame.add(dropoutPanel);

   
    //|$$$$$$$$$$$$$$$$$$$$$$$||Action listener||$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$/
    //setting actionlistener for theme 
    JButton changeUiColor=new JButton("Change Theme");
    changeUiColor.setLocation(450,700);
    frame.add(changeUiColor);
    changeUiColor.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        Color themeColorcheck=frame.getContentPane().getBackground();
        if(themeColorcheck==Color.BLACK){
          frame.getContentPane().setBackground(Color.WHITE);
        }
        else if(themeColorcheck==Color.BLACK){
            frame.getContentPane().setBackground(Color.BLACK);
        }
    }
  });

    
    frame.setLayout(null);
    frame.getContentPane().setBackground(Color.BLACK);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  } 
  public static void main(String args[]){
    Main object=new Main();
  }
}


