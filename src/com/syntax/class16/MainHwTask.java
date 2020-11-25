package com.syntax.class16;

public class MainHwTask {
    public static void main(String[] args) {
        HwTask hwtask=new HwTask();
        hwtask.createEmail("Miguel", "Castro", "Gmail");
        System.out.println();

        HwTask2 hwTask2=new HwTask2();
        boolean prime = hwTask2.isPrime(25);
        boolean prime1 = hwTask2.isPrime(1);
        boolean prime2 = hwTask2.isPrime(10);
    }
}
