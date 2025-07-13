package org.example.constructor_chaining;

// Same class "this()"
public class Person {

    String name;
    int age;

    public Person(){
        this("Unknown", 0);
        System.out.println("Default Constructor");
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor");

    }

    void display(){
        System.out.println("Name is - " + name);
        System.out.println("Age is - " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.display();
    }
}
