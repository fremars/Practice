package com.formationflorent.exercice.epicerie;

public class ProduitAlimentaire {
    double prixTTC;
    double tva = 1.055d;

    ProduitAlimentaire() {
        this.prixTTC = 0;
    }

    ProduitAlimentaire(double prixHT) {
        this.prixTTC = prixHT * tva;
        Epicerie.chiffreAffaires += this.prixTTC;
    }

    ProduitAlimentaire(double prixHT, double reductionPourcent) {
        double reduction = 1 - (reductionPourcent / 100);
        this.prixTTC = prixHT * tva * reduction;
        Epicerie.chiffreAffaires += this.prixTTC;
    }


}
