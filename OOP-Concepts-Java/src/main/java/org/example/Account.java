package org.example;

public class Account {

    int a , b;

    public void setData(int a , int b ){
        this.a = a;
        this.b = b;
    }

    public void showData(){
        System.out.println("Value a : " + a);
        System.out.println("Value b : " + b);
    }

    public static void main(String[] args) {
        Account myaccount = new Account();
        myaccount.setData(20,30);
        myaccount.showData();

    }
}
