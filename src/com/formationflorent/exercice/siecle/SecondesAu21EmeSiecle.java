package com.formationflorent.exercice.siecle;

public class SecondesAu21EmeSiecle {

    public static void main(String... args) {

        TempsPasse tempsPasse = new TempsPasse();

        for(int annee=2000;annee<2018;annee++){
            tempsPasse.ajouterannee(annee);
        }

        for(int mois=1; mois<4; mois++){
            tempsPasse.ajoutermois(mois,false);
        }

        tempsPasse.ajouterheures(14);
        tempsPasse.ajouterminutes(28);
        tempsPasse.ajoutersecondes(32);

        System.out.println(tempsPasse.nombreDeSecondes);



    }
}