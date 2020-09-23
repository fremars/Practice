package com.formationflorent.exercice.fairesescomptes;

public class FaireSesComptes {

    public static void main(String[] args) {

        Compte compteCourant = new Compte();
        compteCourant.solde=253.50f;
        compteCourant.type='C';

        Compte compteEpargne = new Compte();
        compteEpargne.solde=1600.0f;
        compteEpargne.type='E';

        compteCourant.solde=compteCourant.solde-56.0f-35.0f-15.0f-125.50f;
        compteEpargne.solde=compteEpargne.solde-150.0f;
        compteCourant.solde=compteCourant.solde+150.0f;
        compteCourant.solde=compteCourant.solde-68.0f-99.0f;

        System.out.println("il reste "+compteCourant.solde+" € en fin de semaine sur le compte courant.");
        System.out.println("il reste "+compteEpargne.solde+" € en fin de semaine sur le compte courant.");


    }
}
