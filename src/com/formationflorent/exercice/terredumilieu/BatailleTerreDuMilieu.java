package com.formationflorent.exercice.terredumilieu;

public class BatailleTerreDuMilieu {
    public static void main(String[] args) {

        Combattant humain1 = new Combattant();
        Combattant orc1 = new Combattant();
        Arme hache = new Arme();
        Arme epee = new Arme();

        humain1.niveauDeVie=100;
        humain1.type="Humain";
        orc1.niveauDeVie=60;
        orc1.type="ORC";

        hache.type="Hache";
        hache.degat=30;

        epee.type="Epée";
        epee.degat=50;

        humain1.saisirArme(epee);
        humain1.attaquer(orc1);
        orc1.attaquer(humain1);
        orc1.saisirArme(hache);
        orc1.attaquer(humain1);
        humain1.attaquer(orc1);





    }
}
