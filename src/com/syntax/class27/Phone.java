package com.syntax.class27;

public abstract class Phone {

    public void call(){
        System.out.println("Phone can make calls");
    }

    public void text(){
        System.out.println("Phone can send text");
    }

    public abstract void takePicture();
    public abstract void playMusic();

}
class Iphone extends Phone{

    @Override
    public void takePicture() {
        System.out.println(" Can take good pictures in low light");
    }

    @Override
    public void playMusic() {
        System.out.println("Iphone can play music using Apple Music app");
    }
    public void faceTime(){
        System.out.println("I have facetime for video calls");
    }
}

class Samsung extends Phone{

    @Override
    public void takePicture() {
        System.out.println("Can take pictures using telephoto");
    }

    @Override
    public void playMusic() {
        System.out.println("Can play music using Google music");
    }
    public void Duo(){
        System.out.println("I can make video calls using Duo");
    }
}