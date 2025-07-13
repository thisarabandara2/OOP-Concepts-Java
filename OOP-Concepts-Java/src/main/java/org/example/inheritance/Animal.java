package org.example.inheritance;

//Parent class
 class Animal {
     final String species;

    //Constructor
    Animal(String species) {
        this.species = species;
    }

    //Method to be overridden
    public void makeSound(){
        System.out.println("Some generic animal Sound");
    }

    //Final method (Cannot be overridden)
    public final void sleep() {
        System.out.println("Animal is sleeping");

    }

}
