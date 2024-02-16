package edu.ucalgary.oop;

public class Inquirer {
    /* Member variables */
    private String firstName;
    private String lastName;
    private String info;	
    private String servicesPhone;

    /* Class methods*/

    //Constructor
    // Constructor to set all attributes at the time of object creation
    public Inquirer(String firstName, String lastName, String servicesPhone, String info) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.servicesPhone = servicesPhone;
        this.info = info;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getInfo() {
        return info;
    }

    public String getServicesPhoneNum() {
        return servicesPhone;
    }
}




