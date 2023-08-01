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


import java.util.ArrayList;


class Main{
  JFrame frame;
  JPanel studentPanel,regularPanel,dropoutPanel;
  //forstudent
  JLabel studentNamelb,dateOfBirthlb,courseName,enrollmentID,dateOfEnrollment,courseDuration,tuitionFee;
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

    //StudentName
    studentNamelb=new JLabel("StudentName:");
    studentNamelb.setBounds(10,80,100,20);
    studentNamelb.setFont(new Font("Arial",Font.BOLD,14));
    studentNamelb.setForeground(Color.WHITE);
    TextField studentNameTf=new TextField("Student Name");
    studentNameTf.setBounds(150,80,120,20);
    studentNameTf.setFont(new Font("Arial",Font.PLAIN,14));
    studentPanel.add(studentNamelb);
    studentPanel.add(studentNameTf);

    //Date Of Birth
    dateOfBirthlb=new JLabel("Date Of Birth:");
    dateOfBirthlb.setBounds(10,120,100,20);
    dateOfBirthlb.setFont(new Font("Arial",Font.BOLD,14));
    dateOfBirthlb.setForeground(Color.WHITE);
    studentPanel.add(dateOfBirthlb);
    
    ArrayList year=new ArrayList<>();
    String years={"Year","1980","1981", "1982", "1983", ";1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022","2023"};
    ArrayList month=new ArrayList<>();
    ArrayList day=new ArrayList<>();
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






