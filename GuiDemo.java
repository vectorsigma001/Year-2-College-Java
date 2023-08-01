import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;  // swing nai vayepani J use hudaina yesma
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

class GUIDemo implements ActionListener
{
    JFrame frame;
    JTextField fieldName;
    JTextArea areaAddress;
    JRadioButton btnMale, btnFemale;
    JComboBox combo;
     ButtonGroup group;
    public void show()
    {
        frame = new JFrame("ABC");
        frame.setSize(600,600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null); //relative to is used for null only, otherwise setLocation is used.
        //frame.setTitle("First GUI Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelName = new JLabel("IIC Registration Form");
        //labelName.setText("Hello Name");
        labelName.setBounds(200,50,300,30);//setBounds(x-axis, y-axis, width, height) = used to controls contents inside frame
        labelName.setFont(new Font("Arial", Font.BOLD, 25));
        labelName.setForeground(Color.MAGENTA);
        frame.add(labelName);

        JLabel labelN = new JLabel("Name");
        //labelN.setText("Name")
        labelN.setBounds(100,120,80,30);
        frame.add(labelN);

        fieldName = new JTextField();
        fieldName.setBounds(200,120,150,25);
        frame.add(fieldName);

        JLabel labelA = new JLabel("Tuition Fee");
        //labelA.setText("address")
        labelA.setBounds(100,160,150,25);
        frame.add(labelA);

        areaAddress = new JTextArea();
        areaAddress.setBounds(200,160,150,35);
        frame.add(areaAddress);

        JLabel labelG = new JLabel("Gender");
        //labelG.radioButton("Gender");
        labelG.setBounds(100,205,80,30);
        frame.add(labelG);

        btnMale = new JRadioButton("Male");
        btnFemale = new JRadioButton("Female");

        btnMale.setBounds(200,205,150,30);
        btnFemale.setBounds(360,205,150,30);
        group = new ButtonGroup();
        group.add(btnMale);
        group.add(btnFemale);
        frame.add(btnMale);
        frame.add(btnFemale);

        JLabel labelF = new JLabel("Faculty");
        //labelF.JCombobox("Faculty")
        labelF.setBounds(100,245,80,30);
        frame.add(labelF);

        String []name = {"BIT","BBA","BCA","MCA","MCA"};
        combo = new JComboBox(name);
        // combo.addItem("BIT");
        // combo.addItem("BBA");
        // combo.addItem("BCA");
        combo.setBounds(200,245,150,30);
        frame.add(combo);

        JButton btnSubmit = new JButton("Submit");
        //btnsubmit.setText("submit");
        btnSubmit.setBounds(200,300,120,40);
        frame.add(btnSubmit);
        btnSubmit.addActionListener(this); //added

        JButton btnReset = new JButton("Reset");
        //btnresett.setText("reset");
        btnReset.setBounds(370,300,120,40);
        frame.add(btnReset);
        btnReset.addActionListener(this); //added
      
        JMenuBar menuB = new JMenuBar();
        frame.setJMenuBar(menuB);

        JMenu fileMenu = new JMenu("File");  //97 & 99  eutai kura gareko ho!
        JMenu helpMenu= new JMenu();
        helpMenu.setText("Help");
        menuB.add(fileMenu);
        menuB.add(helpMenu);

        JMenu item1 = new JMenu("Save AS");    //103 & 105  eutai kura gareko ho!    //menu item lai add garna Jmenu matra banako hoo,,, JMenuItem=JMenu
        JMenuItem item2 = new JMenuItem();  
        JMenuItem item3=new JMenuItem();
        JMenuItem item4=new JMenuItem();
        item3.setText("Exit");            //Yesko MenuItem chaidaina so yesma (JMenuItem=JMenu) yo nagareko
        item2.setText("Save");
        item4.setText("New Frame");
        item2.addActionListener(this);
        item4.addActionListener(this);
        fileMenu.add(item1);
        fileMenu.add(item2);
        fileMenu.add(item3);
        fileMenu.add(item4);
        fileMenu.add("Close");      //menuitem ko object nabanai direct add garna milxa
        
        item1.add("Save Text File");
        item1.add("Save Word File");
        item3.addActionListener(this);  //added
        frame.setLayout(null);   //setBounds used = setLayout(null)
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e)  //added
    {
      if(e.getActionCommand().equals("Submit") || e.getActionCommand().equals("Save")){
        String getName = fieldName.getText();
        String getAddress = areaAddress.getText();
        int tuitionfee=0;
        try{                                             //try catch exception
        tuitionfee=Integer.parseInt(getAddress)*100;
        }
        catch(NumberFormatException exceppp){
            JOptionPane.showMessageDialog(frame,"Tuition Fee should be in integer", "Errow wala dialogbox",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String getGender = "";
        if(btnMale.isSelected())
        {
            getGender = "Male";
        }
        else if(btnFemale.isSelected())
        {
            getGender = "Female";
        }

        String getFaculty = combo.getSelectedItem().toString();

        //String msg = fieldName.getText();
        JOptionPane.showMessageDialog(frame, "Name: " + getName + "\nTuition Fee " + tuitionfee+ "\nGender: " + getGender + "\nFaculty: " + getFaculty, "dialog Box Example", JOptionPane.INFORMATION_MESSAGE);
      }
        //resetting value
    else if(e.getActionCommand().equals("Reset")){
    fieldName.setText("");
    areaAddress.setText("");
    group.clearSelection();
    combo.setSelectedIndex(0);
    }
    else if(e.getActionCommand().equals("Exit")){
       frame.dispose();  //closes your frame
       System.exit(0);
    }
    else if(e.getActionCommand().equals("New Frame")){  //adding new Frame
      JFrame newF=new JFrame("New Frame");
      newF.setSize(200,200);
      newF.setLocationRelativeTo(null);
      newF.setVisible(true);
    }
      }
    public static void main(String[] args) 
    {
       GUIDemo demo = new GUIDemo();
       demo.show();
    }
}
