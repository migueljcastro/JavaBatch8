package com.syntax.class22;

public class MethodOverloading {


    public void print(){
        System.out.println("print with no Arguments");
    }

    public void print(String name, int number){
        System.out.println("String name, int number");
        }


    public void print(int number, String name){
        System.out.println("int number, String name");
    }

    /*public static void print(int number, String name){
        System.out.println("int number, String name"); CE can not overload by making method as static
    }*/

    /*private void print(int number, String name){
        System.out.println("int number, String name"); CE by changing the access modifier we cannot overload methods
    }*/


    /*public String print(int number, String name){
        System.out.println("int number, String name"); CE by changing the return type we cannot overload methods
        return "name";
    }*/

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.print();
        methodOverloading.print("name", 123);
        methodOverloading.print(123, "name");
    }
}
