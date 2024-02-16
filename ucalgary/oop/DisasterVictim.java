package edu.ucalgary.oop;

import java.util.Arrays;

public class DisasterVictim {
    /* Member variables */

    private static int counter = 0;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String comments;
    private int assignedSocialID;
    private MedicalRecord[] medicalRecords = {};
    private FamilyRelation[] familyConnections = {};
    private String entryDate;
    private Supply[] personalBelongings = {};

    /* Class Methods */

    // Validate date format
    private String validateDateFormat(String date) {
        if (!date.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Date must be in YYYY-MM-DD format.");
        }
        return date;
    }

    // Generic method to add an element to an array
    public static <T> T[] addElementToArray(T[] array, T element) {
        T[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[array.length] = element;
        return newArray;
    }

    // Generic method to remove an element from an array
    public static <T> T[] removeElementFromArray(T[] array, T element) {
        int indexToRemove = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            T[] newArray = Arrays.copyOf(array, array.length - 1);
            System.arraycopy(array, 0, newArray, 0, indexToRemove);
            System.arraycopy(array, indexToRemove + 1, newArray, indexToRemove, newArray.length - indexToRemove);
            return newArray;
        } else {
            // If the element is not found, return the original array
            return array;
        }
    }

    // Constructor
    public DisasterVictim(String firstName, String entryDate) {
        this.firstName = firstName;
        this.entryDate = validateDateFormat(entryDate); // Assume this method validates and returns the date or throws
        this.assignedSocialID = ++counter;
        /* Using arrays instead of lists
        this.medicalRecords = new ArrayList<>();
        this.familyConnections = new ArrayList<>();
        this.personalBelongings = new ArrayList<>(); */
    }

    // Additional constructor to match your test setup
    public DisasterVictim(String firstName, String lastName, String dateOfBirth, String gender, String entryDate, String assignedSocialID) {
        this(firstName, entryDate); // Chain constructor
        this.lastName = lastName;
        this.dateOfBirth = validateDateFormat(dateOfBirth);
        this.gender = gender;
        // Ignoring the assignedSocialID argument in favor of automatic assignment
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getComments() {
        return comments;
    }

    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords;
    }

    public String getEntryDate() { return entryDate; }

    public int getAssignedSocialID() {
        return assignedSocialID;
    }

    public Supply[] getPersonalBelongings() { return personalBelongings; }

    public FamilyRelation[] getFamilyConnections() {
        return familyConnections;
    }

    public String getGender() {
        return gender;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = validateDateFormat(dateOfBirth);
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setMedicalRecords(MedicalRecord[] medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public void setPersonalBelongings(Supply[] supplies) { // Just following UML diagram naming conventions
        this.personalBelongings = supplies;
    }

    public void setFamilyConnections(FamilyRelation[] relation) { // Just following UML diagram naming conventions
        this.familyConnections = relation;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    /* Array manipulation */

    // Personal belongings
    public void addPersonalBelonging(Supply supply) {
        personalBelongings = addElementToArray(personalBelongings, supply);
    }

    public void removePersonalBelonging(Supply supply) {
        personalBelongings = removeElementFromArray(personalBelongings, supply);
    }

    // Family connections
    public void addFamilyConnection(FamilyRelation familyConnection) {
        familyConnections = addElementToArray(familyConnections, familyConnection);
    }

    public void removeFamilyConnection(FamilyRelation familyConnection) {
        familyConnections = removeElementFromArray(familyConnections, familyConnection);
    }

    // Medical records
    public void addMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecords = addElementToArray(medicalRecords, medicalRecord);
    }

    /* entryDate is a constant so can't be modified
    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }*/

}
