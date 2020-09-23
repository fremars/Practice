package com.formationflorent.exercice.epicerie;

public class Platprepare {
    double prixTTC;
    double tva = 1.10d;

    Platprepare() {
        this.prixTTC = 0;
    }

    Platprepare(double prixHT) {
        this.prixTTC = prixHT * tva;
        Epicerie.chiffreAffaires += this.prixTTC;
    }

    Platprepare(double prixHT, double reductionPourcent) {
        double reduction = 1 - (reductionPourcent / 100);
        this.prixTTC = prixHT * tva * reduction;
        Epicerie.chiffreAffaires += this.prixTTC;
    }
}
