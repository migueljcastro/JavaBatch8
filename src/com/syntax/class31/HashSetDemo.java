package com.syntax.class31;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hashSet=new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Apple");
        hashSet.add("strawberry");
        hashSet.add("avacado");
        hashSet.add("olives");

        System.out.println(hashSet);
    }
}
