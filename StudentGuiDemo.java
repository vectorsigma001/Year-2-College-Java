 import java.awt.TextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentGuiDemo{
    JFrame frame;
    TextField nameTextField;
    TextField idTextField;
    static final int INVALID=-1;
    JComboBox<Integer> yearComboBox;
    JComboBox<String> monthComboBox;
    JComboBox<Integer> dayComboBox;
    JPanel panel;
    ArrayList<Student2> al=new ArrayList<Student2>();
    public void show() {
        // main components
        frame = new JFrame("Class Task");
        panel = new JPanel();
        panel.setLayout(null);

        // all labels
        JLabel id = new JLabel("Id");
        id.setBounds(50, 50, 100, 30);
        JLabel name = new JLabel("Name");
        name.setBounds(50, 100, 100, 30);
        JLabel dob = new JLabel("DOB");
        dob.setBounds(50, 150, 100, 30);

        // textfield
        idTextField = new TextField();
        idTextField.setBounds(150, 50, 160, 30);
        nameTextField = new TextField();
        nameTextField.setBounds(150, 100, 160, 30);

        // setting up ComboBox
        Integer[] year = {1980, 1981, 1982, 1983, 1984, 1985, 1986, 1987, 1988, 1989, 1990, 1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030};
        String[] month = {"Month","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Integer[] days = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        
         yearComboBox= new JComboBox<>(year);
         monthComboBox = new JComboBox<>(month);
         dayComboBox = new JComboBox<>(days);

        // settings for ComboBox
        yearComboBox.setBounds(150, 150, 100, 30);
        monthComboBox.setBounds(280, 150, 100, 30);
        dayComboBox.setBounds(400, 150, 100, 30);

        // adding buttons
        JButton buttonAddStudent = new JButton("Add Student");
        buttonAddStudent.setBounds(100, 200, 160, 30);
        JButton buttonClear = new JButton("Clear");
        buttonClear.setBounds(400, 200, 100, 30);
        JButton buttonDisplay = new JButton("Display");
        buttonDisplay.setBounds(260, 250, 100, 30);
        buttonDisplay.setVisible(false);   ///change made
        // adding components to panel
        panel.add(id);
        panel.add(name);
        panel.add(dob);
        panel.add(idTextField);
        panel.add(nameTextField);
        panel.add(yearComboBox);
        panel.add(monthComboBox);
        panel.add(dayComboBox);
        panel.add(buttonAddStudent);
        panel.add(buttonClear);
        panel.add(buttonDisplay);

        // settings for main components
        panel.setBounds(50,50, 600,300);
       
        panel.setBackground(Color.CYAN.brighter().brighter());

        // adding panel in frame
        frame.add(panel);
        frame.setSize(700,450);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
       buttonAddStudent.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            int id =getId();
            if(id==INVALID){
                JOptionPane.showMessageDialog(panel, "It Should be in positive only");
                return;  //to stop the progrma from here
            }
            String name=getName();
            if(name==""){
                JOptionPane.showMessageDialog(panel, "You cannot leave this empty");
                return;
            }
            String dateOfBirth=getDOB();
            if(dateOfBirth==null){
                JOptionPane.showMessageDialog(panel, "Select year month and date");
                return;
            } 
            Student2 s1=new Student2(id,name,dateOfBirth);   
            al.add(s1);
            JOptionPane.showMessageDialog(panel,"Student record successfully added");
            buttonDisplay.setVisible(true);     //change made
        }
       });
       buttonDisplay.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            for(Student2 object:al){
                    object.display();
            }
        }
       });
        
    }
    ///////////////////////////////////////////////////////////
     /* 
        if(obj instanceOf Dropout){
            Droupout dobj=(Droupout) obj;
            
        }
        */
        //getter method for id 
        public int getId(){
            int id=INVALID;
            String stringid=idTextField.getText().trim();    
            try{
            id=Integer.parseInt(stringid);
            if(id<=0){
                id=INVALID;
            }
            else{
                return id;
            }
            }
            catch(NumberFormatException e){
               //
            }
            return id;
        }
        //getter method for name
        public String getName(){
            String name=nameTextField.getText().trim();
            if(name.equals("")){
                JOptionPane.showMessageDialog(panel,"PLease select your name");
            }
            return name;          
        }
        
        //getter method for date of birth
        public String getDOB(){
            String year=yearComboBox.getSelectedItem().toString();
            String month=monthComboBox.getSelectedItem().toString();
            String day=dayComboBox.getSelectedItem().toString();
            String date=null;
            //turn it into 
            //if(year.equals("Year")||month.equals("Month")||day.equals("Day")
            if(year.equals("Year")||month.equals("Month")||day.equals("Day")){
                date=null;
            }
            else{
             date=
                year+"\n"+
                month+"\n"+
                day+"\n"
            ;
            }
            return date;
        }


     
    public static void main(String args[]) {
        StudentGuiDemo object = new StudentGuiDemo();
        object.show();
    }
}
class Student2{
    int id;
    String name;
    String dob;
    public Student2(int id,String name,String dob){
        this.id=id;
        this.name=name;
        this.dob=dob;
    }
    public void display(){
        System.out.println("Id is "+id);
        System.out.println("Name is"+name);
        System.out.println("Date of Birth is"+dob);
    }
}
