package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.List;

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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {   
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getAssignedSocialID() {
        return assignedSocialID;
    }

    public void setMedicalRecords(List<MedicalRecord> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }   

    public List<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }

    public void addMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecords.add(medicalRecord);
    }

    public void setFamilyConnections(List<FamilyRelation> familyConnections) {
        this.familyConnections = familyConnections;
    }

    public List<FamilyRelation> getFamilyConnections() {
        return familyConnections;
    }

    public void addFamilyConnection(FamilyRelation familyConnection) {
        this.familyConnections.add(familyConnection);
    }

    public void removeFamilyConnection(FamilyRelation familyConnection) {
        this.familyConnections.remove(familyConnection);
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public List<Supply> getPersonalBelongings() {
        return personalBelongings;
    }

    public void setPersonalBelongings(List<Supply> personalBelongings) {
        this.personalBelongings = personalBelongings;
    }

    public void addPersonalBelonging(Supply supply) {
        this.personalBelongings.add(supply);
    }

    public void removePersonalBelonging(Supply supply) {
        this.personalBelongings.remove(supply);
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int value) {
        counter = value;
    }
}

