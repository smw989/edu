package edu.ucalgary.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Date;

public class DisasterVictim {
    private static int nextAssignedSocialID = 0;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String comments;
    private int assignedSocialID;
    private List<MedicalRecord> medicalRecords;
    private List<FamilyRelation> familyConnections;
    private String entryDate;
    private List<Supply> personalBelongings;
    private static int counter;

    public DisasterVictim(String firstName, String entryDate) {
        this.firstName = firstName;
        this.entryDate = validateDateFormat(entryDate); 
        this.assignedSocialID = ++nextAssignedSocialID;
        this.medicalRecords = new ArrayList<>();
        this.familyConnections = new ArrayList<>();
        this.personalBelongings = new ArrayList<>();
        counter++;
    }

    private String validateDateFormat(String date) {
        if (!date.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Date must be in YYYY-MM-DD format.");
        }
        return date;
    }    

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {   
        return lastName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || !firstName.matches("[a-zA-Z\\s]+")) {
            throw new IllegalArgumentException("First name cannot be null and must contain only letters.");
        }
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        if (lastName == null || !lastName.matches("[a-zA-Z\\s]+")) {
            throw new IllegalArgumentException("Last name cannot be null and must contain only letters.");
        }
        this.lastName = lastName;
    }    
    

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        if (!dateOfBirth.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Date of birth must be in YYYY-MM-DD format.");
        }
        this.dateOfBirth = dateOfBirth;
    }
    

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == null || !(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))) {
            throw new IllegalArgumentException("Error");
        }
        this.gender = gender;
    }    

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        if (comments == null) {
            throw new IllegalArgumentException("Comments cannot be null. Use 'No comments' if necessary.");
        }
        this.comments = comments;
    }    

    public void setAssignedSocialID(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Assigned Social ID must be positive.");
        }
        this.assignedSocialID = id;
    }    

    public int getAssignedSocialID() {
        return assignedSocialID;
    }

    public void setMedicalRecords(MedicalRecord[] medicalRecordsArray) {
        if (medicalRecordsArray == null) {
            throw new IllegalArgumentException("Medical records array cannot be null.");
        }
        for (MedicalRecord record : medicalRecordsArray) {
            if (record == null) {
                throw new IllegalArgumentException("Individual medical record in the array cannot be null.");
            }
        }
        this.medicalRecords = new ArrayList<>(Arrays.asList(medicalRecordsArray));
    }    

    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords.toArray(new MedicalRecord[0]);
    }

        public void addMedicalRecord(Location location, String description, String dateString) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = dateFormat.parse(dateString);
                String formattedDate = dateFormat.format(date); // Format the date into a String
                MedicalRecord record = new MedicalRecord(location, description, formattedDate, this);
                this.medicalRecords.add(record);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }    
        
        public void setFamilyConnections(FamilyRelation[] familyConnections) {
            if (familyConnections == null) {
                throw new IllegalArgumentException("Family connections cannot be null.");
            }
            for (FamilyRelation relation : familyConnections) {
                if (relation == null) {
                    throw new IllegalArgumentException("Family relation cannot be null.");
                }
            }
            this.familyConnections = new ArrayList<>(Arrays.asList(familyConnections));
        }    

        public FamilyRelation[] getFamilyConnections() {
            return familyConnections.toArray(new FamilyRelation[0]);
        }

        public void addFamilyConnection(FamilyRelation familyConnection) {
            if (familyConnection == null) {
                throw new IllegalArgumentException("Family connection cannot be null.");
            }
            this.familyConnections.add(familyConnection);
        }
        
        public void removeFamilyConnection(FamilyRelation familyConnection) {
            if (familyConnection == null) {
                throw new IllegalArgumentException("Family connection cannot be null.");
            }
            this.familyConnections.remove(familyConnection);
        }
    

    public void setEntryDate(String entryDate) {
        if (!entryDate.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Entry date must be in YYYY-MM-DD format.");
        }
        this.entryDate = entryDate;
    }    

    public String getEntryDate() {
        return entryDate;
    }

    public void setPersonalBelongings(Supply[] personalBelongings) {
        if (personalBelongings == null) {
            throw new IllegalArgumentException("Personal belongings array cannot be null.");
        }
        for (Supply supply : personalBelongings) {
            if (supply == null) {
                throw new IllegalArgumentException("Individual supply in the array cannot be null.");
            }
        }
        this.personalBelongings = new ArrayList<>(Arrays.asList(personalBelongings));
    }    

    public Supply[] getPersonalBelongings() {
        return personalBelongings.toArray(new Supply[0]);
    }

    public void addPersonalBelonging(Supply supply) {
        if (supply == null) {
            throw new IllegalArgumentException("Supply cannot be null.");
        }
        this.personalBelongings.add(supply);
    }

    public void removePersonalBelonging(Supply supply) {
        if (supply == null) {
            throw new IllegalArgumentException("Supply cannot be null.");
        }
        this.personalBelongings.remove(supply);
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int value) {
        counter = value;
    }
}

