package org.example.polymorphism.OverridingExample;

public class Animal {

    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dogs are barking");
    }
}

class Cat extends Animal {
    @Override
    void sound(){
        System.out.println("Cats are meow");
    }
}

class TestOverriding {

    public static void main(String[] args) {
        Animal cat1 = new Cat(); //Upcasting
        Animal dog1 = new Dog();

        cat1.sound();
        dog1.sound();
    }
}
