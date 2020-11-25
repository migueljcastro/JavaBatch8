package com.syntax.class22;

import com.syntax.class06.Task;

public class Task3 {
    /*
        3. Create 1 class with a private method that has 3 overloaded forms.
        Then call each overloaded method with specific arguments and observe result.
     */
    private void print(){
        System.out.println("I am a private method, I can be overloaded and have no parameters");
    }

    private void print(int var){
        System.out.println("I am a private method, I can be overloaded and I have one int parameters");
    }

    private void print(String var){
        System.out.println("I am a private method, I can be overloaded and i have one String parameters");
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.print();
        task3.print(10);
        task3.print("Name");

    }
}
