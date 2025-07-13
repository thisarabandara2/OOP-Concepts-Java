package org.example.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.makeSound();
        myDog.sleep(); // call Final method for animal class
    }
}
