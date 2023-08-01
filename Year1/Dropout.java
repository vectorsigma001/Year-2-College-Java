class Dropout extends Student
{
   private int numOfRemainingModules;
   private int numOfMonthsAttended;
   private String dateOfDropout;
   private int remainingAmount;
   private boolean hasPaid;
   //creating a constructor called Dropout with Student class attributes and Dropout attributes
   public Dropout(int enrollmentID,String dateOfBirth, String courseName, String studentName,String dateOfEnrollment,
   int courseDuration, int tuitionFee, int numOfRemainingModules, int numOfMonthsAttended, String dateOfDropout ){
        //calling super call attributes 
        super(dateOfBirth, studentName, courseDuration, tuitionFee);
        //calling superclass setter method
        setEnrollmentID(enrollmentID); 
        setCourseName(courseName);
        setDateOfEnrollment(dateOfEnrollment);
        //giving value of Dropout class attributes with paramter attributes 
        this.numOfRemainingModules=numOfRemainingModules;
        this.numOfMonthsAttended=numOfMonthsAttended;
        this.dateOfDropout=dateOfDropout;
        this.remainingAmount=0;
        this.hasPaid=false;
}
    //creating a getter method to return the value of numOfRemainingModules
    public int getNumOfRemainingModules()
    {
        return numOfRemainingModules;
    }
    //creating a getter method to return the value of numOfMonthsAttended
    public int getNumOfMonthsAttended()
    {
    return numOfMonthsAttended;
    }
    //creating a getter method to return the value of DateOfDropout
    public String getDateOfDropout()
    {
    return dateOfDropout;
    }
    //creating a getter method to return the value of remainingAmount
    public int getRemainingAmount()
    {
    return remainingAmount;
    }
    //creating a getter method to return the value of hasPaid
    public boolean getHasPaid()
    {
    return hasPaid;
    }
    
  //creating a billsPayable method to calculate the value of remaingAmount and sets the value of hasPaid as true
  public void billsPayable()
  {
    if(hasPaid=false){
        if(super.getCourseDuration()>=numOfMonthsAttended){
            remainingAmount=(super.getCourseDuration() -numOfMonthsAttended)*super.getTuitionFee();
            this.hasPaid=true;
            System.out.println("The bills are payed, no pending amount");
        }
        else{
            System.out.println("Remaining amount cannot be calculated....");
        }
    }
    else{
        System.out.println("All bills are cleared out....");
    }
  }
    /*creating a removeStudent method where if hasPaid is set to true then all the attributes of student class and removeStudent class is set to empty string, null or false 
     which depends on the datatypes
     */ 
    public void removeStudent()
    {
        if(hasPaid==true)
        {
            super.setEnrollmentID(0);
            super.setDateOfBirth("");
            super.setCourseName("");
            super.setStudentName("");
            super.setDateOfEnrollment("");
            super.setCourseDuration(0);
            super.setTuitionFee(0);
            this.numOfRemainingModules=0;
            this.numOfMonthsAttended=0;
            this.dateOfDropout="";
            this.remainingAmount=0;
            System.out.println("Bills are cleared");
            this.hasPaid=false;
        }
       else
       {
            System.out.println("All bills not cleared");
       }
    }
 //creating a display method which prints all the attributes of super class and prints attributes of Dropout class
 public void display()
 {
    super.display();
    System.out.println("Number of remaining modules: "+numOfRemainingModules);
    System.out.println("Total number of months attended: "+numOfMonthsAttended);
    System.out.println("Date Of Dropout: "+dateOfDropout);
    System.out.println("Remaining amount: "+remainingAmount);
    }
}
