//frame manipulaions Classes and packages
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Font;

//making it look beautiful 
import java.awt.Color;

//events
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.TextField;


class Main{
  JFrame frame;
  JPanel studentPanel,regularPanel,dropoutPanel;
  //forstudent
  JLabel studentName,dateOfBirth,courseName,enrollmentID,dateOfEnrollment,courseDuration,tuitionFee;
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
    studentPanel.setLayout(null);
    studentPanel.setLocation(20,25);
    //studentPanel components
    studentName=new JLabel("StudentName:");
    studentName.setBounds(10,80,100,20);
    studentName.setFont(new Font("Arial",Font.BOLD,14));
    studentName.setForeground(Color.WHITE);
    TextField studentNameTf=new TextField("Student Name");
    studentNameTf.setBounds(150,80,120,20);
    studentNameTf.setFont(new Font("Arial",Font.PLAIN,14));
    studentPanel.add(studentName);
    studentPanel.add(studentNameTf);

    


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





