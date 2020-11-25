package com.syntax.class25;

import javax.jws.soap.SOAPBinding;

public class FinalMethodChildClass extends FinalMethodClass{

    double PI=4.5;
    @Override
    double add(double num1, double num2) {

        // super.PI=4.5; CE cannot change a final field
        //Math.PI;

        super.printName();

        double add = super.add(num1, num2);
        System.out.println("Results "+add);
        return add;


       //return super.add(num1, num2);
        //or return num1+num2; if you want to override in this class

    }

    /*final public void printName(){ will not work because it is declared as final in parent class
        System.out.println("Hello world");
    }*/
}
