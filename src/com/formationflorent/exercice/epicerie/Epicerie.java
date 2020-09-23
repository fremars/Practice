package com.formationflorent.exercice.epicerie;

public class Epicerie {
    static double chiffreAffaires;
    String nom;

    Epicerie() {

    }

    Epicerie(String nom) {
        this.nom = nom;
        Epicerie.chiffreAffaires=0.0d;
    }


}
