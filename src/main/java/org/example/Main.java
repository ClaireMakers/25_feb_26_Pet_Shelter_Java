package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PetShelter manchesterShelter = new PetShelter();

        Cat poppy = new Cat("Poppy");
        Dog rex = new Dog();

        manchesterShelter.welcomePetToShelter(poppy);
        manchesterShelter.welcomePetToShelter(rex);
        ArrayList<Pet> petList = manchesterShelter.readPets();
        petList.add(poppy);

        System.out.println(manchesterShelter.readPets());
        System.out.println(Cat.getCatsCount());
    }
}