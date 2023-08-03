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
import javax.swing.JOptionPane; 
import java.awt.TextField;


import java.util.ArrayList;

//optional package
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

class Main{
  static final int INVALID=-1;
  JFrame frame;
  JPanel studentPanel,regularPanel,dropoutPanel;
  //forstudent
  JLabel studentNamelb,dateOfBirthlb,courseNamelb,enrollmentIDlb,dateOfEnrollmentlb1,dateOfEnrollmentlb2,courseDurationlb1,courseDurationlb2,tuitionFeelb;
  

  JComboBox<String> yearDobComboBox;
  JComboBox<String> monthDobComboBox;
  JComboBox<String> dayDobComboBox;

  JComboBox<String> yearDoeComboBox;
  JComboBox<String> monthDoeComboBox;
  JComboBox<String> dayDoeComboBox;
  JButton addStudentbt,clearStudentButtonbt,displayStudentButtonbt;
  TextField studentNameTf,courseNametf,enrollmentIdtf,courseDurationtf,tuitionFeetf;
  //storing data of student class in a arraylist
  ArrayList<Student> studental=new ArrayList<>();
  //for regular
  JLabel numOfModuleslb,numOfCreditHourslb,dayPresentlb;
  TextField numOfModulestf,numOfCreditHourstf,numOfDaysPresenttf;
  JButton addRegularbt,displayRegularButtonbt;
  //storing data of regular class in a arraylist
  ArrayList<RegularStudent> regularal=new ArrayList<>();






  public Main(){
    try{
     UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(frame,"This OS doesnot support this look");
    }

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
    studentNameTf=new TextField();
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
    courseNametf=new TextField();
    courseNametf.setFont(new Font("Arial",Font.PLAIN,14));
    courseNametf.setBounds(140,160,120,20);
    studentPanel.add(courseNametf);
    
    //studentPanel enrollmentID
    enrollmentIDlb=new JLabel("Enrollment Id:");
    enrollmentIDlb.setFont(new Font("Arial",Font.BOLD,14));
    enrollmentIDlb.setForeground(Color.WHITE);
    enrollmentIDlb.setBounds(10,200,100,20);
    studentPanel.add(enrollmentIDlb);
    enrollmentIdtf=new TextField();
    enrollmentIdtf.setFont(new Font("Arial",Font.PLAIN,14));
    enrollmentIdtf.setBounds(140,200,120,20);
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
    yearDoeComboBox.setBounds(140,260, 60, 20);
    studentPanel.add(yearDoeComboBox);
    monthDoeComboBox=new JComboBox<>();
    for(String month1:months){
      monthDoeComboBox.addItem(month1);
    }
    monthDoeComboBox.setBounds(210, 260, 70, 20);
    studentPanel.add(monthDoeComboBox);
    dayDoeComboBox=new JComboBox<>();
    for(String day1:days){
      dayDoeComboBox.addItem(day1);
    }
    dayDoeComboBox.setBounds(290,260,60,20);
    studentPanel.add(dayDoeComboBox);

    //studentPanel courseDurationlb
    courseDurationlb1=new JLabel("Course");
    courseDurationlb1.setFont(new Font("Arial",Font.BOLD,14));
    courseDurationlb1.setForeground(Color.WHITE);
    courseDurationlb1.setBounds(10,300,100,20);
    studentPanel.add(courseDurationlb1);
    courseDurationlb2=new JLabel("Duration:");
    courseDurationlb2.setFont(new Font("Arial",Font.BOLD,14));
    courseDurationlb2.setForeground(Color.WHITE);
    courseDurationlb2.setBounds(10,320,100,20);
    studentPanel.add(courseDurationlb2);
    courseDurationtf=new TextField();
    courseDurationtf.setFont(new Font("Arial",Font.PLAIN,14));
    courseDurationtf.setBounds(140,320,120,20);
    studentPanel.add(courseDurationtf);

    //studentPanel Tuition Feelb
    tuitionFeelb=new JLabel("Tuition Fee:");
    tuitionFeelb.setFont(new Font("Arial",Font.BOLD,14));
    tuitionFeelb.setForeground(Color.WHITE);
    tuitionFeelb.setBounds(10,360,100,20);
    studentPanel.add(tuitionFeelb);
    tuitionFeetf=new TextField();
    tuitionFeetf.setFont(new Font("Arial",Font.PLAIN,14));
    tuitionFeetf.setBounds(140,360,120,20);
    studentPanel.add(tuitionFeetf);
   

    //configuring button in student Panel
    addStudentbt=new JButton("Add Student");
    addStudentbt.setFont(new Font("Arial",Font.BOLD,14));
    addStudentbt.setBounds(10,440,140,20);
    studentPanel.add(addStudentbt);

    clearStudentButtonbt=new JButton("Clear");
    clearStudentButtonbt.setFont(new Font("Arial",Font.BOLD,14));
    clearStudentButtonbt.setBounds(180,440,140,20);
    studentPanel.add(clearStudentButtonbt);
   
    displayStudentButtonbt=new JButton("Display");
    displayStudentButtonbt.setFont(new Font("Arial",Font.BOLD,14));
    displayStudentButtonbt.setBounds(100,480,140,20);
    studentPanel.add(displayStudentButtonbt); 
    displayStudentButtonbt.setVisible(false);



    frame.add(studentPanel);



    
    //working with regularPanel
    regularPanel=new JPanel();
    regularPanel.setSize(350,600);
    regularPanel.setBackground(new Color(155,66,245));
    regularPanel.setLayout(null);
    regularPanel.setLocation(450,25);
    frame.add(regularPanel);
    
    
  
   
    //working with dropoutPanel
    dropoutPanel=new JPanel();
    dropoutPanel.setSize(350,600);
    dropoutPanel.setBackground(new Color(155,66,245));
    dropoutPanel.setLocation(875,25);
    frame.add(dropoutPanel);

    
    frame.setLayout(null);
    frame.getContentPane().setBackground(Color.BLACK);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

     //|$$$$$$$$$$$$$$$$$$$$$$$||Action listener||$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$/

    addStudentbt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        String studentName=getStudentName();
        if(studentName.equals("")){
            JOptionPane.showMessageDialog(frame,"Give your Coursename");
            return;
      }
        String dataOfBirth=getStudentDateOfBirth();
        if(dataOfBirth==null){
          JOptionPane.showMessageDialog(frame,"Select your date of birth");
          return;
        }
        String courseName=getStudentCourseName();
        if(courseName.equals("")){
          JOptionPane.showMessageDialog(frame,"Select your CourseName");
          return;
        }
        int enrollmentId=getStudentEnrollmentId();
        if(enrollmentId==INVALID){
          JOptionPane.showMessageDialog(frame,"Select proper enrollment id");
          return;
        }
        String dateOfEnrollment=getStudentDateOfEnrollment();
        if(dateOfEnrollment==null){
          JOptionPane.showMessageDialog(frame,"Select your date of enrollment");
          return;
        }
        int courseDuration=getStudentCourseDuration();
        if(courseDuration==INVALID){
          JOptionPane.showMessageDialog(frame,"Select your Course Duration");
          return;
          }
        int tuitionFee=getStudentTuitionFee();
        if(tuitionFee==INVALID){
          JOptionPane.showMessageDialog(frame,"Select your Tuition Fee");
          return;
        }

        Student s1=new Student(studentName, dataOfBirth, courseName, enrollmentId, dateOfEnrollment, courseDuration, tuitionFee);
        studental.add(s1);
        JOptionPane.showMessageDialog(studentPanel,"Student record successfully recorded");
        displayStudentButtonbt.setVisible(true);
      }  
    });
    
    displayStudentButtonbt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        String students="";
        for(Student object:studental){
          students+=object.toString()+"\n";
        }
        JOptionPane.showMessageDialog(frame,students);
      }
    });
  /////////////////////////////working with regularPanel///////////////////////////////////////////////////////
     
// Components for the regularPanel
          
    //Number of Modules Label and Textfield
    numOfModuleslb=new JLabel("Number of Modules:");
    numOfModuleslb.setBounds(10,80,150,20);
    numOfModuleslb.setFont(new Font("Arial",Font.BOLD,14));
    numOfModuleslb.setForeground(Color.WHITE);
    numOfModulestf=new TextField();
    numOfModulestf.setBounds(190,80,120,20);
    numOfModulestf.setFont(new Font("Arial",Font.PLAIN,14));
    regularPanel.add(numOfModuleslb);
    regularPanel.add(numOfModulestf);

    //Number of Credit Hours Label and Textfield
    numOfCreditHourslb=new JLabel("Number of Credit Hours:");
    numOfCreditHourslb.setBounds(10,120,170,20);
    numOfCreditHourslb.setFont(new Font("Arial",Font.BOLD,14));
    numOfCreditHourslb.setForeground(Color.WHITE);
    numOfCreditHourstf=new TextField();
    numOfCreditHourstf.setBounds(190,120,120,20);
    numOfCreditHourstf.setFont(new Font("Arial",Font.PLAIN,14));
    regularPanel.add(numOfCreditHourslb);
    regularPanel.add(numOfCreditHourstf);

    //Number of Days Present Label and Textfield
    dayPresentlb=new JLabel("Number of Days Present:");
    dayPresentlb.setBounds(10,160,180,20);
    dayPresentlb.setFont(new Font("Arial",Font.BOLD,14));
    dayPresentlb.setForeground(Color.WHITE);
    numOfDaysPresenttf=new TextField();
    numOfDaysPresenttf.setBounds(190,160,120,20);
    numOfDaysPresenttf.setFont(new Font("Arial",Font.PLAIN,14));
    regularPanel.add(dayPresentlb);
    regularPanel.add(numOfDaysPresenttf);

    /////////////////////////CONFIG REGULAR BUTTON
    addRegularbt=new JButton("Add Regular");
    addRegularbt.setFont(new Font("Arial",Font.BOLD,14));
    addRegularbt.setBounds(10,200,140,20);
    regularPanel.add(addRegularbt);
    /////////////////////////Config display button
    displayRegularButtonbt=new JButton("Display Regular");
    displayRegularButtonbt.setFont(new Font("Arial",Font.BOLD,14));
    displayRegularButtonbt.setBounds(170,200,140,20);
    regularPanel.add(displayRegularButtonbt);

    ///////////////////////////////ACTION LISTENER FOR REGULAR CLASS////////////////////////////////////////////////////
    addRegularbt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){

        int numOfModules=getRegularNumOfModules();
        if(numOfModules==INVALID){
          JOptionPane.showMessageDialog(frame,"Select exact Number Of Modules");
          return;
        }
        
        int numOfCreditHours=getRegularNumOfCreditHours();
        if(numOfCreditHours==INVALID){
          JOptionPane.showMessageDialog(frame,"Select exact Number Of Credit Hours");
          return;
        }

        double numOfDaysPresent=getRegularDaysPresent();
        if(numOfDaysPresent==INVALID){
          JOptionPane.showMessageDialog(frame,"Select exact num of days Present");
          return;
        }
        //////////////////geting values from studentPanel need to make changes here//////////////////////
        String studentName=getStudentName();
        String dateOfBirth=getStudentDateOfBirth();
        String courseName=getStudentCourseName();
        int enrollmentId=getStudentEnrollmentId();
        String dateOfEnrollment=getStudentDateOfEnrollment();
        int courseDuration=getStudentCourseDuration();
        int tuitionFee=getStudentTuitionFee();

        RegularStudent reg=new RegularStudent(studentName,dateOfBirth,courseName,enrollmentId,dateOfEnrollment,courseDuration,tuitionFee,numOfModules,numOfCreditHours,numOfDaysPresent);
        studental.add(reg);
        regularal.add(reg);
        JOptionPane.showMessageDialog(frame,"Regular student record successfully recorded");
        
        ////////////////////////display button on regular panel
        displayRegularButtonbt.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
        String regularStudent="";
        for(RegularStudent regobject:regularal){
          regularStudent+=regobject.toString()+"\n";
        }
        JOptionPane.showMessageDialog(frame,regularStudent);
      }
    });
      
      
      }  
    });
    
    

    




  } 
  //|$$$$$$$$$$$$$$$$$$$$$$$||Getter method for all the components||$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$/
      
     //getter method for name

  
  public String getStudentName(){
      String studentname=studentNameTf.getText();
      if(studentname.equals("")){
          JOptionPane.showMessageDialog(studentPanel,"PLease select your name");
      }
      return studentname;          
  }
  //getter method for date of birth
  public String getStudentDateOfBirth(){
      String year=yearDobComboBox.getSelectedItem().toString();
      String month=monthDobComboBox.getSelectedItem().toString();
      String day=dayDobComboBox.getSelectedItem().toString();
      String dateOfBirth=null;
      //turn it into 
      //if(year.equals("Year")||month.equals("Month")||day.equals("Day")
      if(year.equals("Year")||month.equals("Month")||day.equals("Day")){
          dateOfBirth=null;
      }
      else{
       dateOfBirth=
          year+"\n"+
          month+"\n"+
          day+"\n"
      ;
      }
      return dateOfBirth;
  }
  //getter method for courseName
  public String getStudentCourseName(){
    String studentCourseName=courseNametf.getText();
    if(studentCourseName.equals("")){
      JOptionPane.showMessageDialog(studentPanel,"Select Your CourseName");
    }
    return studentCourseName;
  }
  //getter method for get EnrollmentID
  public int getStudentEnrollmentId(){
    int newStudentEnrollmentId=INVALID;
    String studentenrollmentId=enrollmentIdtf.getText().trim();
    try{
      newStudentEnrollmentId=Integer.parseInt(studentenrollmentId);
      if(newStudentEnrollmentId<=0){
        newStudentEnrollmentId=INVALID;
      }
      else{
        return newStudentEnrollmentId;
      }
    }     
    catch(NumberFormatException e){

    }
    return newStudentEnrollmentId;
  }
  //getter method for dateOfEnrollment
  public String getStudentDateOfEnrollment(){
      String year=yearDoeComboBox.getSelectedItem().toString();
      String month=monthDoeComboBox.getSelectedItem().toString();
      String day=dayDoeComboBox.getSelectedItem().toString();
      String dateOfEnrollment=null;
      //turn it into 
      //if(year.equals("Year")||month.equals("Month")||day.equals("Day")
      if(year.equals("Year")||month.equals("Month")||day.equals("Day")){
          dateOfEnrollment=null;
      }
      else{
       dateOfEnrollment=
          year+"\n"+
          month+"\n"+
          day+"\n"
      ;
      }
      return dateOfEnrollment;
  }
  //getter method for courseDuration
    public int getStudentCourseDuration(){
    int newStudentCourseDuration=INVALID;
    String studentCourseDuration=courseDurationtf.getText().trim();
    try{
      newStudentCourseDuration=Integer.parseInt(studentCourseDuration);
      if(newStudentCourseDuration<=0){
        newStudentCourseDuration=INVALID;
      }
      else{
        return newStudentCourseDuration;
      }
    }     
    catch(NumberFormatException e){

    }
    return newStudentCourseDuration;
  }
  //getter method for tuitionFee
  public int getStudentTuitionFee(){
    int newStudentTuitionFee=INVALID;
    String StudentTuitionFee=tuitionFeetf.getText().trim();
    try{
      newStudentTuitionFee=Integer.parseInt(StudentTuitionFee);
      if(newStudentTuitionFee<=0){
        newStudentTuitionFee=INVALID;
      }
      else{
        return newStudentTuitionFee;
      }
    }     
    catch(NumberFormatException e){

    }
    return newStudentTuitionFee;
  }
  /////////////////////////////working with regularPanel getter methodl///////////////////////////////////////////////////////
  //getter method for numofModules
  public int getRegularNumOfModules(){
    int newRegularNumOfModules=INVALID;
    String regularNumOfModules=numOfModulestf.getText().trim();
    try{
      newRegularNumOfModules=Integer.parseInt(regularNumOfModules);
      if(newRegularNumOfModules<=0){
        newRegularNumOfModules=INVALID;
      }
      else{
        return newRegularNumOfModules;
      }
    }     
    catch(NumberFormatException e){

    }
    return newRegularNumOfModules;
  }
  //getter method for numOfCreditHours
  public int getRegularNumOfCreditHours(){
    int newRegularNumOfCreditHours=INVALID;
    String regularNumOfCreditHours=numOfCreditHourstf.getText().trim();
    try{
      newRegularNumOfCreditHours=Integer.parseInt(regularNumOfCreditHours);
      if(newRegularNumOfCreditHours<=0){
        newRegularNumOfCreditHours=INVALID;
      }
      else{
        return newRegularNumOfCreditHours;
      }
    }     
    catch(NumberFormatException e){

    }
    return newRegularNumOfCreditHours;
  }
  public double getRegularDaysPresent(){
    int newRegularDaysPresent=INVALID;
    String regularDaysPresent=numOfDaysPresenttf.getText().trim();
    try{
      newRegularDaysPresent=Integer.parseInt(regularDaysPresent);
      if(newRegularDaysPresent<=0){
        newRegularDaysPresent=INVALID;
      }
      else{
        return newRegularDaysPresent;
      }
    }     
    catch(NumberFormatException e){

    }
    return newRegularDaysPresent;
  }































   public static void main(String args[]){
    Main object=new Main();
  }
}




//creating Student class
class Student{
  String studentName;
  String dateOfBirth;
  String courseName;
  int enrollmentId;
  String dateOfEnrollment;
  int courseDuration;
  int tuitionFee;
  public Student(String studentName,String dateOfBirth,String courseName,int enrollmentId,String dateOfEnrollment,int courseDuration,int tuitionFee){
    this.studentName=studentName;
    this.dateOfBirth=dateOfBirth;
    this.courseName=courseName;
    this.enrollmentId=enrollmentId;
    this.dateOfEnrollment=dateOfEnrollment;
    this.courseDuration=courseDuration;
    this.tuitionFee=tuitionFee;
  }
  public void display(){
    System.out.println("Student Name is "+studentName);
    System.out.println("Date of Birth is "+dateOfBirth);
    System.out.println("Course Name is "+courseName);
    System.out.println("Enrollment Id is "+enrollmentId);
    System.out.println("Date Of Enrollment is"+dateOfEnrollment);
    System.out.println("Course Duration is"+courseDuration);
    System.out.println("Tuitio Fee is"+tuitionFee);

  }
  @Override
  public String toString(){
    return "Student Name is "+studentName+"\n"+
           "Date of Birth is "+dateOfBirth+"\n"+
           "Course Name is "+courseName+"\n"+
          "Enrollment Id is "+enrollmentId+"\n"+
          "Date Of Enrollment is"+dateOfEnrollment+"\n"+
          "Course Duration is"+courseDuration+"\n"+
          "Tuition Fee is"+tuitionFee;
  }
}

class RegularStudent extends Student{
  int numOfModules;
  int numOfCreditHours;
  double daysPresent;
  public RegularStudent(String studentName,String dateOfBirth,String courseName,int enrollmentId,String dateOfEnrollment,int courseDuration,int tuitionFee,int numOfModules,int numOfCreditHours,double daysPresent){
    super(studentName,dateOfBirth,courseName,enrollmentId,dateOfEnrollment,courseDuration,tuitionFee);
    this.numOfModules=numOfModules;
    this.numOfCreditHours=numOfCreditHours;
    this.daysPresent=daysPresent;
  }
  @Override
  public String toString(){
    return super.toString()+
    "\nNumber of Modules:"+numOfModules+
    "\nNumber of Credit Hours:"+numOfCreditHours+
    "\nDays Present:"+daysPresent;
  }
}
