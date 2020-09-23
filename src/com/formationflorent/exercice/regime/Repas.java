package com.formationflorent.exercice.regime;

public class Repas {
    public static int compteurCalories=0;
    public static int nbRepas=0;
    public String nom;
    public int nbCaloriesGagnees;

    public void consommer() {
        Repas.compteurCalories+=nbCaloriesGagnees;
        Repas.nbRepas++;
    }


}
