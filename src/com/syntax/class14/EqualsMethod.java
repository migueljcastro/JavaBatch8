package com.syntax.class14;

public class EqualsMethod {
    public static void main(String[] args) {
        String name= new String ("Sabeen");
        String name2= new String ("Sabeen");
        String name3="Eduard";

        System.out.println(name.equals(name2));// recommended for strings
        System.out.println(name2.equals(name3));
        System.out.println(name.equals(name3));

        System.out.println(name == name2);// not really recommended for strings
        System.out.println(name2 == name3);
        System.out.println(name == name3);

        name = new String( "Sabeen");
        name2 = new String( "Sabeen");
        name3 = new String( "Eduard");

        System.out.println(name.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name.equals(name3));

        System.out.println(name == name2);
        System.out.println(name2 == name3);
        System.out.println(name == name3);
    }
}
