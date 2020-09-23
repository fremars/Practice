package com.formationflorent.exercice.mario;

public class Etoile {
    static int nbEtoile;
    String couleur;
    Boolean estAttrape;

    Etoile() {
        this.couleur = "Jaune";
        this.estAttrape = false;

        if (Etoile.nbEtoile <= 2) {
            Etoile.nbEtoile++;
        } else {
            System.out.println("Impossible d'avoir plus de 2 étoiles.");
        }
    }
}
