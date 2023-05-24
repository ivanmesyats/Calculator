package org.example;

public class CalculatorAcc extends Calculator{

    public double socialInsurance () {

        return a * 0.006;

    }

    public double incomeTax () {

        return a * 0.015;

    }

    public double vat () {

        return a / (1+0.2) * 0.2;

    }

}
