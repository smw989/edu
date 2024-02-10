package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private String name;
    private String address;
    private List<DisasterVictim> occupants;
    private List<Supply> supplies;

    // Constructor
    public Location(String name, String address) {
        this.name = name;
        this.address = address;
        this.occupants = new ArrayList<>();
        this.supplies = new ArrayList<>();
    }

    // Getters and Setters for name and address
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Methods for managing occupants
    public void addOccupant(DisasterVictim occupant) {
        this.occupants.add(occupant);
    }

    public boolean removeOccupant(DisasterVictim occupant) {
        return this.occupants.remove(occupant);
    }

   public void setOccupants(List<DisasterVictim> occupants) {
        this.occupants = occupants;
    }
    public List<DisasterVictim> getOccupants() {
        return new ArrayList<>(occupants); // Return a copy to prevent external modifications
    }

    // Methods for managing supplies
    public void addSupply(Supply supply) {
        this.supplies.add(supply);
    }

    public boolean removeSupply(Supply supply) {
        return this.supplies.remove(supply);
    }

    public List<Supply> getSupplies() {
        return new ArrayList<>(supplies); // Return a copy to prevent external modifications
    }

public void setSupplies(List<Supply> supplies) {
        this.supplies = supplies;
    }
}
