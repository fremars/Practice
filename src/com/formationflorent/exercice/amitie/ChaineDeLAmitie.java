package com.formationflorent.exercice.amitie;

public class ChaineDeLAmitie {
    public static void main(String... args) {

        Personne rene = new Personne();
        rene.nom = "René";
        Personne julien = new Personne();
        julien.nom = "Julien";
        Personne lisa = new Personne();
        lisa.nom = "Lisa";
        Personne lola = new Personne();
        lola.nom = "Lola";
        Personne cyrille = new Personne();
        cyrille.nom = "Cyrille";

        rene.voisin = julien;
        julien.voisin = lisa;
        lisa.voisin = lola;
        lola.voisin = cyrille;


        rene.sePresenter();


    }

}
