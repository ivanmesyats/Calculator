package org.example;
public class Calculator {

    static double x, y;

    public static double div (){
        double result;

        if (y == 0) {
            throw new RuntimeException("Division by zero is not allowed");
            //System.out.println("divding on 0 is forbiden");

        }
        result = x / y;

        return result;
    }

    public static double add (){
        double result;
        result = x + y;
        return result;
    }

    public static double sub (){
        double result;
        result = x - y;

        return result;
    }

    public static double mult (){
        double result;
        result = x * y;

        return result;
    }

}
