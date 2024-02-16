package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Location {
    /* Member variables */

    private String name;
    private String address;
    private DisasterVictim[] occupants = {};
    private Supply[] supplies = {};

    /* Class methods */

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
    public Location(String name, String address) {
        this.name = name;
        this.address = address;

        /* Using arrays instead of lists
        this.occupants = new ArrayList<>();
        this.supplies = new ArrayList<>(); */
    }

    // Getters and Setters

    // Name
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    // Address
    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    // Occupants
    public DisasterVictim[] getOccupants() {
        return occupants;
    }

    public void setOccupants(DisasterVictim[] occupants) {
        this.occupants = occupants;
    }

    // Supplies
    public Supply[] getSupplies() {
        return supplies;
    }

    public void setSupplies(Supply[] supplies) {
        this.supplies = supplies;
    }

    // Methods for managing occupants
    public void addOccupant(DisasterVictim occupant) {
        occupants = addElementToArray(occupants, occupant);
    }

    public void removeOccupant(DisasterVictim occupant) {
        occupants = removeElementFromArray(occupants, occupant);
    }

    // Methods for managing supplies
    public void addSupply(Supply supply) {
        supplies = addElementToArray(supplies, supply);
    }

    public void removeSupply(Supply supply) {
        supplies = removeElementFromArray(supplies, supply);
    }
}
