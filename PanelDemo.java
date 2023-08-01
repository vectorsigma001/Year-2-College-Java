import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class PanelDemo implements ActionListener{
 JFrame frame;
 JPanel p1,p2;
 JLabel labelName;
 JTextField fieldName;
 JButton btnDisplay;
 public PanelDemo(){
    frame=new JFrame();
    frame.setTitle("Panel Demo");
    frame.setSize(500,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.getContentPane().setBackground(Color.WHITE);
    

    p1=new JPanel();
    p2=new JPanel();
    p1.setSize(400,200);
    p2.setSize(400,200);
     //50 20  220
    p1.setLocation(50,25); //for panel setLocation //for button setBounds
    p2.setLocation(50,250);
    frame.add(p1);
    frame.add(p2);

    labelName=new JLabel("Name");
    fieldName=new JTextField();
    btnDisplay=new JButton("Display");
    p1.add(labelName);
    p1.add(fieldName);
    p1.add(btnDisplay);
    p1.setLayout(new GridLayout(2,1));
   
    //
    btnDisplay.addActionListener(this);
    frame.setLayout(null);
    frame.setVisible(true);  
   
 } 
   public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(p2,"ek baje bus janxa hatar nagara ekxin","Message",JOptionPane.INFORMATION_MESSAGE);
    }


 public static void main(String args[]){
    new PanelDemo();
 }
}
