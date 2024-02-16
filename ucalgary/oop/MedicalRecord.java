package edu.ucalgary.oop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MedicalRecord {
    /* Member variables */

    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    // Not in UML diagram for this class
    //private DisasterVictim victim;

    /* Class Methods */

    // Validate date format
    private String validateDateFormat(String date) {
        if (!date.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Date must be in YYYY-MM-DD format.");
        }
        return date;
    }

    // Constructor
    // UML diagram only requires 3 parameters, not 4
    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        this.dateOfTreatment = validateDateFormat(dateOfTreatment);
        //this.victim = victim; Not included in UML diagram
    }

    // Getters
    public String getTreatmentDetails() {
        return treatmentDetails;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getDateOfTreatment() {
        return dateOfTreatment;
    }

    // Setters
    public void setDateOfTreatment(String dateOfTreatment) {
        this.dateOfTreatment = validateDateFormat(dateOfTreatment);
    }

}
