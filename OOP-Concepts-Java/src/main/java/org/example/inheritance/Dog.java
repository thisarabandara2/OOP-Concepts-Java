package org.example.inheritance;

public class Dog extends Animal{

    private String name;

    Dog(String name) {
        super("Canine"); //calling parent constructor
        this.name = name;
    }
    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println(this.name + "says: woof!");

    }
}

