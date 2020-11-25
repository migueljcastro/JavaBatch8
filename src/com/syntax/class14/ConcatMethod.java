package com.syntax.class14;

public class ConcatMethod {
    public static void main(String[] args){
        String firstName="Miguel";
        String lastName=" Castro";
        String name="Juan Alvial";
        String name2=null;
        System.out.println(firstName+lastName+name2);
        String completeName=firstName.concat(name2);
        System.out.println(completeName);

    }
}
