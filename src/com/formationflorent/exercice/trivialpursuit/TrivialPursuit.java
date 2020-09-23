package com.formationflorent.exercice.trivialpursuit;

import java.lang.reflect.Field;

public class TrivialPursuit {
    PlateauDeJeu plateauDeJeu;
    De de;
    Pion pionJaune;
    Pion pionVert;
    Pion pionOrange;
    Pion pionBleu;
    Pion pionMarron;
    Pion pionRose;
    Carte carte;

    //Définir les attributs du jeu
    void afficheObjetEnAttribut(){
        System.out.println("Voici les objets en tant qu'attribut dans le Trivial Pursuit : ");
        for (Field field : this.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            String name = field.getType().getName();
            System.out.println(name);
        }

        System.out.println("");
    }



}
