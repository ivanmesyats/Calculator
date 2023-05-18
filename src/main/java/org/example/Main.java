package org.example;

public class Main {
    public static void main(String[] args) {
        /* 2.реалізувати сімейство калькуляторів (Простий, Фінансовий, Бухгалтерський) Інженерний, Програмований)
         всі вони повинні вміти виконувати базові операції(+,-.*,/ ) плюс свої специфічні функції;*/

        new Calculator.CalculatorFin() = 10;

        Calculator.x = 10;
        Calculator.y = 0;

        System.out.println("Multiplication = " + Calculator.mult());
        System.out.println("Addition = " + Calculator.add());
        System.out.println("Subtraction = " + Calculator.sub());

        try {
            System.out.println("Division = " + Calculator.div());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        Calculator.y = 2;

        try {
            System.out.println("Division = " + Calculator.div());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


}

