package com.syntax.class21;

import sun.lwawt.macosx.CSystemTray;

public class MiguelClass extends ParentClass {
    int money;

    MiguelClass(int money) {
        super(money);
    }


   /* MiguelClass(){
        System.out.println("From child");
    }
    void marry(){
        super.marry();
        System.out.println(" I will marry jam");
    }*/

    void marry(){
        super.marry();
        System.out.println(" I will marry jam ok go marry her, her money is "+super.money);
    }

    public static void main(String[] args) {
        MiguelClass miguelClass = new MiguelClass(1000);
        miguelClass.marry();

    }
}
