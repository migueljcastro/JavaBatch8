package com.syntax.class24;

public class DogTester {

    public static void main(String[] args) {
        //all 4 methods can be accessed from dog because
        //type of box and type of object are same no extra cost
        Dog dog = new Dog();
        dog.appearance();
        dog.bark();
        dog.eat();
        dog.sleep();
        /*
            type of box and type of object are not the same so we must
            pay price if we are trying to store a parent in a child
            we will get an error or if we try to store a child in a parent
            we will not be able to access all of the additional methods from
            from our child class this is the cost.
         */
        dog = new Chow();
        dog.appearance();
        //dog=new Dog(); if we uncomment this we will get an error
        //if we try this Chow chow = (Chow) dog;
        dog.sleep();

        /*
            we can extract the contents of the box/variable/container and
            we store these contents in the new box but we must follow all
            of the above rules.
         */

        Chow chow= (Chow) dog;
        chow.special();
        chow.hunt();

    }
}
