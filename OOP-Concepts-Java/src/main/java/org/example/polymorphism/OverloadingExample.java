package org.example.polymorphism;

public class OverloadingExample {

    //Method 1 :  One int Parameter
    void display(int a ){
        System.out.println("Method with one int parameter : " + a);
    }

    //Method 2 : Two int parameter (Different number of arguments)
    void display(int a , int b){
        System.out.println("Method with two int parameter :" + a + "," + b);

    }

    //Method 3 : One double parameter (Different data types)
    void display(double a){
        System.out.println("Method with one double parameter :" + a);
    }

    //Method 4 : int and double (Difference sequence)
    void display(int a , double b){
        System.out.println("Method with int and double parameter :" + a + "," + b);
    }

    //Method 5 : double and int (Different sequence)
    void display(double b, int a ){
        System.out.println("Method with int and double parameter :" + b + "," + a);
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();

        obj.display(5);
        obj.display(5 , 10);
        obj.display(5.5);
        obj.display(5, 7.5);
        obj.display(7.5, 5);
    }
}


