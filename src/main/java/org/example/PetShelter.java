package org.example;

import java.util.ArrayList;

public class PetShelter {
    /*ArrayList needs to take one data type - here Pets lets us add both cats and dogs to the pets list*/
    private ArrayList<Pet> pets;

    public PetShelter() {
        pets = new ArrayList<>();
    }

    public void welcomePetToShelter(Pet pet) {
        this.pets.add(pet);
    }

    public ArrayList<Pet> readPets () {
        ArrayList<Pet> currentPets = new ArrayList(this.pets);
        return currentPets;
    }
}
