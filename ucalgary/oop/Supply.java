package edu.ucalgary.oop;

public class Supply {
    /* Member variables */
    private String type;
    private int quantity;

    /* Class methods */

    // Constructor
    public Supply(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    // Getters and Setters

    // Type
    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    // Quantity
    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }
}
