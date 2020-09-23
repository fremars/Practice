package com.formationflorent.exercice.terredumilieu;

public class Combattant {
    String type;
    int niveauDeVie;
    Arme arme;

    void saisirArme(Arme armeSaisie){
        arme=armeSaisie;
    }

    void attaquer(Combattant ennemi){
        if (arme==null){
            System.out.println("Attaque impossible, vous devez saisir une arme !");
        }else{
            ennemi.niveauDeVie-= arme.degat;
            if (ennemi.niveauDeVie<=0){
                System.out.println(type+" a vaincu le combattant "+ennemi.type);
            }else {
                System.out.println("Niveau de vie restant de "+ennemi.type+" : "+ennemi.niveauDeVie);
            }
        }
    }

    void soigner(Combattant allie){
        allie.niveauDeVie+=10;
    }
}
