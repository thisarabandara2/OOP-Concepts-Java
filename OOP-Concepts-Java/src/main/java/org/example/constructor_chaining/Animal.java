package org.example.constructor_chaining;

import java.sql.SQLOutput;

class Animal {
    Animal(){
        System.out.println("Animal (Parent) Class Constructor");
    }
}

class Dog extends Animal {

    Dog () {
        super();
        System.out.println("Dog (child) class constructor");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();

    }
}
