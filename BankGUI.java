import javax.security.auth.login.CredentialException;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BankGUI {
    private JLabel graceLabel,creditLimitLabel,DPinNumber;

    private JTextField gracePeriod,creditLimit,WithdrawalAmountT,D1CardIdT,InterestT,CreditCVCT,DCardIdT,BankAccountT,ClientNameT1,ClientNameT2,IssuerBankT,BankAmountT,grace,limit,CreditCardIdT,limitcardid;
    private boolean limitset=false,debitobj,creditobj;
    private JButton btn14,setcreditbtn,btn15,Credit,Debit,Clear,AddDebit,DPrev,DWithdraw,DDisplay,ClearBtn,WithdrawBtn,AddCreditCard,CreditPrev,PrevBtn,btn12;
    private JFrame CreditCard3,DebitCard,DebitCard1,BankCard,CreditCard1,CreditCard;
    private JComboBox creditd3,WDay;
    private JComboBox<String> creditd33,creditcb,WMonth,WYear;
    private JPasswordField D1PinNumberT,DPinNumberT;
    private ArrayList <BankCard> bank_list = new ArrayList<BankCard>();
 

    public BankGUI(){
        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Bank Card start<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        // Create a new JFrame with title "Bank details"
        BankCard = new JFrame("Bank details");

        // Set the close operation to exit the application when the frame is closed
        BankCard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the frame to be resizable and use a null layout
        BankCard.setResizable(true);
        BankCard.setLayout(null);
        BankCard.setLocationRelativeTo(null);
        BankCard.setResizable(false);

        // Set the size and position of the frame, and set the background color to black
        BankCard.setBounds(350, 90, 650, 500);
        BankCard.getRootPane().setBackground(Color.BLACK);

        // Create a titled border and set it as the border of the root pane
        Border border = BorderFactory.createTitledBorder(
        BorderFactory.createLineBorder(Color.WHITE, 1), "Bank Card");
        BankCard.getRootPane().setBorder(border);

        // Set the content pane's background color to black
        BankCard.getContentPane().setBackground(Color.BLACK);

        // Create a label with text "Bank Card Form" and add it to the frame
        JLabel label = new JLabel("Bank Card Form");
        label.setForeground(Color.RED);
        label.setBounds(220, 0, 250, 50);
        BankCard.add(label);

        // Set the font of the label to Times New Roman, bold, size 28
        Font font = new Font("Times New Roman", Font.BOLD, 28);
        label.setFont(font);
        
        // Create a label with text "Client Name" and add it to the frame
        JLabel ClientName = new JLabel("Client Name");
        BankCard.add(ClientName);
        ClientName.setBounds(70, 65, 120, 30);
        ClientName.setForeground(Color.WHITE);

        // Create a text field for the first name and add it to the frame
        ClientNameT1 = new JTextField();
        ClientNameT1.setBounds(190, 65, 140, 30);
        ClientNameT1.setHorizontalAlignment(SwingConstants.CENTER);
        BankCard.add(ClientNameT1);

        // Create a text field for the last name and add it to the frame
        ClientNameT2 = new JTextField();
        ClientNameT2.setBounds(334, 65, 155, 30);
        ClientNameT2.setHorizontalAlignment(SwingConstants.CENTER);
        BankCard.add(ClientNameT2);

        // Create a label with text "Issuer Bank" and add it to the frame
        JLabel IssuerBank = new JLabel("Issuer Bank");
        BankCard.add(IssuerBank);
        IssuerBank.setBounds(70, 115, 120, 30);
        IssuerBank.setForeground(Color.WHITE);

        // Create a text field for the issuer bank and add it to the frame
        IssuerBankT = new JTextField();
        IssuerBankT.setBounds(190, 115, 300, 30);
        IssuerBankT.setHorizontalAlignment(SwingConstants.CENTER);
        BankCard.add(IssuerBankT);

        // Create a label with text "Bank Amount" and add it to the frame
        JLabel BankAmount = new JLabel("Bank Amount");
        BankCard.add(BankAmount);
        BankAmount.setBounds(70, 165, 120, 30);
        BankAmount.setForeground(Color.WHITE);

        // Create a text field for the bank amount and add it to the frame
        BankAmountT = new JTextField();
        BankAmountT.setBounds(190, 165, 300, 30);
        BankAmountT.setHorizontalAlignment(SwingConstants.CENTER);
        BankCard.add(BankAmountT);

        // Create a label with text "Bank Account" and add it to the frame
        JLabel BanlAccount = new JLabel("Bank Account");
        BankCard.add(BanlAccount);
        BanlAccount.setBounds(70, 215, 120, 30);
        BanlAccount.setForeground(Color.WHITE);

        // Create a text field for the bank account and add it to the frame
        BankAccountT = new JTextField();
        BankAccountT.setBounds(190, 215, 300, 30);
        BankAccountT.setHorizontalAlignment(SwingConstants.CENTER);
        BankCard.add(BankAccountT);

        Clear = new JButton("clear");
        Clear.setBounds(110, 350, 120, 25);
        BankCard.add(Clear);

        Debit = new JButton("Debit");
        Debit.setBounds(255, 350, 120, 25);
        BankCard.add(Debit);

        
        Credit = new JButton("Credit");
        Credit.setBounds(400, 350, 120, 25);
        BankCard.add(Credit);

  

        Debit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                        // handle debit operation
                try {
                    if(ClientNameT1.getText().trim().isEmpty() && ClientNameT2.getText().trim().isEmpty() && IssuerBankT.getText().trim().isEmpty() && BankAmountT.getText().trim().isEmpty() && BankAccountT.getText().trim().isEmpty()){
                        throw new IllegalArgumentException("Unfilled Inputs");
                    }

                    else{
                        int Balance = getBalanceAmount();
                        String Client = getClientName();
                        String Issuer= getIssuerBank();
                        String Account=getBankAccount();
                        JOptionPane.showMessageDialog(BankCard, "Debit operation completed successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                        BankCard.dispose();
                        DebitCard.setVisible(true);

                    }
                } catch(IllegalArgumentException ex){
                    JOptionPane.showMessageDialog(BankCard, ex.getMessage (), "Error",JOptionPane.ERROR_MESSAGE);
                }
                
            }
            
        });
        Credit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                // handle credit operation
                try{
                    if(ClientNameT1.getText().isEmpty() && ClientNameT2.getText().isEmpty() && IssuerBankT.getText().isEmpty() && BankAmountT.getText().isEmpty() && BankAccountT.getText().isEmpty()){
                        throw new IllegalArgumentException("Unfilled Inputs");
                    }
                    else{
                        int Balance = getBalanceAmount();
                        String Client = getClientName();
                        String Issuer= getIssuerBank();
                        String Account=getBankAccount();
                        BankCard.setVisible(false);
                        CreditCard.setVisible(true);
                    }
                }catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(BankCard, ex.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);  
                }
            }
        });
        Clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // clear JTextArea fields
                BankAccountT.setText("");
                BankAmountT.setText("");
                IssuerBankT.setText("");
                ClientNameT2.setText("");
                ClientNameT1.setText("");
            }
        });
        // sets the visibility of the JFrame BankCard to true, making it visible to the user.
        BankCard.setVisible(true);
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> BankCard Ends <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> DebitCard start <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        
        // Debit Card JFrame
        DebitCard = new JFrame("Debit details");
        DebitCard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DebitCard.setResizable(true);
        DebitCard.setLayout(null);
        DebitCard.setLocationRelativeTo(null);
        DebitCard.setResizable(false);
        DebitCard.setBounds(350, 90, 650, 500);
        DebitCard.getRootPane().setBackground(Color.BLACK);
        // Create a titled border with white line border for Debit Card
        Border border1 = BorderFactory.createTitledBorder(
        BorderFactory.createLineBorder(Color.WHITE, 1), "Debit Card");
    
        DebitCard.getRootPane().setBorder(border1);
        // Set background color of the root pane
        DebitCard.getContentPane().setBackground(Color.BLACK);
    
        JLabel label1 = new JLabel("Debit Card Form");
        label1.setForeground(Color.RED);
        label1.setBounds(220, 0, 250, 50);
        DebitCard.add(label1);    
        // Set the font for label1
        Font font1 = new Font("Times New Roman", Font.BOLD, 28);
        label1.setFont(font1);
        // Add label and text field for Card Id
        JLabel DCardId = new JLabel("Card Id");
        DebitCard.add(DCardId);
        DCardId.setBounds(70, 85, 120, 30);
        DCardId.setForeground(Color.WHITE);


        DCardIdT = new JTextField();
        DCardIdT.setBounds(190, 85, 250, 30);
        DCardIdT.setHorizontalAlignment(SwingConstants.CENTER);
        DebitCard.add(DCardIdT);
        // Add label and password field for Pin Number
        DPinNumber = new JLabel("Pin Number");
        DebitCard.add(DPinNumber);
        DPinNumber.setBounds(70, 135, 120, 30);
        DPinNumber.setForeground(Color.WHITE);


        DPinNumberT = new JPasswordField("");
        DPinNumberT.setBounds(190, 135, 250, 30);
        DPinNumberT.setHorizontalAlignment(SwingConstants.CENTER);

        DebitCard.add(DPinNumberT);
        // Add buttons to Debit Card JFrame
        AddDebit = new JButton("Add Debit Card");
        AddDebit.setBounds(110, 350, 120, 25);
        DebitCard.add(AddDebit);

        DPrev = new JButton("Prev");
        DPrev.setBounds(255, 350, 120, 25);
        DebitCard.add(DPrev);

        DWithdraw = new JButton("Withdraw");
        DWithdraw.setBounds(400, 350, 120, 25);
        DebitCard.add(DWithdraw);

        DDisplay = new JButton("Display");
        DDisplay.setBounds(255, 225, 120, 35);
        DDisplay.setBackground(Color.ORANGE);
        DebitCard.add(DDisplay);
        // Add action listener to the Withdraw button to check whether a debit card is created or not
        DWithdraw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(debitobj == true){
                    DebitCard.dispose();
                    DebitCard1.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(DebitCard,"Debit Card isn't created yet." ,"Error", JOptionPane.ERROR_MESSAGE);  
                }
            }
        });

       
        DDisplay.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if(debitobj == true){
                for(BankCard obj : bank_list){
                    DebitCard d = (DebitCard) obj;
                    d.display();
                }
            }
            else{
                    JOptionPane.showMessageDialog(DebitCard,"Debit Card isn't created yet." ,"Error", JOptionPane.ERROR_MESSAGE);  
            }
        }
    }
    );
    
        AddDebit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addDebitCard();
            }
        });

        DPrev.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DebitCard.dispose();
                BankCard.setVisible(true);
            }
        });
        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> DebitCard  ends <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Debit1  Start <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        DebitCard1 = new JFrame("Details of Withdrawal");
        
        
        DebitCard1 = new JFrame("Withdraw details");
        DebitCard1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DebitCard1.setResizable(true);
        DebitCard1.setLayout(null);
        DebitCard1.setLocationRelativeTo(null);
        DebitCard1.setResizable(false);
        DebitCard1.setBounds(350, 90, 650, 500);
        DebitCard1.getRootPane().setBackground(Color.BLACK);
        Border border5 = BorderFactory.createTitledBorder(
        BorderFactory.createLineBorder(Color.WHITE, 1), "Debit Card");
    
        DebitCard1.getRootPane().setBorder(border5);
        DebitCard1.getContentPane().setBackground(Color.BLACK);
        JLabel label4 = new JLabel("Withdrawal Form");
        label4.setForeground(Color.RED);
        label4.setBounds(220, 0, 250, 50);
        DebitCard1.add(label4);
    
        Font font4 = new Font("Times New Roman", Font.BOLD, 28);
        label4.setFont(font4);
    

        JLabel D1CardId = new JLabel("Card Id");
        D1CardId.setBounds(70, 60, 120, 30);
        D1CardId.setForeground(Color.WHITE);
        DebitCard1.add(D1CardId);



    
        D1CardIdT = new JTextField();
        D1CardIdT.setBounds(190, 65, 260, 30);
        D1CardIdT.setHorizontalAlignment(SwingConstants.CENTER);   
        DebitCard1.add(D1CardIdT);
    
        JLabel D1PinNumber = new JLabel("Pin Number");
        D1PinNumber.setForeground(Color.WHITE);
        D1PinNumber.setBounds(60, 115, 120, 30);
        DebitCard1.add(D1PinNumber);

    
        D1PinNumberT = new JPasswordField();
        D1PinNumberT.setBounds(190, 115, 260, 30);
        D1PinNumberT.setHorizontalAlignment(SwingConstants.CENTER);
        DebitCard1.add(D1PinNumberT);  

        JLabel WithdrawalAmount = new JLabel("Withdrawal Amount");
        WithdrawalAmount.setForeground(Color.WHITE);
        WithdrawalAmount.setBounds(60, 165, 140, 30);
        DebitCard1.add(WithdrawalAmount);


        WithdrawalAmountT = new JTextField();
        WithdrawalAmountT.setBounds(190, 165, 260, 30);
        WithdrawalAmountT.setHorizontalAlignment(SwingConstants.CENTER);

        DebitCard1.add(WithdrawalAmountT);

        JLabel DateOfWithdrawal = new JLabel("Date Of Withdrawal");
        DateOfWithdrawal.setForeground(Color.WHITE);
        DateOfWithdrawal.setBounds(60, 215, 150, 30);
        DebitCard1.add(DateOfWithdrawal);


        String year2[] = { "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013","2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003" };
        WYear = new JComboBox<String>(year2);
        WYear.setBounds(190, 215, 80, 30);
        WYear.setEditable(true);
        WYear.setSelectedItem("Year");


        DebitCard1.add(WYear);
        // month
        String month2[] = { "Jan", "Feb", "March", "April", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"  };
        WMonth = new JComboBox<String>(month2);
        WMonth.setBounds(280, 215, 80, 30);
        WMonth.setEditable(true);
        WMonth.setSelectedItem("Month");

        DebitCard1.add(WMonth);

        // day

        String day2[] = {"30", "29", "28", "27", "26", "25", "24", "23", "22", "21", "20", "19", "18", "17", "16", "15","14", "13", "12", "11", "10", "09", "08", "07", "06", "05", "04", "03", "02", "01"};
        WDay = new JComboBox<String>(day2);
        WDay.setBounds(370, 215, 80, 30);
        WDay.setEditable(true);
        WDay.setSelectedItem("Day");
        DebitCard1.add(WDay);
 

        
        ClearBtn = new JButton("clear");
        ClearBtn.setBounds(110, 350, 120, 25);
        DebitCard1.add(ClearBtn);

        WithdrawBtn = new JButton("withdraw");
        WithdrawBtn.setBounds(255, 350, 120, 25);
        DebitCard1.add(WithdrawBtn);

        PrevBtn = new JButton("Prev");
        PrevBtn.setBounds(400, 350, 120, 25);
        DebitCard1.add(PrevBtn);

        
        // withdraw action
        WithdrawBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           
            try{
                // Get user inputs
                char[] passwordchars = D1PinNumberT.getPassword();
                String password = new String(passwordchars);
                // Check for unfilled inputs
                if(D1CardIdT.getText().isEmpty() || WithdrawalAmountT.getText().isEmpty() || passwordchars.length==0 || WYear.getSelectedItem().equals("Year")||WMonth.getSelectedItem().equals("month")||WDay.getSelectedItem().equals("day") ) {
                    throw new IllegalArgumentException("Unfilled Inputs");
                }
                else{
                    // Loop through bank cards and find matching debit card
                        int withdrawlAmt=getWIthdrawlAmt();
                        int withdrawpin = getWithdraw();
                        String year = getWithdrawYear();
                        String month=getWithdrawMonth();
                        String day=getWithdrawday();
                        int withdrawcardid = getwithdrawcardID();
                        for(BankCard b : bank_list){
                            if(b instanceof DebitCard){
                                // Reset inputs and dispose of window
                                DebitCard d = (DebitCard) b;
                            String withdrawDate = year+"-"+month+"-"+day;
                            if(d.getCardId()==withdrawcardid){
                                d.withdraw(withdrawlAmt,withdrawDate , withdrawpin);
                                if(d.getHasWithdrawn()==true){
                                    DebitCard.setVisible(true);
                                    DebitCard1.dispose();
                                    D1CardIdT.setText("");
                                    WithdrawalAmountT.setText("");
                                    WYear.setSelectedIndex(0);
                                    WMonth.setSelectedIndex(0);
                                    WDay.setSelectedIndex(0);
                                    D1PinNumberT.setText("");
                                }
                            }
                            else{
                                throw new IllegalArgumentException("Card id didn't matched");
                            }
                            }
                        }
                }
            }catch(IllegalArgumentException ex){
                JOptionPane.showMessageDialog(DebitCard1,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    });
    

       //Previous option
        PrevBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a){
                // Go back to previous window
                DebitCard.setVisible(true);
                DebitCard1.dispose();
            }
        });
        // clear inputs

        ClearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            // Clear text fields
            D1PinNumberT.setText("");
            WithdrawalAmountT.setText("");
            D1CardIdT.setText("");
            WYear.setSelectedItem("Year");
            WMonth.setSelectedItem("Month");
            WDay.setSelectedItem("Day");

            }
        });
        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Debit1 ends<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>CreditCard start<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
       // JFrame for credit card details
        CreditCard = new JFrame("Credit details");
        CreditCard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CreditCard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CreditCard.setResizable(true);
        CreditCard.setLayout(null);
        CreditCard.setLocationRelativeTo(null);
        CreditCard.setResizable(false);
        CreditCard.setBounds(350, 90, 650, 500);
        CreditCard.getRootPane().setBackground(Color.BLACK);
        Border border6 = BorderFactory.createTitledBorder(
        BorderFactory.createLineBorder(Color.WHITE, 1), "Credit Card");
    
        // Set background color and border for the JFrame
        CreditCard.getRootPane().setBorder(border6);
        CreditCard.getContentPane().setBackground(Color.BLACK);
        // Add CreditCard Form label to the JFrame
        JLabel label5 = new JLabel("CreditCard Form");
        label5.setForeground(Color.RED);
        label5.setBounds(220, 0, 250, 50);
        CreditCard.add(label5);
        // Set font for the CreditCard Form label
        Font font5 = new Font("Times New Roman", Font.BOLD, 28);
        label5.setFont(font5);
        // Add Card Id label and text field to the JFrame
        JLabel CreditCardId = new JLabel("Card Id");
        CreditCardId.setForeground(Color.WHITE);
        CreditCardId.setBounds(70, 65, 120, 30);
        CreditCard.add(CreditCardId);


        CreditCardIdT = new JTextField();
        CreditCardIdT.setBounds(190, 65, 260, 30);
        CreditCardIdT.setHorizontalAlignment(SwingConstants.CENTER);
        CreditCard.add(CreditCardIdT);
        // Add CVC Number label and text field to the JFrame
        JLabel CreditCVC = new JLabel("CVC Number");
        CreditCVC.setBounds(70, 115, 120, 30);
        CreditCVC.setForeground(Color.WHITE);
        CreditCard.add(CreditCVC);



        CreditCVCT = new JTextField();
        CreditCVCT.setBounds(190, 115, 260, 30);
        CreditCVCT.setHorizontalAlignment(SwingConstants.CENTER);

        CreditCard.add(CreditCVCT);
        // Add Interest Rate label and text field to the JFrame
        JLabel InterestRate = new JLabel("Interest Rate");
        InterestRate.setForeground(Color.WHITE);
        InterestRate.setBounds(70, 165, 120, 30);
        CreditCard.add(InterestRate);


        InterestT = new JTextField();
        InterestT.setBounds(190, 165, 260, 30);
        InterestT.setHorizontalAlignment(SwingConstants.CENTER);

        CreditCard.add(InterestT);
        // Add Expiration Date label and combo boxes for year, month, and day to the JFrame
        JLabel credittext3 = new JLabel("Expiration Date");
        credittext3.setBounds(70, 215, 120, 30);
        credittext3.setForeground(Color.WHITE);
        CreditCard.add(credittext3);



        String year[] = {"2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013","2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003" };
        creditcb = new JComboBox<String>(year);
        creditcb.setBounds(190, 215, 80, 30);
        creditcb.setEditable(true);
        creditcb.setSelectedItem("Year");
        CreditCard.add(creditcb);

           
        String month[] = {"Jan", "Feb", "March", "April", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
        creditd33 = new JComboBox<String>(month);
        creditd33.setBounds(280, 215, 80, 30);
        creditd33.setEditable(true);
        creditd33.setSelectedItem("Month");
        CreditCard.add(creditd33);

            
        String day[] = {"30", "29", "28", "27", "26", "25", "24", "23", "22", "21", "20", "19", "18", "17", "16", "15","14", "13", "12", "11", "10", "09", "08", "07", "06", "05", "04", "03", "02", "01"};
        creditd3 = new JComboBox<String>(day);
        WDay = new JComboBox<String>(day2);
        WDay.setBounds(370, 215, 80, 30);
        WDay.setEditable(true);
        WDay.setSelectedItem("Day");
        CreditCard.add(WDay);

        AddCreditCard = new JButton("Add CreditCard");
        AddCreditCard.setBounds(110, 350, 120, 25);  
        CreditCard.add(AddCreditCard);

        JButton SetCreditLimit = new JButton("SetCreditLimit");
        SetCreditLimit.setBounds(255, 350, 120, 25);
        CreditCard.add(SetCreditLimit);

        
        JButton displaycredit = new JButton("Display");
        displaycredit.setBounds(400, 350, 120, 25);
        CreditCard.add(displaycredit);

        CreditPrev = new JButton("Prev");
        CreditPrev.setBounds(640, 340, 100, 30);
        CreditCard.add(CreditPrev);

        displaycredit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(creditobj == true){
                        for(BankCard obj : bank_list){
                            CreditCard c = (CreditCard) obj;
                            c.display();
                        }
                }
                else{
                    JOptionPane.showMessageDialog(CreditCard,"Credit Card has not been created yet" ,"Error", JOptionPane.ERROR_MESSAGE);  
                }
            }
        });            
            
            
        // Adding comments to explain the functionality of each element:
        AddCreditCard.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    addCreditCard();// Calls the addCreditCard method when the button is clicked
                }
        });

        SetCreditLimit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // clear JTextArea fields
                    if(creditobj==true){// If a credit card has been created
                    CreditCard1.setVisible(true);// Shows the CreditCard1 window
                    CreditCard.dispose();// Closes the CreditCard window
                    }
                    else{// If no credit card has been created
                        // Shows an error message
                        JOptionPane.showMessageDialog(CreditCard1,"Credit Card has not been created yet","Error",JOptionPane.ERROR_MESSAGE );
                    }
                
                }
        });

        CreditPrev.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent a){
                    BankCard.setVisible(true);
                    CreditCard.dispose();
                }
        });

           // Creates a new JFrame object with the specified title 
        CreditCard1 = new JFrame("Isseu Credit");
        CreditCard1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CreditCard1.setResizable(true);
        CreditCard1.setLayout(null);
        CreditCard1.setLocationRelativeTo(null);
        CreditCard1.setResizable(false);
        CreditCard1.setBounds(500, 50, 350, 400);
        CreditCard1.getRootPane().setBackground(Color.BLACK);
    
        Border border8 = BorderFactory.createTitledBorder(
        BorderFactory.createLineBorder(Color.WHITE, 1), "Credit Card");
    
        CreditCard1.getRootPane().setBorder(border8);
        CreditCard1.getContentPane().setBackground(Color.BLACK);

        JLabel label8 = new JLabel("Credit issue Form");
        label8.setForeground(Color.RED);
        label8.setBounds(80, 0, 250, 50);
        CreditCard1.add(label8);
    
        Font font8 = new Font("Times New Roman", Font.BOLD, 28);
        label8.setFont(font8);
            
           

        JButton btn9 = new JButton("Display");
        btn9.setBounds(120, 65, 100, 30);
        CreditCard1.add(btn9);
        

        JButton btn10 = new JButton("SetCreditLimit");
        btn10.setBounds(90, 115, 160, 30);
        CreditCard1.add(btn10);

        JButton cancelCreditbtn = new JButton("CancelCreditCard");
        cancelCreditbtn.setBounds(90,165,160,30);
        CreditCard1.add(cancelCreditbtn);

        btn12 = new JButton("Prev");
        btn12.setBounds(120, 225, 100, 30);
        CreditCard1.add(btn12);


        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            for(BankCard obj : bank_list){
                CreditCard c = (CreditCard) obj;
                c.display();
            }
        }
        });

        cancelCreditbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                cancelCreditCard();
            }
        });

        btn10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                CreditCard1.dispose();
                CreditCard3.setVisible(true);
            }
        });

        //backoption
        btn12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a){
                CreditCard.setVisible(true);
                CreditCard1.dispose();
            }
        });

       //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>CreditCard3 start <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        CreditCard3 = new JFrame("Issue Process");
        CreditCard3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CreditCard3.setResizable(true);
        CreditCard3.setLayout(null);
        CreditCard3.setLocationRelativeTo(null);
        CreditCard3.setResizable(false);
        CreditCard3.setBounds(350, 90, 650, 500);
        CreditCard3.getRootPane().setBackground(Color.BLACK);
        Border border7 = BorderFactory.createTitledBorder(
        BorderFactory.createLineBorder(Color.WHITE, 1), "Credit Card");
    
        CreditCard3.getRootPane().setBorder(border7);
        CreditCard3.getContentPane().setBackground(Color.BLACK);
        JLabel label6 = new JLabel("SetCreditLimit  Form");
        Font font9 = new Font("Times New Roman", Font.BOLD, 28);
        label6.setFont(font9);

            
        label6.setForeground(Color.RED);
        label6.setBounds(220, 0, 350, 50);
        CreditCard3.add(label6);

        graceLabel = new JLabel("Grace Period");
        graceLabel.setBounds(70, 115, 120, 30);
        graceLabel.setForeground(Color.WHITE);
        CreditCard3.add(graceLabel);

        grace= new JTextField();
        grace.setBounds(190, 115, 200, 30);
        CreditCard3.add(grace);

        creditLimitLabel = new JLabel("Set CreditLimit");
        creditLimitLabel.setBounds(70, 165, 120, 30);
        creditLimitLabel.setForeground(Color.WHITE);
        CreditCard3.add(creditLimitLabel);

        limit= new JTextField();
        limit.setBounds(190, 165, 200, 30);
        CreditCard3.add(limit);

        JLabel limitcardidlabel = new JLabel("Card Id ");
        limitcardidlabel.setBounds(70, 215, 120, 30);
        limitcardidlabel.setForeground(Color.WHITE);
        CreditCard3.add(limitcardidlabel);

        limitcardid = new JTextField();
        limitcardid.setBounds(190, 215, 200, 30);
        CreditCard3.add(limitcardid);

        btn14 = new JButton("Prev");
        btn14.setBounds(160, 350, 120, 25);
        CreditCard3.add(btn14);

        btn15 = new JButton("Set CreditLimit");
        btn15.setBounds(315, 350, 120, 25);
        CreditCard3.add(btn15);

        btn14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a){
                CreditCard1.setVisible(true);
                CreditCard3.dispose();
            }
        });

        btn15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a){
                setCreditLimit();
            }
        });
}

    // CreditCard 3 ends
public void addCreditCard(){
    try{
        if(CreditCVCT.getText().trim().isEmpty() || InterestT.getText().trim().isEmpty() || CreditCardIdT.getText().trim().isEmpty() || creditcb.getSelectedItem().equals("year") || creditd33.getSelectedItem().equals("month") || creditd3.getSelectedItem().equals("day")){
            throw new IllegalArgumentException("Unfilled Inputs");
        }
        else{
            int CVC=getCVCnumber();
            Double Interestrate=getInterestrate();
             String year=getcredityear();
             String month=getcreditmonth();
             String day=getcreditday();
             int creditid = getCreditCardid();
             boolean found = checkCardIdUnique(creditid);
             if(found == false){
                int cardId=getCreditCardid();
                String bankAcc = getBankAccount();
                int blcAmt = getBalanceAmount();
                String cltName = getClientName();
                String issBank = getIssuerBank();
                String expdate = year+""+month+""+day;
                BankCard credit = new CreditCard(cardId, cltName, issBank, bankAcc, blcAmt, CVC, Interestrate,expdate);
                bank_list.add(credit);
                JOptionPane.showMessageDialog(CreditCard,"The credit card was successfully created","Success",JOptionPane.INFORMATION_MESSAGE);
                creditobj = true;
                CreditCVCT.setText("");
                InterestT.setText("");
                CreditCardIdT.setText("");
                creditcb.setSelectedIndex(0);
                creditd33.setSelectedIndex(0);
                creditd3.setSelectedIndex(0);
             }
             else{
        JOptionPane.showMessageDialog(CreditCard,"Credit card ID must be unique","Error",JOptionPane.ERROR_MESSAGE);
             }
        }

    }catch(IllegalArgumentException ex){
        JOptionPane.showMessageDialog(CreditCard, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
    }
}

    public void addDebitCard(){
        try{
            char[] passwordchars = DPinNumberT.getPassword();
        String password = new String(passwordchars);
        if(DCardIdT.getText().trim().isEmpty()){
            throw new IllegalArgumentException("Unfilled Inputs");
        }
        else{
                int cardId=getcardID();
                int PIN=get();
                String bankAcc = getBankAccount();
                int blcAmt = getBalanceAmount();
                String cltName = getClientName();
                String issBank = getIssuerBank();
                boolean found = checkCardIdUnique(cardId);
                if(found==false){
                    BankCard obj = new DebitCard(blcAmt,cardId, bankAcc, issBank, cltName, PIN);
                bank_list.add(obj);
                debitobj = true;
                DCardIdT.setText("");
                DPinNumberT.setText("");
                JOptionPane.showMessageDialog(DebitCard1, "Debit Card created successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                JOptionPane.showMessageDialog(DebitCard1,"Debit card id should be unique.","Success",JOptionPane.ERROR_MESSAGE);
                }
        }
        }catch(IllegalArgumentException ex){
            JOptionPane.showMessageDialog(DebitCard,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cancelCreditCard() {
        if(limitset==true){
            String cardId = JOptionPane.showInputDialog(CreditCard1, "Please enter your card ID");
        if (cardId == null) {
            return;
        }
        int cardIdInt;
        try {
            cardIdInt = Integer.parseInt(cardId);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(CreditCard1, "Invalid card ID entered", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean cardFound = false;
        for (BankCard obj : bank_list) {
            if (obj instanceof CreditCard) {
                CreditCard c = (CreditCard) obj;
                if (c.getCardId() == cardIdInt) {
                    c.cancelCreditCard();
                    cardFound = true;
                    break;
                }
            }
        }
        if (cardFound==false) {
            JOptionPane.showMessageDialog(CreditCard1, "Card ID not found", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
        else{
            JOptionPane.showMessageDialog(CreditCard1,"Credit Card Limit has not been set yet", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setCreditLimit(){
        try {
            if(limit.getText().trim().isEmpty() || grace.getText().trim().isEmpty() || limitcardid.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(CreditCard3,"Unfilled Inputs","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                int gracePeriod = getGracePeriod();
                Double creditLimit = getCreditLimit();
                int cardid = getLimitCardid();
                if(limitset=false){
                    for(BankCard obj : bank_list){
                        if(obj instanceof CreditCard){
                            CreditCard c = (CreditCard) obj;
                            if(c.getCardId()==cardid){
                                c.setCreditLimit(creditLimit, gracePeriod);
                                limit.setText("");
                                grace.setText("");
                                limitcardid.setText("");
                                limitset=true;
                                CreditCard3.dispose();
                                CreditCard1.setVisible(true);
                            }
                            else{
                                throw new IllegalArgumentException("Card id didn't matched.");
                            }
                        }
                    }
                }
                else{
                    limit.setText("");
                                grace.setText("");
                                limitcardid.setText("");
                    System.out.println("Credit limit has already been set");
                }
            }
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(CreditCard3,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>CarId
    public int getCreditCardid(){
        try {
            int card = Integer.parseInt(CreditCardIdT.getText().trim());
            if(card<0){
                throw new IllegalArgumentException("Card id must be a positive number");
            }
            return card;
        } catch (IllegalArgumentException ex) {
            throw new NumberFormatException("Error: card id should be a number");
        }
    }

    public String getcreditday(){
            String expday = creditd3.getSelectedItem().toString();
            if(expday.equals("day")){
                throw new IllegalArgumentException("Invalid day");
            }
            return expday;
    }
    

    public String getcredityear() {
        String year = (String) creditcb.getSelectedItem();
        if (year.equals("year")) {
            throw new IllegalArgumentException("Invalid year");
        }
        return year;
    }

    public String getcreditmonth() {
        String month = (String) creditd33.getSelectedItem();
        if (month.equals("month")) {
            throw new IllegalArgumentException("Invalid month");
        }
        return month;
    }

    public String getWithdrawYear(){
            if(WYear.getSelectedItem().equals("Year")){
                throw new IllegalArgumentException("Invalid Year");
            }
            String withdrawyear = (String) WYear.getSelectedItem();
            return withdrawyear;
    }

    public String getWithdrawMonth(){
        if(WMonth.getSelectedItem().equals("Month")){
            throw new IllegalArgumentException("Invalid Month");
        }
        String withdrawmonth = (String) WMonth.getSelectedItem();
        return withdrawmonth;
}

public String getWithdrawday(){
    if(WDay.getSelectedItem().equals("day")){
        throw new IllegalArgumentException("Invalid day");
    }
    String withdrawday = (String) WDay.getSelectedItem();
    return withdrawday;
}
    public int get(){
        try{
            char[]passwordchars= DPinNumberT.getPassword();
            String password=new String(passwordchars);
            if(passwordchars.length==0){
                throw new IllegalArgumentException("empty pin");
            }
            int passnum=Integer.parseInt(password.trim());
            return passnum;
        }catch(NumberFormatException ex){
            throw new NumberFormatException("pin should be a number");
        }
    }

    public int getWithdraw(){
        try{
            char[] passwordchars = D1PinNumberT.getPassword();
            String password = new String(passwordchars);
            if(passwordchars.length == 0){
                throw new IllegalArgumentException("empty pin");
            }
            int passnum =Integer.parseInt(password);
            return passnum;
        } catch (IllegalArgumentException ex) {
            throw new NumberFormatException("pin should be a no.");
        }
    }

    public int getBalanceAmount(){
    try {
       if(BankAccountT.getText().trim().isEmpty()){
        throw new IllegalArgumentException("The balance amount is missing or empty");
       }
        int balanceInt = Integer.parseInt(BankAccountT.getText().trim());
        if(balanceInt<0){
            throw new IllegalArgumentException("Balance should be positive");
        }
       return balanceInt;
    } catch (NumberFormatException ex) {
        throw new NumberFormatException("Please enter a valid number for the balance amount");
    }
    }

    public String getClientName(){
       if(ClientNameT1.getText().isEmpty()){
         throw new IllegalArgumentException("Empty client name");
       }
       return ClientNameT1.getText().trim();
    }

    public String getIssuerBank(){
        if(IssuerBankT.getText().isEmpty()){
            throw new IllegalArgumentException("client name is missing or empty");
        }
        return IssuerBankT.getText();
    }

    public String getBankAccount(){
        if(BankAmountT.getText().isEmpty()){
            throw new IllegalArgumentException("BankAmount is missing or empty");
        }
        return BankAmountT.getText().trim();
    }

    public int getCVCnumber(){
        try{
            int CVCnumber=Integer.parseInt(CreditCVCT.getText().trim());
            if(CVCnumber<0){
                throw new IllegalArgumentException("CVC number needs to have a positive value");
            }
            return CVCnumber;
        } catch(IllegalArgumentException ex){
            throw new NumberFormatException("CVC should be a numeric value, please enter a valid number");
        }
    }

    public double getInterestrate(){
        try{
            Double Interestrate= Double.parseDouble(InterestT.getText().trim());
            if(Interestrate<0){
                throw new IllegalArgumentException("interest rate must be a positive number");
            }
            return Interestrate;
        } catch(IllegalArgumentException ex){
            throw new NumberFormatException("Interest Rate should be a number");
        }
    }

    public double getCreditLimit(){
        try{
            Double creditlimit= Double.parseDouble(limit.getText().trim());
            if(creditlimit<0){
                throw new IllegalArgumentException("Credit Limit must be positive");
            }
            return creditlimit;
        } catch(IllegalArgumentException ex){
            throw new NumberFormatException("Credit Limit should be a number");
        }
    }

    public int getGracePeriod(){
        try{
            int gracePeriod=Integer.parseInt(grace.getText().trim());
        if(gracePeriod<0){
            throw new IllegalArgumentException("Grace Period must be positive");
        }
        return gracePeriod;
    } catch(NumberFormatException ex){
        throw new NumberFormatException("Enter a valid grace periodr");
    }
    }

    public int getcardID(){
        try{
            int cardId=Integer.parseInt(DCardIdT.getText().trim());
            if(cardId<0){
                throw new IllegalArgumentException("Card ID must be positive");
            }
            return cardId;
        } catch(NumberFormatException ex){
            throw new NumberFormatException("CardID should be a number");
        }
    }

    public int getLimitCardid(){
        try{
            if(limitcardid.getText().trim().isEmpty()){
                throw new IllegalArgumentException("Empty cardId");
            }
            int cardId=Integer.parseInt(limitcardid.getText().trim());
            return cardId;
        } catch(NumberFormatException ex){
            throw new NumberFormatException("Enter a valid card ID");
        }
    }

    public int getwithdrawcardID(){
        try{
            if(D1CardIdT.getText().trim().isEmpty()){
                throw new IllegalArgumentException("Enter a card ID");
            }
            int cardId=Integer.parseInt(D1CardIdT.getText().trim());
            return cardId;
        } catch(NumberFormatException ex){
            throw new NumberFormatException("Enter a valid card ID");
        }
    }

    public int getWIthdrawlAmt(){
        try{
            int withdrawlAmt=Integer.parseInt(WithdrawalAmountT.getText().trim());
            if(withdrawlAmt<0){
                throw new IllegalArgumentException("Enter a withdrawal amount greater than zero");
            }
            return withdrawlAmt;
        }catch(NumberFormatException ex){
            throw new NumberFormatException("Enter a valid withdrawal amount");
        }
    }


    
    public boolean checkCardIdUnique(int cardId){
        boolean found = false;
        for(BankCard obj : bank_list){
            if(obj instanceof DebitCard){
                DebitCard card = (DebitCard) obj;
                if(card.getCardId() == cardId){
                    found = true;
                }
            }
            else if( obj instanceof CreditCard){
                CreditCard card = (CreditCard) obj;
                if(card.getCardId() == cardId){
                    found = true;
                }
            }
        }
        return found;
    }
    public static void main(String[] args) {
        BankGUI obj = new BankGUI();
    }
}