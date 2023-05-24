package org.example;
public class Calculator {

    static double a, b;

    public static double div (){

        if (a == 0) {
            throw new RuntimeException("Division by zero is not allowed");

        }
        return a / b;
    }

    public static double add (){
        return a + b;
    }

    public static double sub (){
        return a - b;
    }

    public static double mult (){
        return a * b;
    }

}
