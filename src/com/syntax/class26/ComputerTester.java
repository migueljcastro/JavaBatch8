package com.syntax.class26;
public class ComputerTester {
    public static void main(String[] args) {
        Computer[] allComputersInSingleVar={new Apple("Apple"),
                new Lenovo("Lenovo"), new HP("Brand")}; //by making this array I do not need to make code for these three
        //because of polymorphism

        for (Computer computer:allComputersInSingleVar){
            computer.run();
            computer.storage();
            computer.transfer();
        }
        Lenovo lenovo =new Lenovo("Lenovo");
        lenovo.tabletMode();//If I didn't create these for all 3 classes
    }

}
