package com.formationflorent.exercice.nuls;

public class Main {

    public static void main(String[] args) {
        Nuls alainChabat = new Nuls();
        alainChabat.nom = "Alain Chabat";
        Nuls fauxnuls = new Nuls();

        if (alainChabat.nom == null) {
            System.out.println(alainChabat.nom + " n'est pas un membre des nuls.");
        } else {
            System.out.println(alainChabat.nom + " est un membre des nuls !");
        }

        if (fauxnuls.nom == null) {
            System.out.println(fauxnuls.nom + " n'est pas un membre des nuls.");
        } else {
            System.out.println(fauxnuls.nom + " est un membre des nuls !");
        }


    }
}
