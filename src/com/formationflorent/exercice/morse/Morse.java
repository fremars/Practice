package com.formationflorent.exercice.morse;

public class Morse {
    public static void main(String[] args) {

        Bateau bateau1 = new Bateau();
        bateau1.nom= "Titanic";
        System.out.println("Message de détresse : "+bateau1.lettreVersMorse('S')+bateau1.lettreVersMorse('O')+bateau1.lettreVersMorse('S'));
        System.out.println("signifie : "+bateau1.morseVersLettre("...")+bateau1.morseVersLettre("---")+bateau1.morseVersLettre("..."));



    }
}
