package com.formationflorent.exercice.fomo;

public class Fomo {

    public static void main(String... args) {

        Message appelTelephone = new Message();
        Message appelSkype = new Message();
        Message messageSkype = new Message();

        System.out.println(appelTelephone.contactVoix("0606545411"));
        System.out.println(appelSkype.contactVoix("Skype", "jpejnesis"));
        System.out.println(appelSkype.contactTexte("Skype", "jpenesis"));
        System.out.println(appelSkype.contactTexte("florent@hotmail.fr"));



    }

}
