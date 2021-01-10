package com.syntax.class30;

import java.util.Arrays;

public class Collection {
    public static void main(String[] args) {
        String name = "Ali";
        String name1 = "Nabin";
        String name2 = "Qasim";
        //variables can hold one value at the time if we need to store 1000 values we need to
        //declare 1000 variables
        int initialSize = 3;
        //int elementStored = 0;
        String[] names = new String[initialSize]; //3

        names[0] = "Ali";
        //elementStored++;
       // System.out.println(names.length);
        names[1] = "Nabin";
       // elementStored++;
       // System.out.println(names.length);
        names[2] = "Qasim";
        //elementStored++;
        //if(names.length >= elementStored){

       // System.out.println(names.length);
        //names[3] = "Davit"; Array index out of bounds as the size of the array was 3
        //we can not store more than 3 elements

        //Arrays are in fixed in size we have to provide the size of the array in advance before
        //we can use it
        System.out.println(Arrays.toString(names));


        //if(names.length>=initialSize){



        }
        //public static String[] expandArray(String [] oldArray){
           // String[] temp = new String[initialSize * 2];
            //for (int i = 0; i < oldArray.length; i++)
            //newArray[0] = oldArray[0];
           // newArray[1] = oldArray[1];
           // newArray[2] = oldArray[2];
           // newArray[3] = "Danilo";

           // return newArray;
        }

   // }
//}
