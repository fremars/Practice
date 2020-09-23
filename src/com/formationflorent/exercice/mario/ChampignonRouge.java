package com.formationflorent.exercice.mario;

public class ChampignonRouge {
    static int nbChampignonRouge;
    String couleur;
    Boolean estAttrape;

    ChampignonRouge() {
        this.couleur = "Rouge";
        this.estAttrape = false;

        if (ChampignonRouge.nbChampignonRouge <= 2) {
            ChampignonRouge.nbChampignonRouge++;
        } else {
            System.out.println("Impossible d'avoir plus de 2 champignons rouges.");
        }
    }

}
