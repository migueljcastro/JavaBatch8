package com.syntax.class27;

public class PhoneTester {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.call();
        iphone.takePicture();
        iphone.text();
        iphone.playMusic();

        Phone samsung = new Samsung();
        samsung.call();
        samsung.takePicture();
        samsung.text();
        samsung.playMusic();

        //same output

        Phone[] allPhones = {new Iphone(), new Samsung()};
        for (Phone phone:allPhones){
            phone.call();
            phone.takePicture();
            phone.text();
            phone.takePicture();
        }
    }


}
