package com.formationflorent.exercice.regime;

public class Activite {
    public String nom;
    public int nbCaloriesPerdues;
    public static int nbActivite=0;

    public void effectuer(){
        Repas.compteurCalories-=nbCaloriesPerdues;
        Activite.nbActivite++;
    }



}
