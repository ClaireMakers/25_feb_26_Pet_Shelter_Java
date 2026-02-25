package org.example;

public class Cat implements Pet {
    public String name;
    private static Integer count;

    public Cat(String name) {
        //This count is going to be shared across all the cats
        count++;
        //This name is going to be specific to one cat instance
        this.name = name;
    }

    public static Integer getCatsCount() {
     //Will not have access to any of the instance values because belongs to class
        return count;
    }

    public void makeNoise() {
        System.out.println("meow!");
    }
}

//A static method or value can be used without creating an instance of a class
//Static = belongs to the class rather than the instance