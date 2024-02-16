/*
Copyright Ann Barcomb and Khawla Shnaikat, 2024
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class LocationTest {
    private Location location;
    private DisasterVictim victim;
    private Supply supply;

    // Generic method to add an element to an array
    public static <T> T[] addElementToArray(T[] array, T element) {
        T[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[array.length] = element;
        return newArray;
    }

    // Additional methods to test arrays instead of lists
    public static <T> boolean arrayContainsAll(T[] array1, T[] array2) {
        return Arrays.asList(array1).containsAll(Arrays.asList(array2));
    }

    public static <T> boolean arrayContainsElement(T[] array, T element) {
        for (T item : array) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Before
    public void setUp() {
        // Initializing test objects before each test method
        location = new Location("Shelter A", "1234 Shelter Ave");
        victim = new DisasterVictim("John Doe", "2024-01-01");
        supply = new Supply("Water Bottle", 10);
    }

    // Helper method to check if a supply is in the list (Modified for arrays)
    private boolean containsSupply(Supply[] supplies, Supply supplyToCheck) {
        return arrayContainsElement(supplies, supplyToCheck);
    }

    @Test
    public void testConstructor() {
        assertNotNull("Constructor should create a non-null Location object", location);
        assertEquals("Constructor should set the name correctly", "Shelter A", location.getName());
        assertEquals("Constructor should set the address correctly", "1234 Shelter Ave", location.getAddress());
    }

    @Test
    public void testSetName() {
        String newName = "Shelter B";
        location.setName(newName);
        assertEquals("setName should update the name of the location", newName, location.getName());
    }

    @Test
    public void testSetAddress() {
        String newAddress = "4321 Shelter Blvd";
        location.setAddress(newAddress);
        assertEquals("setAddress should update the address of the location", newAddress, location.getAddress());
    }

    @Test
    public void testAddOccupant() {
        // Modified to test array instead of list
        location.addOccupant(victim);
        assertTrue("addOccupant should add a disaster victim to the occupants list", arrayContainsElement(location.getOccupants(), victim));
    }

    @Test
    public void testRemoveOccupant() {
        // Modified to test array instead of list
        location.addOccupant(victim); // Ensure the victim is added first
        location.removeOccupant(victim);
        assertFalse("removeOccupant should remove the disaster victim from the occupants list", arrayContainsElement(location.getOccupants(), victim));
    }

    @Test
    public void testSetAndGetOccupants() {
        DisasterVictim[] newOccupants = {};
        newOccupants = addElementToArray(newOccupants, victim);
        location.setOccupants(newOccupants);
        assertTrue("setOccupants should replace the occupants list with the new list", arrayContainsAll(location.getOccupants(), newOccupants));
    }

    @Test
    public void testAddSupply() {
        location.addSupply(supply);
        assertTrue("addSupply should add a supply to the supplies list", containsSupply(location.getSupplies(), supply));
    }

    @Test
    public void testRemoveSupply() {
        location.addSupply(supply); // Ensure the supply is added first
        location.removeSupply(supply);
        assertFalse("removeSupply should remove the supply from the supplies list", containsSupply(location.getSupplies(), supply));
    }

    @Test
    public void testSetAndGetSupplies() {
        Supply[] newSupplies = {};
        newSupplies = addElementToArray(newSupplies, supply);
        location.setSupplies(newSupplies);
        assertTrue("setSupplies should replace the supplies list with the new list", containsSupply(location.getSupplies(), supply));
    }
}
