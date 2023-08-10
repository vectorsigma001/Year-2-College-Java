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

    // Creating a method to check the uniqueness of the enrollment id for Dropout
    
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
    }public boolean checkUniqueEID1(int eId) {
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

    // Creating a method to check the uniqueness of the enrollment id for Dropout
    
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
