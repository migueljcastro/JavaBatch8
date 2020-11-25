package com.syntax.class19;

import com.syntax.class18.Employee;

public class Employees {

    //constructors.print();
    //constructors.character='A';
    //Constructors
    // constructors <-- name of the variable
    // = <-- assignment
    // new <-- we want an object
    // Constructors() <-- constructor initializing our fields

    int age;
    String name;
    char grade;

    Employees(){
        System.out.println("I will be called everytime you create an object of this class");
    }

    Employees(int ageValue, String nameValue, char characterValue){
        System.out.println("I am not a useless constructor I am initialing your fields");

        if(ageValue > 60 || ageValue < 18){
            System.out.println("You should not be working please retire or wait to be 18 years old");
        }else {
            age = ageValue;
            name = nameValue;
            grade = characterValue;
        }
    }
    void print(){

        System.out.println("Number "+age+" name "+name+" character "+ grade);
    }
}



