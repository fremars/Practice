package com.formationflorent.exercice.epicerie;

import java.text.DecimalFormat;

public class FaireLesCourses {
    public static void main(String[] args) {

        Epicerie spar=new Epicerie("SPAR");
        ProduitAlimentaire saucisses = new ProduitAlimentaire(15);
        ProduitAlimentaire merguez = new ProduitAlimentaire(30, 5);
        Platprepare pizza = new Platprepare(15);
        Platprepare boeufBourguignon = new Platprepare(50, 10);
        ProduitAlimentaire sel = new ProduitAlimentaire();
        Platprepare piemontaise = new Platprepare();

        if (spar.chiffreAffaires>=100){
            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println("Le chiffre d'affaires est de "+df.format(spar.chiffreAffaires)+" €.");
        }else {
            System.out.println("Le CA n'est pas assez elevé pour que l'épicerie soit rentable, continuez les ventes !");
        }

    }
}
