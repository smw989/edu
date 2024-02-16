package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Location {
    private String name;
    private String address;
    private ArrayList<DisasterVictim> occupants = new ArrayList<>();
    private ArrayList<Supply> supplies = new ArrayList<>();

    public Location(String name, String address) {
        setName(name); // Apply validation if needed
        setAddress(address); // Apply validation if needed
    }

    // Name getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name;
    }

    // Address getter and setter
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("Address cannot be null or empty.");
        }
        this.address = address;
    }

    // Occupants management
    public void addOccupant(DisasterVictim occupant) {
        if (occupant == null) {
            throw new IllegalArgumentException("Occupant cannot be null.");
        }
        this.occupants.add(occupant);
    }

    public boolean removeOccupant(DisasterVictim occupant) {
        if (occupant == null) {
            throw new IllegalArgumentException("Occupant to remove cannot be null.");
        }
        return this.occupants.remove(occupant);
    }

    public void setOccupants(List<DisasterVictim> occupants) {
        if (occupants == null) {
            throw new IllegalArgumentException("Occupants list cannot be null.");
        }
        // Ensures deep copy if needed, or directly assign after validation
        this.occupants = new ArrayList<>(occupants);
    }

    public List<DisasterVictim> getOccupants() {
    return Collections.unmodifiableList(this.occupants);
    }

    // Supplies management
    public void addSupply(Supply supply) {
        if (supply == null) {
            throw new IllegalArgumentException("Supply cannot be null.");
        }
        this.supplies.add(supply);
    }

    public boolean removeSupply(Supply supply) {
        if (supply == null) {
            throw new IllegalArgumentException("Supply to remove cannot be null.");
        }
        return this.supplies.remove(supply);
    }

    public ArrayList<Supply> getSupplies() {
        return new ArrayList<>(this.supplies);
    }

    public void setSupplies(List<Supply> supplies) {
        if (supplies == null) {
            throw new IllegalArgumentException("Supplies list cannot be null.");
        }
        this.supplies = new ArrayList<>(supplies);
    }
}
