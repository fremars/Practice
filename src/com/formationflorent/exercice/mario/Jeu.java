package com.formationflorent.exercice.mario;

public class Jeu {
    private static Object Piece;

    public static void main(String[] args) {

        Mario mario = new Mario();
        Piece pieceJeu = new Piece();
        Etoile etoileJeu = new Etoile();
        ChampignonVert champignonVert = new ChampignonVert();
        ChampignonRouge champignonRouge = new ChampignonRouge();


        mario.attraperPiece(pieceJeu);
        mario.mangerChampignonRouge(champignonRouge);
        mario.mangerChampignonVert(champignonVert);
        mario.attraperEtoile(etoileJeu);



    }
}
