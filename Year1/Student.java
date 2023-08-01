class Student
{
    private String dateOfBirth;
    private String courseName;
    private String studentName;
    private String dateOfEnrollment;
    private int enrollmentID;
    private int courseDuration;
    private int tuitionFee;
   //creating a constructor     
    public Student(String dateOfBirth,String studentName,int courseDuration,int tuitionFee)
    {
        this.dateOfBirth=dateOfBirth;
        this.studentName=studentName;
        this.courseDuration=courseDuration;
        this.tuitionFee=tuitionFee;
        this.courseName="";
        this.dateOfEnrollment="";
        this.enrollmentID=0;
     }
     //creating a getter method to return value of dateOfBirth
     public String getDateOfBirth()
     {
         return dateOfBirth;
     }
     //creating a getter method to return value of courseName
     public String getCourseName()
     {
         return courseName;
     }
     //creating a getter method to return value of studentName
     public String getStudentName()
     {
         return studentName;
     }
     //creating a getter method to return value of dateOfEnrollment
     public String getDateOfEnrollment()
     {
         return dateOfEnrollment;
     }
     //creating a getter method to return value of enrollmentID
     public int getEnrollmentID()
     {
         return enrollmentID;
     }
     //creating a getter method to return value of courseDuration
     public int getCourseDuration()
     {
         return courseDuration;
     }
     //creating a getter method to return value of tuitionFee
     public int getTuitionFee()
     {
         return tuitionFee;
     }
     //creating a setter method to set the value of dateOfBirth
     public void setDateOfBirth(String dateOfBirth)
     {
         this.dateOfBirth=dateOfBirth;
     }
     //creating a setter method to set the value of courseName
     public void setCourseName(String courseName)
     {
         this.courseName=courseName;
     }
     //creating a setter method to set the value of studentName
     public void setStudentName(String studentName)
     {
         this.studentName=studentName;
     }  
     //creating a setter method to set the value of dateOfEnrollment
     public void setDateOfEnrollment(String dateOfEnrollment)
     {
         this.dateOfEnrollment=dateOfEnrollment;
     }
     //creating a setter method to set the value of enrollmentID
     public void setEnrollmentID(int enrollmentID)
     {
         this.enrollmentID=enrollmentID;
     }
     //creating a setter method to set the value of courseDuration
     public void setCourseDuration(int courseDuration)
     {
         this.courseDuration=courseDuration;
     }
     //creating a setter method to set the value of tuitionFee
     public void setTuitionFee(int tuitionFee)
     {
         this.tuitionFee=tuitionFee;
     }
     //creating a display method when displays all the value only if all the value are set 
     public void display()
     {
         if(dateOfBirth==""||courseName==""||studentName==""||dateOfEnrollment==""||enrollmentID==0||
         courseDuration==0||tuitionFee==0)
         {
             System.out.println("Please set all of your parameters");
         }
         else
         {
             System.out.println("Date Of Birth "+dateOfBirth);
             System.out.println("Course Name"+courseName);
             System.out.println("Student Name "+studentName);
             System.out.println("Date of Enrollment "+dateOfEnrollment);
             System.out.println("Enrollment id "+enrollmentID);
             System.out.println("Course Duration "+courseDuration);
             System.out.println("Tuition Fee "+tuitionFee);
         }
     }    
}
