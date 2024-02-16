package edu.ucalgary.oop;

import java.util.Date; // If the date is managed as a Date object. Otherwise, use String for simplicity.

public class ReliefService {
    /* Member variables */
    private Inquirer inquirer; // Assuming there's an Inquirer class defined elsewhere
    private DisasterVictim missingPerson; // Assuming there's a DisasterVictim class defined elsewhere
    private String dateOfInquiry; // Use java.util.Date for actual date objects if needed
    private String infoProvided;
    private Location lastKnownLocation; // Assuming there's a Location class defined elsewhere

    /* Class methods*/

    // Validate date format
    private String validateDateFormat(String date) {
        if (!date.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Date must be in YYYY-MM-DD format.");
        }
        return date;
    }

    //Constructor
    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.dateOfInquiry = validateDateFormat(dateOfInquiry);
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    // Getters and Setters

    // inquirer
    public Inquirer getInquirer() {
        return inquirer;
    }

    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }

    // Missing person
    public DisasterVictim getMissingPerson() {
        return missingPerson;
    }

    public void setMissingPerson(DisasterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }

    // Date of inquiry
    public String getDateOfInquiry() {
        return dateOfInquiry;
    }

    public void setDateOfInquiry(String dateOfInquiry) {
        this.dateOfInquiry = validateDateFormat(dateOfInquiry);
    }

    // Info provided
    public String getInfoProvided() {
        return infoProvided;
    }

    public void setInfoProvided(String infoProvided) {
        this.infoProvided = infoProvided;
    }

    // Last known location
    public Location getLastKnownLocation() {
        return lastKnownLocation;
    }

    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }

    // Log details
    public String getLogDetails() {
        return "Inquirer: " + inquirer.getFirstName() +
                ", Missing Person: " + missingPerson.getFirstName() +
                ", Date of Inquiry: " + dateOfInquiry + 
                ", Info Provided: " + infoProvided + 
                ", Last Known Location: " + lastKnownLocation.getName();
    }

    /*public void printLogDetails() {
        System.out.println(getLogDetails());
    }*/
}
