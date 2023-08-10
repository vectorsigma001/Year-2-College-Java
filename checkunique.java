public boolean checkUniqueEID1(int eId) {
        boolean isUnique = false;
        for (Student obj : list) {
            // using the instanceof keyword
            if (obj instanceof Regular) {
                // downcasting
                Regular robj = (Regular) obj;
                if (eId == robj.getEnrollmentID()) {
                    isUnique = true;
                    break;
                }
            }
        }
        return isUnique;
    }


    
    public boolean checkUniqueEID2(int eId) {
        boolean isUnique = false;
        for (Student obj : list) {
            if (obj instanceof Dropout) {
                // downcasting
                Dropout dobj = (Dropout) obj;
                if (dobj.getEnrollmentID() == eId) {
                    isUnique = true;
                    break;
                }
            }
        }
        return isUnique;
    }


//edit  dropout button action listener
        addDropoutbt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){

        int numOfRemainingModules=getNumberOfRemainingModules();
        if(numOfRemainingModules==INVALID){
          JOptionPane.showMessageDialog(frame,"Select valid number of remaining modules");
          return;
        }
        int numofMonthsAttended=getNumberOfMonthsAttended();
        if(numofMonthsAttended==INVALID){
          JOptionPane.showMessageDialog(frame,"Select valid number of months attended");
          return;
        }
        
        int dropoutEnrollmentId=getDropoutEnrollmentId();
        if(dropoutEnrollmentId==INVALID){
          JOptionPane.showMessageDialog(frame,"Select valid Enrollment Id");
          return;
        }
        
        String dateOfDropout=getDateOfDropout();
        if(dateOfDropout==null){
          JOptionPane.showMessageDialog(frame,"Select date of Dropout");
          return;
        }

        
        String studentName=getStudentName();
        if(studentName.equals("")){
          JOptionPane.showMessageDialog(frame,"Select your Student Name");
          return;
        }
        
        String dateOfBirth=getStudentDateOfBirth();
        if(dateOfBirth.equals("")){
          JOptionPane.showMessageDialog(frame,"Select your date of birth");
          return;
        }
      
        String courseName=getStudentCourseName();
        if(courseName.equals("")){
          JOptionPane.showMessageDialog(frame,"Select your Course Name");
          return;
        }
        
        int enrollmentId=getStudentEnrollmentId();
        if(enrollmentId==INVALID){
          JOptionPane.showMessageDialog(frame,"Select your enrollment Id");
          return;
        }
        
        String dateOfEnrollment=getStudentDateOfEnrollment();
        if(dateOfEnrollment==null){
          JOptionPane.showMessageDialog(frame,"Select your enrollment date of enrollment");
          return;
        }
        
        int courseDuration=getStudentCourseDuration();
        if(courseDuration==INVALID){
          JOptionPane.showMessageDialog(frame,"Select your course duration");
          return;
        }
        
        int tuitionFee=getStudentTuitionFee();
        if(tuitionFee==INVALID){
          JOptionPane.showMessageDialog(frame,"Select a valid tuition fee");
          return;
        }
        
        Student dropoutobj = new Dropout(studentName,dateOfBirth,courseName,enrollmentId,dateOfEnrollment,courseDuration,tuitionFee,numOfRemainingModules,numofMonthsAttended,dropoutEnrollmentId,dateOfDropout);
        studental.add(dropoutobj);
        boolean checkingunique=checkUniquere(dropoutEnrollmentId);
        if(checkingunique==true){
          JOptionPane.showMessageDialog(frame,"The enrollment Id is not unique");
        }
        if(checkingunique==false){
          JOptionPane.showMessageDialog(frame,"The enrollment Id is unique");
        }
        JOptionPane.showMessageDialog(frame,"Dropout student record successfully recorded");
        dropoutDisplaybt.setVisible(true);
      }
    });
//edit regular button action listener
 addRegularbt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){

        int numOfModules=getRegularNumOfModules();
        if(numOfModules==INVALID){
          JOptionPane.showMessageDialog(frame,"Select exact Number Of Modules");
          return;
        }
        int regularEnrollmentIdCheck=getRegularEnrollmentId();
        if(regularEnrollmentIdCheck==INVALID){
          JOptionPane.showMessageDialog(frame,"Select exact enrollment Id");
          return;
        }

        int numOfCreditHours1=getRegularNumOfCreditHours();
        if(numOfCreditHours1==INVALID){
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
        if(studentName.equals("")){
          JOptionPane.showMessageDialog(frame,"Select your Student Name");
          return;
        }
        String dateOfBirth=getStudentDateOfBirth();
        if(dateOfBirth.equals("")){
          JOptionPane.showMessageDialog(frame,"Select your date of birth");
          return;
        }
        String courseName=getStudentCourseName();
        if(courseName.equals("")){
          JOptionPane.showMessageDialog(frame,"Select your Course Name");
          return;
        }
        int enrollmentId=getStudentEnrollmentId();
        if(enrollmentId==INVALID){
          JOptionPane.showMessageDialog(frame,"Select your enrollment Id");
          return;
        }
        String dateOfEnrollment=getStudentDateOfEnrollment();
        if(dateOfEnrollment==null){
          JOptionPane.showMessageDialog(frame,"Select your enrollment date of enrollment");
          return;
        }
        int courseDuration=getStudentCourseDuration();
        if(courseDuration==INVALID){
          JOptionPane.showMessageDialog(frame,"Select your course duration");
          return;
        }
        int tuitionFee=getStudentTuitionFee();
        if(tuitionFee==INVALID){
          JOptionPane.showMessageDialog(frame,"Select a valid tuition fee");
          return;
        }


        Student reg = new Regular(studentName,dateOfBirth,courseName,enrollmentId,dateOfEnrollment,courseDuration,tuitionFee,numOfModules,regularEnrollmentIdCheck,numOfCreditHours1,numOfDaysPresent);
        studental.add(reg);
        boolean checkingunique=checkUniquere(regularEnrollmentIdCheck);
        if(checkingunique==true){
          JOptionPane.showMessageDialog(frame,"The enrollment Id is not unique");
        }
        else if(checkingunique==false){
          JOptionPane.showMessageDialog(frame,"The enrollment Id is unique");
        }
        JOptionPane.showMessageDialog(frame,"Regular student record successfully recorded");
        displayRegularButtonbt.setVisible(true);
        
      
      
      }  
    });
