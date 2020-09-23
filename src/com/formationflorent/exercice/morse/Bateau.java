package com.formationflorent.exercice.morse;

public class Bateau {
    String nom;

    public static String lettreVersMorse(char lettre){
        String messageMorse=null;
        switch (lettre){
            case 'S':
                messageMorse="... ";
                break;
            case 'O':
                messageMorse="--- ";
                break;
            default:
                messageMorse=" ";
                break;

        }

        return messageMorse;

     }

    public static char morseVersLettre(String morse){
        char messageLettre=' ';
        switch (morse){
            case "...":
                messageLettre='S';
                break;
            case "---":
                messageLettre='O';
                break;
            default:
                messageLettre=' ';
                break;

        }

        return messageLettre;

    }


}
