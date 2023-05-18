package org.example;
public class Calculator {

    static double x, y;

    public static double div (){

        if (y == 0) {
            throw new RuntimeException("Division by zero is not allowed");

        }
        return x / y;
    }

    public static double add (){
        return x + y;
    }

    public static double sub (){
        return x - y;
    }

    public static double mult (){
        return x * y;
    }

    public class CalculatorFin extends Calculator {

        public double newfunct;
    //    System.out.println ("bla bla bla");

    }
}
