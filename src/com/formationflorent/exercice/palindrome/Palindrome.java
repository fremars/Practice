package com.formationflorent.exercice.palindrome;

public class Palindrome {
    public static void main(String... args) {
        String original = "saucisse";
        String inverse = new StringBuilder(original).reverse().toString();

        if (original.equals(inverse)) {
            System.out.println("C'est un palindrome.");
        } else {
            System.out.println("Ce n'est pas un palindrome.");
        }

        original = "essayasse";
        inverse = new StringBuilder(original).reverse().toString();

        if (original.equals(inverse)) {
            System.out.println("C'est un palindrome.");
        } else {
            System.out.println("Ce n'est pas un palindrome.");
        }


    }
}
