package com.syntax.class22;

public class Main {
    public void sub(int a, int b, int c, int d){
        System.out.println(a-b-c-d);

    }

    public void sub(int a, int b, int c){
        System.out.println(a-b-c);

    }
    public void sub(int a, int b){
        System.out.println(a-b);

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.sub(100, 30, 20, 10);
        main.sub(50, 10, 10);
        main.sub(60, 40);
    }


}


