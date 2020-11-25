package com.syntax.ReplHw;

class Parent {

    Parent(String Child){

    }

    void hello(){

        System.out.println("method in Parent class");
    }
}

class child1 extends Parent{

    child1(String Child) {
        super(Child);
    }

    void hello() {
        System.out.println("method in Child1 class");
    }
}

class child2 extends Parent{

    child2(String Child) {
        super(Child);
    }

    void hello() {
        System.out.println("method in Child2 class");
    }
}

class child3 extends Parent{

    child3(String Child) {
        super(Child);
    }

    void hello() {
        System.out.println("method in Child3 class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent[] Children = {new child1("Child1"), new child2("Child2"), new child3("Child3")};

        for(Parent parent:Children){
            parent.hello();
        }
    }

}





