package edu.ucalgary.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;
    private DisasterVictim victim;

    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment, DisasterVictim victim) {
        setLocation(location); // Validates and sets location
        setTreatmentDetails(treatmentDetails); // Validates and sets treatment details
        setDateOfTreatment(dateOfTreatment); // Already validates date format
        this.victim = victim;
    }

    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        this.dateOfTreatment = dateOfTreatment;
        this.victim = null; 
    }

    public String getTreatmentDetails() {
        return treatmentDetails;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        if (treatmentDetails == null || treatmentDetails.trim().isEmpty()) {
            throw new IllegalArgumentException("Treatment details cannot be null or empty.");
        }
        this.treatmentDetails = treatmentDetails;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        if (location == null) {
            throw new IllegalArgumentException("Location cannot be null.");
        }
        this.location = location;
    }

    public String getDateOfTreatment() {
        return dateOfTreatment;
    }

    public void setDateOfTreatment(String dateOfTreatment) {
        if (!dateOfTreatment.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Date of treatment must be in YYYY-MM-DD format.");
        }
        this.dateOfTreatment = dateOfTreatment;
    }
    

}
