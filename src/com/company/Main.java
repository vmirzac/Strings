package com.company;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("My String is equal to : " + myString);
        myString = myString + " and this is more";
        System.out.println(myString);

        String numberString = "259.55";
        numberString = numberString+ "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString+myInt;
        System.out.println("Last String is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString+doubleNumber;
        System.out.println("Last String value " + lastString);
    }
}
