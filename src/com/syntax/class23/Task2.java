package com.syntax.class23;

public class Task2 {
    /*
        2. Create a class CreditCard and define variable balance and interest.
        Create an instance method that will calculate interest based on the given balance.
        Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
        Call the method by creating an object of each of the three classes.
     */
}
class creditCard{
    double balance;
    double interest;
    public creditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }
    double getInterest(){

        return balance * interest;
    }
    public static void print(){
        System.out.println("I am a static in creditCard method I belong to class and I don't need an object to be called");
    }
}
class Visa extends creditCard{
    public Visa(double balance, double interest) {

        super(balance, interest);
    }
    double getInterest() {

        return balance * interest*3;
    }
    public static void print(){
        System.out.println("I am overridden method in child class");
    }
}
class AmericanExpress extends creditCard {
    public AmericanExpress(double balance, double interest) {

        super(balance, interest);
    }
    double getInterest() {

        return balance * interest*2;
    }
}
class CreditCardTester {
    public static void main(String[] args) {
        Visa visa = new Visa(1000,0.29);
        System.out.println(visa.getInterest());
        AmericanExpress americanExpress = new AmericanExpress(1000, 0.24);
        System.out.println(americanExpress.getInterest());
        visa.print();
    }
}

