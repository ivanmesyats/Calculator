package org.example;

public class CalculatorProg extends Calculator {
    int a,b,c,d;

    public String BinaryAdd () {
        c = a + b;
        String prog = Integer.toBinaryString(c);
        return prog;
    }
    public String OctalAdd () {
        c = a + b;
        String prog = Integer.toOctalString(c);
        return prog;
    }
    public String HexAdd () {
        c = a + b;
        String prog = Integer.toHexString(c);
        return prog;
    }

    public String LeftShift () {
        return null;
    }



}
