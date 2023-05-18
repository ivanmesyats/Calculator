package org.example;
public class Main {
    public static void main(String[] args) {
        /* 2.реалізувати сімейство калькуляторів (Простий, Фінансовий, Бухгалтерський) Інженерний, Програмований)
         всі вони повинні вміти виконувати базові операції(+,-.*,/ ) плюс свої специфічні функції;*/

//finnacial

        CalculatorFin fin  = new CalculatorFin();

        fin.b = 10;
        fin.a = 250;
        System.out.println("% " + fin.percent());
        System.out.println("Simple percentage of sales = " + fin.percentFromSales());

        //accounter

        CalculatorAcc acc = new CalculatorAcc();

        // a is a Tax base
        acc.a = 260;

        System.out.println("ЗбірДоФССВБ = " + acc.socialInsurance() + " %");

//Enginering

        CalculatorEng eng  = new CalculatorEng();
        eng.a = 1;
        System.out.printf("Exp = %4.2f%n", eng.GetExp());
        System.out.printf("Sin = %4.2f%n", eng.Sin());
        System.out.printf("Cos = %4.2f%n", eng.Cos());

//Programable

        CalculatorProg prog  = new CalculatorProg();
        prog.d = 0;
        prog.a = 2;
        prog.b = 1;

        System.out.println("BinaryAdd = " + prog.BinaryAdd());
        System.out.println( "OctalAdd = " + prog.OctalAdd());



    }


}

