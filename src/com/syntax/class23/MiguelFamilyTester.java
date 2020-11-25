package com.syntax.class23;

import com.syntax.class21.Father;

public class MiguelFamilyTester {
    public static void main(String[] args) {

        MiguelParents miguelParents = new MiguelParents();

        Miguel miguel = new Miguel();
        Frankie frankie = new Frankie();
        frankie.run();
        Simon simon = new Simon();

        MiguelParents[] familyArray = new MiguelParents[3]; //This is polymorphism
        familyArray[0] = new Miguel();
        familyArray[1] = new Frankie();
        familyArray[2] = new Simon();

        //traditional approach
        print(miguel, frankie, simon);

        System.out.println("-------------------------------------------------------------------------");
        //advanced polymorphism approach
        print(familyArray);


    }

    public static void print(Miguel miguel, Frankie frankie, Simon simon) {
        miguel.eat();
        miguel.sleep();

        frankie.eat();
        frankie.sleep();

        simon.eat();
        simon.sleep();
    }


    public static void print(MiguelParents[] miguelParents) {
        for (MiguelParents mp : miguelParents) {
            mp.eat();
            mp.sleep();

        }
    }
}
