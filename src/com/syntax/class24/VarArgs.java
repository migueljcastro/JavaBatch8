package com.syntax.class24;

public class VarArgs {

    void print(int ...a){
        for (int numberInArray:a){
            System.out.println(numberInArray);
        }
    }

    public static void main(String[] args) {
        VarArgs varArgs = new VarArgs();
        varArgs.print(1);
        varArgs.print(1,2);
        varArgs.print(1,50,98);
    }
}
