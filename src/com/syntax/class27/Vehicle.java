package com.syntax.class27;

abstract public class Vehicle {

    String color;//instance variable
    static int totalVehicle;
    /*Vehicle(){
        totalVehicle++; //static field
        System.out.println("I will be called when ever an object using of my child"+
                " class will be created using no argument constructor");
    }*/

    Vehicle(String color){
        totalVehicle++;
        this.color=color; //initializing instance variable
        System.out.println("I will be called when ever an object using of my child"+
                " class will be created using no argument constructor");
    }

    public void drive(){
        System.out.println("Vehicle drives");//complete method
    }

    public void stop(){
        System.out.println("Vehicle stops");
    }
    public abstract void start();//abstract methods
    public abstract void brake();

    public static final void print1(){
        System.out.println("Just a static  method");
    }
    public static final void print2(){
        System.out.println("Just a final method");
    }
}
//can only have one public class in a file
abstract class Car extends Vehicle{
    String carType;
    Car(String color, String carType){
        super(color);
     this.carType=carType;


    }

    @Override
    public void brake() {
        System.out.println(carType+" has brakes ");
    }
}

class Tesla extends Car{

    String make;
    Tesla(String color, String carType, String make) {
        super(color, carType);
        this.make=make;
    }

    @Override
    public void start() {
        System.out.println(make+"Can start remotely");
    }

    @Override
    public void drive() {
        System.out.println(" Can drive on autopilot");
    }

    public void display(){
        System.out.println("Color of car "+color+" Car Type "+carType+" make "+make);
    }
}

class Toyota extends Car{
    String make;
    Toyota(String color, String carType, String make) {//you need a constructor to initialize field
        super(color, carType);
        this.make=make;
    }

    @Override
    public void start() {
        System.out.println(make+" can start without keys");
    }
}
