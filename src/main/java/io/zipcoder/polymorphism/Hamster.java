package io.zipcoder.polymorphism;

public class Hamster extends Pet{

    public Hamster(String name) {
        super(name);
    }

    public String speak(){
        return "Squeak!";
    }

}
