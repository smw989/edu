package edu.ucalgary.oop;

import java.util.Date; // If the date is managed as a Date object. Otherwise, use String for simplicity.

public class ReliefService {
    private Inquirer inquirer; // Assuming there's an Inquirer class defined elsewhere
    private DisasterVictim missingPerson; // Assuming there's a DisasterVictim class defined elsewhere
    private String dateOfInquiry; // Use java.util.Date for actual date objects if needed
    private String infoProvided;
    private Location lastKnownLocation; // Assuming there's a Location class defined elsewhere

    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.dateOfInquiry = dateOfInquiry;
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    public Inquirer getInquirer() {
        return inquirer;
    }

    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }

    public DisasterVictim getMissingPerson() {
        return missingPerson;
    }

    public void setMissingPerson(DisasterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }

    public String getDateOfInquiry() {
        return dateOfInquiry;
    }

    public void setDateOfInquiry(String dateOfInquiry) {
        this.dateOfInquiry = dateOfInquiry;
    }

    public String getInfoProvided() {
        return infoProvided;
    }

    public void setInfoProvided(String infoProvided) {
        this.infoProvided = infoProvided;
    }

    public Location getLastKnownLocation() {
        return lastKnownLocation;
    }

    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }

    /*public void printLogDetails() {
        System.out.println(getLogDetails());
    }*/

    public String getLogDetails() {
        StringBuilder logDetails = new StringBuilder();
        logDetails.append("Inquirer Name: ").append(inquirer.getFirstName()).append(" ").append(inquirer.getLastName()).append("\n");
        logDetails.append("Missing Person: ").append(missingPerson.getFirstName()).append(" ").append(missingPerson.getLastName()).append("\n");
        logDetails.append("Date of Inquiry: ").append(dateOfInquiry).append("\n");
        logDetails.append("Information Provided: ").append(infoProvided).append("\n");
        logDetails.append("Last Known Location: ").append(lastKnownLocation.getName()).append(", ").append(lastKnownLocation.getAddress());
        return logDetails.toString();
    }
}
