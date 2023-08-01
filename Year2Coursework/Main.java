//frame manipulaions Classes and packages
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;

//making it look beautiful 
import java.awt.Color;

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
    
    frame.setLayout(null);
    frame.setBackground(Color.BLACK);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
  public static void main(String args[]){
    Main object=new Main();
  }
}
