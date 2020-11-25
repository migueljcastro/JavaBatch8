package com.syntax.class15;

import java.util.logging.SocketHandler;

public class ReplaceAll {
    public static void main(String[] args) {

        String mix="3213Hello 89 World354545 *&***^&*^&*";

        System.out.println(mix.replaceAll("[0-9]", ""));

        System.out.println(mix.replaceAll("a-z", ""));

        System.out.println(mix.replaceAll("[a-z A-Z]", ""));

        System.out.println(mix.replaceAll("[^A-Za-z0-9]", ""));

        System.out.println(mix.replaceAll("\\s+", ""));

        // ^ this means replace all except whats in my box so.. [^AEIOUaeiou]
        //so i am replacing everything except upper and lower case "AEIOU"
    }
}
