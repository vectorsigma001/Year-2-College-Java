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
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.TextField;


import java.util.ArrayList;


class Main{
  JFrame frame;
  JPanel studentPanel,regularPanel,dropoutPanel;
  //forstudent
  JLabel studentNamelb,dateOfBirthlb,courseNamelb,enrollmentIDlb,dateOfEnrollmentlb1,dateOfEnrollmentlb2,courseDurationlb,tuitionFeelb;
  

  JComboBox<String> yearDobComboBox;
  JComboBox<String> monthDobComboBox;
  JComboBox<String> dayDobComboBox;

  JComboBox<String> yearDoeComboBox;
  JComboBox<String> monthDoeCombox;
  JComboBox<String> dayDoeComboBox;
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
    studentNameTf.setBounds(140,80,120,20);
    studentNameTf.setFont(new Font("Arial",Font.PLAIN,14));
    studentPanel.add(studentNamelb);
    studentPanel.add(studentNameTf);
   
    //Date Of Birth
    dateOfBirthlb=new JLabel("Date Of Birth:");
    dateOfBirthlb.setBounds(10,120,100,20);
    dateOfBirthlb.setFont(new Font("Arial",Font.BOLD,14));
    dateOfBirthlb.setForeground(Color.WHITE);
    studentPanel.add(dateOfBirthlb);
    
    //combobox config 1 date of birth
    yearDobComboBox=new JComboBox<>();
    yearDobComboBox.setBounds(140,120, 60, 20);
    studentPanel.add(yearDobComboBox);
    monthDobComboBox=new JComboBox<>();
    monthDobComboBox=new JComboBox<>();
    monthDobComboBox.setBounds(210, 120, 70, 20);
    studentPanel.add(monthDobComboBox);
    dayDobComboBox=new JComboBox<>();
    dayDobComboBox.setBounds(290,120,60,20);
    studentPanel.add(dayDobComboBox);
    
    //config of all comboBox for date of birth
    ArrayList year=new ArrayList<>();
    String[] years={"Year","1980","1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022","2023"};
    for(String year1:years){
        year.add(year1);
    }
    for(String year1:years){
      yearDobComboBox.addItem(year1);
    }
    ArrayList month=new ArrayList<>();
    String[] months={"Month","January","February","March","April","May","June","July","August","September","October","November","December"};
    for(String month1:months){
        month.add(month1);
    }
    for(String month1:months){
      monthDobComboBox.addItem(month1);
    }
    ArrayList day=new ArrayList<>();
    String[] days={"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
    for(String day1:days){
        day.add(day1);
    }
    for(String day1:days){
      dayDobComboBox.addItem(day1);
    }

    //StudentPanel courseName
    courseNamelb=new JLabel("Course Name:");
    courseNamelb.setFont(new Font("Arial",Font.BOLD,14));
    courseNamelb.setForeground(Color.WHITE);
    courseNamelb.setBounds(10, 160,100,20);
    studentPanel.add(courseNamelb);
    TextField courseNametf=new TextField("Course Name");
    courseNametf.setFont(new Font("Arial",Font.PLAIN,14));
    courseNametf.setBounds(140,160,100,20);
    studentPanel.add(courseNametf);
    
    //studentPanel enrollmentID
    enrollmentIDlb=new JLabel("Enrollment Id:");
    enrollmentIDlb.setFont(new Font("Arial",Font.BOLD,14));
    enrollmentIDlb.setForeground(Color.WHITE);
    enrollmentIDlb.setBounds(10,200,100,20);
    studentPanel.add(enrollmentIDlb);
    TextField enrollmentIdtf=new TextField("Enrollment Id");
    enrollmentIdtf.setFont(new Font("Arial",Font.PLAIN,14));
    enrollmentIdtf.setBounds(140,200,100,20);
    studentPanel.add(enrollmentIdtf);

    //studentPanel DateOfEnrollment
     dateOfEnrollmentlb1=new JLabel("Date of");
     dateOfEnrollmentlb1.setFont(new Font("Arial",Font.BOLD,14));
     dateOfEnrollmentlb1.setForeground(Color.WHITE);
     dateOfEnrollmentlb1.setBounds(10,240,100,20);
     studentPanel.add(dateOfEnrollmentlb1);
     dateOfEnrollmentlb2=new JLabel("Enrollment:");
     dateOfEnrollmentlb2.setFont(new Font("Arial",Font.BOLD,14));
     dateOfEnrollmentlb2.setForeground(Color.WHITE);
     dateOfEnrollmentlb2.setBounds(10,260,100,20);
     studentPanel.add(dateOfEnrollmentlb2);
     
     //combobox config 1 date of enrollment
     yearDoeComboBox=new JComboBox<>();
     for(String year1:years){
      yearDoeComboBox.addItem(year1);
    }
    monthDoeCombox=new JComboBox<>();
    for(String month1:months){
      monthDoeComboBox.addItem(month1);
    }
    dayDoeComboBox=new JComboBox<>();
    for(String day1:days){
      dayDoeComboBox.addItem(day1);
    }










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





