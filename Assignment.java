import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
class Assignment
{
    JFrame frame;
    JLabel label1;
    JLabel label2;
    JTextField field1;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;
    JLabel label9;
    JLabel label10;
    JLabel label11;
    JComboBox combobox1;
    JComboBox combobox2;
    JComboBox combobox3;
    JRadioButton button1;
    JRadioButton button2;
    ButtonGroup group;
    JTextArea text;
    JTextField field2;
    JTextField field3;
    JTextField field4;
    JComboBox combobox4;
    JComboBox combobox5;
    JComboBox combobox6;
    JButton button3;
    JButton button4;
  public Assignment(){
    frame=new JFrame();
    frame.setLayout(null);
    frame.setTitle("Student Register Form");
    frame.setSize(800,700);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //frame.getContentPane().setBackground(Color.yellow);
    //label1
    label1 =new JLabel("Register a new Student");
    label1.setFont(new Font("Arial",Font.BOLD,20));
    label1.setForeground(Color.BLUE);
    label1.setBounds(250,30,300,30);
    frame.add(label1);
    //label2
     label2=new JLabel("Name:");
     label2.setBounds(130,110,60,20);
     label2.setFont(new Font("Arial",Font.BOLD,15));
     label2.setForeground(Color.BLACK);
     frame.add(label2);
     //textfield
     field1=new JTextField();
     field1.setBounds(350,100,200,30);
     field1.setBorder(BorderFactory.createLineBorder(Color.RED));
     field1.setText("Your full Name");
     frame.add(field1);
     //label3
    label3=new JLabel("DOB:");
    label3.setBounds(130,160,40,20);
    label3.setFont(new Font("Arial",Font.BOLD,15));
    label3.setForeground(Color.BLACK);
    frame.add(label3);
    //comboboxs
    combobox1=new JComboBox();
    combobox1.setBounds(350,150,80,25);
    frame.add(combobox1);
    combobox1.addItem("Year:");
    for(int i=2000;i<=2023;i++)
    {
      combobox1.addItem(i);

    }

    combobox2=new JComboBox();
    combobox2.setBounds(450,150,80,25);
    frame.add(combobox2);
    combobox2.addItem("Month:");
    String month[]={"January","February","March","April","May","June","July","August","September","Octuber","November","December"};
    for(String addmonth:month){
      combobox2.addItem(addmonth);
    }

    combobox3=new JComboBox();
    combobox3.setBounds(550,150,80,25);
    frame.add(combobox3);
    combobox3.addItem("Day");
    for(int i=1;i<=33;i++)
    {
      combobox3.addItem(i);

    }

    label4=new JLabel("Gender:");
     label4.setBounds(130,220,60,20);
     label4.setFont(new Font("Arial",Font.BOLD,15));
     label4.setForeground(Color.BLACK);
     frame.add(label4);

        button1=new JRadioButton("Male");
        button1.setBounds(350,210,100,30);
        frame.add(button1);

        button2=new JRadioButton("Female");
        button2.setBounds(450,210,100,30);
        frame.add(button2);

        group=new ButtonGroup();
        group.add(button1);
        group.add(button2);


     label5=new JLabel("Address:");
     label5.setBounds(130,270,65,20);
     label5.setFont(new Font("Arial",Font.BOLD,15));
     label5.setForeground(Color.BLACK);
     frame.add(label5);

     text=new JTextArea();
     text.setBounds(350,250,200,60);
     text.setBorder(BorderFactory.createLineBorder(Color.RED));
     text.setText("Your Address");
     frame.add(text);


     label6=new JLabel("Mobile-number:");
     label6.setBounds(130,340,120,20);
     label6.setFont(new Font("Arial",Font.BOLD,15));
     label6.setForeground(Color.BLACK);
     frame.add(label6);

     field2=new JTextField();
     field2.setBounds(350,330,200,30);
     field2.setBorder(BorderFactory.createLineBorder(Color.RED));
     field2.setText("You'r Mobile num");
     frame.add(field2);

     label7=new JLabel("Password:");
     label7.setBounds(130,390,100,20);
     label7.setFont(new Font("Arial",Font.BOLD,15));
     label7.setForeground(Color.BLACK);
     frame.add(label7);

     field3=new JTextField();
     field3.setBounds(350,380,200,30);
     field3.setBorder(BorderFactory.createLineBorder(Color.RED));
     field3.setText("Your Passord");
     frame.add(field3);


     label8=new JLabel("Re-Password:");
     label8.setBounds(130,440,100,20);
     label8.setFont(new Font("Arial",Font.BOLD,15));
     label8.setForeground(Color.BLACK);
     frame.add(label8);

     field4=new JTextField();
     field4.setBounds(350,430,200,30);
     field4.setBorder(BorderFactory.createLineBorder(Color.RED));
     field4.setText("Re-Type pass");
     frame.add(field4);


     label9=new JLabel("Courses:");
     label9.setBounds(130,490,70,20);
     label9.setFont(new Font("Arial",Font.BOLD,15));
     label9.setForeground(Color.BLACK);
     frame.add(label9);

     combobox4=new JComboBox();
     combobox4.setBounds(350,480,200,30);
     combobox4.addItem("Bsc Hons Computing");
     combobox4.addItem("Bsc Hons BBA");
     frame.add(combobox4);

     label10=new JLabel("College:");
     label10.setBounds(130,540,60,20);
     label10.setFont(new Font("Arial",Font.BOLD,15));
     label10.setForeground(Color.BLACK);
     frame.add(label10);

     combobox5=new JComboBox();
     combobox5.setBounds(350,530,200,30);
     combobox5.addItem("Itahari International College");
     frame.add(combobox5);

     label11=new JLabel("Semester:");
     label11.setBounds(130,580,80,20);
     label11.setFont(new Font("Arial",Font.BOLD,15));
     label11.setForeground(Color.BLACK);
     frame.add(label11);
     
     combobox6=new JComboBox();
     combobox6.setBounds(350,570,200,30);
     combobox6.addItem("1");
     combobox6.addItem("2");
     combobox6.addItem("3");
     frame.add(combobox6);

    button3=new JButton();
    button3.setText("Submit");
    button3.setBounds(350,620,100,30);
    frame.add(button3);

    button4=new JButton();
    button4.setText("Reset");
    button4.setBounds(500,620,100,30);
    frame.add(button4);

    frame.setVisible(true);
  }
    public static void main(String args[]){
        new Assignment();
    }
}
