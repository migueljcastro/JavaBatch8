package com.syntax.class26;

abstract public class Phone {
    public void makeCalls(){
        System.out.println("Phone makes call");
    }
    public void sendText(){
        System.out.println("phone sends text");
    }

    public abstract void viewPicture();
    public abstract void unlock();

}
abstract class Iphone extends Phone {

    @Override
    public void viewPicture() {
        System.out.println("we can check our photos using the Photo app");
    }
}

class IphoneChild extends Iphone{

    @Override
    public void unlock() {

    }
}

class Samsung extends Phone{

    @Override
    public void viewPicture() {
        System.out.println("to view pics use Gallery app");
    }

    @Override
    public void unlock() {
        System.out.println("Unlock using password");
    }
}
