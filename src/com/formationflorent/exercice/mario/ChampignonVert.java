package com.formationflorent.exercice.mario;

public class ChampignonVert {
    static int nbChampignonVert;
    String couleur;
    Boolean estAttrape;

    ChampignonVert() {
        this.couleur = "Vert";
        estAttrape = false;
        if (ChampignonVert.nbChampignonVert < 1) {
            ChampignonVert.nbChampignonVert++;
        } else {
            System.out.println("Impossible d'avoir plus de 1 champignons verts.");
        }
    }

}
