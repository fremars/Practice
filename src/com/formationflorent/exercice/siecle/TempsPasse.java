package com.formationflorent.exercice.siecle;

public class TempsPasse {

    int nombreDeSecondes = 0;

    void ajoutersecondes(int secondes) {
        nombreDeSecondes = nombreDeSecondes + secondes;
    }

    void ajouterminutes(int minutes) {
        ajoutersecondes(60 * minutes);
    }

    void ajouterheures(int heures) {
        ajouterminutes(60 * heures);
    }

    void ajouterjours(int jours) {
        ajouterheures(24 * jours);
    }

    void ajoutermois(int indexMois, boolean anneebBissextile) {
        switch (indexMois) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                ajouterjours(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                ajouterjours(30);
                break;
            case 2:
                if (anneebBissextile){
                    ajouterjours(29);
                }else{
                    ajouterjours(28);
                }
                break;
        }
    }

    void ajouterannee(int annee) {
        switch (annee) {
            case 2000:
            case 2004:
            case 2008:
            case 2012:
            case 2016:
                ajouterjours(366);
                break;
            default:
                ajouterjours(365);
                break;
        }
    }
}
