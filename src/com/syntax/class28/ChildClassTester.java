package com.syntax.class28;

public class ChildClassTester {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.printInfo();

        //MyInterface.name="something"; fields can't be reassigned as they are always final
        MyInterface myInterface = new ChildClass();
        myInterface.printInfo();
    }
}
