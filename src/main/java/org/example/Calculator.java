package org.example;
public class Calculator {

     public double a, b;

    public double div (){

        if (b == 0) {
            throw new RuntimeException("Division by zero is not allowed");

        }
        return a / b;
    }

    public double add (){
        return a + b;
    }

    public double sub (){
        return a - b;
    }

    public double mult (){
        return a * b;
    }


}
