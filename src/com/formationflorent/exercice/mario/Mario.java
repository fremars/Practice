package com.formationflorent.exercice.mario;

public class Mario {
    public static int nbVie;
    int taille;
    boolean estInvincible;
    int nbPiece;

    public Mario() {
        Mario.nbVie = 5;
        this.taille = 1;
        this.estInvincible = false;
        this.nbPiece = 0;
    }

    public void mangerChampignonVert(ChampignonVert cv) {
        Mario.nbVie++;
        cv.estAttrape = true;
        System.out.println("Mario gagne 1 vie grâce à un champignon vert !");

    }

    public void mangerChampignonRouge(ChampignonRouge cr) {
        this.taille++;
        cr.estAttrape = true;
        System.out.println("Mario est devenu grand grâce à un champignon rouge !");

    }

    public void attraperPiece(Piece pieceJeu) {
        this.nbPiece++;
        pieceJeu.estAttrape = true;
        System.out.println("Mario attrape une pièce.");
        if (nbPiece == 100) {
            this.nbPiece = 0;
            Mario.nbVie++;
            System.out.println("Mario a gagné une vie grâce à 100 pièces !");
        }
    }

    public void attraperEtoile(Etoile etoileJeu) {
        this.estInvincible = true;
        etoileJeu.estAttrape = true;
        System.out.println("Mario devient invincible grâce à une étoile !!!");
    }
}
