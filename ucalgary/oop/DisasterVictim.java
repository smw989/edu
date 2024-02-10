package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.List;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String comments;
    private String assignedSocialID;
    private List<MedicalRecord> medicalRecords = new ArrayList<>();
    private List<FamilyRelation> familyConnections = new ArrayList<>();
    private String entryDate;
    private List<Supply> personalBelongings = new ArrayList<>();
    private int counter;

    public DisasterVictim(String firstName, String lastName, String dateOfBirth, String gender, String entryDate, String assignedSocialID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.entryDate = entryDate;
        this.assignedSocialID = assignedSocialID;
        this.counter = 0;
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

    public String getAssignedSocialID() {
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
}
