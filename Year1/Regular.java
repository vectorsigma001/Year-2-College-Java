class Regular extends Student{
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship=false;
    //construtor of Regular class
    public Regular(int enrollmentID, String dateOfBirth, String courseName, String studentName,String dateOfEnrollment, int courseDuration, int tuitionFee,
    int numOfModules, int numOfCreditHours, double daysPresent)
    {
        super(dateOfBirth,studentName,courseDuration,tuitionFee);
        setCourseName(courseName);
        setEnrollmentID(enrollmentID);
        setDateOfEnrollment(dateOfEnrollment);
        this.numOfModules=numOfModules;
        this.numOfCreditHours=numOfCreditHours;
        this.daysPresent=daysPresent;
        this.isGrantedScholarship=false;
    }
    //creating a getter method to return value of numOfModules
        public int getNumOfModules()
        {
            return numOfModules;
        }
        //creating a getter method to return the value of numOfCreditHours
        public int getNumOfCreditHours()
        {
            return numOfCreditHours;
        }
        //creating a getter method to return the value of daysPresent
        public double getDaysPresent()
        {
            return daysPresent;
        }
        //creating a getter method to return the value of isGrantedScholarhip
        public boolean getIsGrantedScholarship()
        {
            return isGrantedScholarship;
        }
        //while giving value in couse duration give the value in month and while giving the value in numofdayspresent 
        //give the value in days and we will change into month by diving by 30 at the end 
        //creating a method to calculate presentPercentage
        public char presentPercentage(double numOfDaysPresent)
        {
            this.daysPresent=numOfDaysPresent;
            char attendanceGrade=' ';
            double presentPercentage=(numOfDaysPresent/30/super.getCourseDuration())*100;
            if(super.getCourseDuration()<numOfDaysPresent/30)
            {
                System.out.println("Sorry you need to Study again from beginning");
            }
            else if(presentPercentage>=80 && presentPercentage<=100)
            {
                isGrantedScholarship=true;
                attendanceGrade='A';
            }
            else if(presentPercentage>=60&&presentPercentage<=79)
            {
                attendanceGrade='B';
            }
            else if(presentPercentage>=40&&presentPercentage<=59)
            {
                attendanceGrade='C';
            }
            else if(presentPercentage>=20&&presentPercentage<=39)
            {
                attendanceGrade='D';
            }
            else
            {
                attendanceGrade='E';
            }
            return attendanceGrade;
         }
         //creating a method to print courseName,enrollmentID,dateOfEnrollment,and if the scholarship has been granted print the scholarship has been granted
          public void grandCertificate(String courseName,int enrollmentID,String dateOfEnrollment)
          {
              System.out.println("Course Name is "+courseName);
              System.out.println("EnrollmentId is "+enrollmentID);
              System.out.println("Date of enrollment is "+dateOfEnrollment);
              System.out.println("Student has graduated");
              if(isGrantedScholarship==true)
              {
                  System.out.println("The scholarship has been granted");
              }
          }
          //creating a display method to print super class attributes and to print numOfModules,numOfCreditHours,daysPresent 
          public void display()
          {
             super.display();
             System.out.println("Number of Module: "+numOfModules);
             System.out.println("Number of credit hours: "+numOfCreditHours);
             System.out.println("Number of days present: "+daysPresent);
          }    
}
