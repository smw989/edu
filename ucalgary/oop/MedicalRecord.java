package edu.ucalgary.oop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;
    private DisasterVictim victim;

    public MedicalRecord(Location location, String treatmentDetails, Date dateOfTreatment, DisasterVictim victim) {
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.dateOfTreatment = sdf.format(dateOfTreatment);
        this.victim = victim;
    }

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

    public void setDateOfTreatment(String dateOfTreatment) {
        this.dateOfTreatment = dateOfTreatment;
    }

}
