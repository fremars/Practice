package com.formationflorent.exercice;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Appartement
        int surface = 100;
        int nbPiece = 3;
        int loyer = 700;
        boolean cuisineEquipe = false;
        boolean balcon = false;
        boolean parking = true;

        if ((surface > 80 && nbPiece > 2 && loyer <= 700)
                || (surface > 70 && nbPiece >= 2 && cuisineEquipe && balcon && loyer <= 700)) {
            System.out.println("Cet appartement est celui qu'il nous faut !");
        } else {
            System.out.println("Ce n'est pas le bon appartement.");
        }


        //Dossier locataire
        int salaireMensuelNet = 1000;
        boolean cdi = false;
        boolean garant = true;
        int salaireGarant = 3000;

        if ((salaireMensuelNet >= 1500 && cdi)
                || (salaireMensuelNet >= 900 && garant && salaireGarant >= 3000)) {
            System.out.println("Ce dossier de locataire est bon.");
        } else {
            System.out.println("Ce dossier de locataire n'est pas bon.");
        }

        final Scanner in = new Scanner(System.in);
        final int N = in.nextInt();
        final int piTab [] = new int[N];
        int ecart = 0;
        for (int i = 0; i < N; i++) {
            final int pi = in.nextInt();
            piTab[i]=pi;
            if(i>0 && (piTab[i]>piTab[i-1])){
                ecart=piTab[i];
            }else if(i==0){
                ecart=piTab[i];
            }
        }

        for (int j = 0; j>N; j++){
            for(int k = 0; k>N; k++){
                if(j != k){
                    int ecartAbs = (piTab[j]-piTab[k]);
                    ecartAbs = abs(ecartAbs);
                    if( (ecartAbs) < ecart){
                        ecart=abs(piTab[j]-piTab[k]);
                    }
                }
            }
        }


        //Billes

        int nbBilles = 10;
        System.out.println("Nombre de billes en début de partie : " + nbBilles);

        nbBilles = nbBilles - 2 + 1;

        System.out.println("Nombre de billes en fin de partie : " + nbBilles);


        // Loto

        int montantLoto = 25000;
        int montantVoiture = 18000;
        int montantRadarRecul = 450;
        int montantJantesAlu = 900;
        int factureElectrcite = 341;
        int creditEtudes = 5000;
        int montantImpot = 448;
        int billetTrouve = 50;

        int total = montantLoto + billetTrouve - (montantVoiture + montantRadarRecul + montantJantesAlu) - factureElectrcite - creditEtudes - montantImpot;

        if (total >= 0) {
            System.out.println("Oui, je peux acheter ma voiture, il me restera " + total + " euros.");
        } else {
            total = total * (-1);
            if (total <= (montantJantesAlu + montantRadarRecul)) {
                System.out.println("Je peux acheter ma voiture mais il me manque " + total + " euros pour les options.");
            } else {
                System.out.println("Je ne peux pas acheter ma voiture, il me manque : " + total + " euros.");
            }

        }

        // Hexadecimal

        char valeurHexadecimale = 'D';
        switch (valeurHexadecimale) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                System.out.println(valeurHexadecimale);
                break;
            case 'A':
                System.out.println("10");
                break;
            case 'B':
                System.out.println("11");
                break;
            case 'C':
                System.out.println("12");
                break;
            case 'D':
                System.out.println("13");
                break;
            case 'E':
                System.out.println("14");
                break;
            case 'F':
                System.out.println("15");
                break;
            default:
                System.out.println("Ceci n'est pas une valeur hexadecimale.");

        }

        //Punition

        for (int nbligne = 1; nbligne <= 25; nbligne++) {
            if (nbligne % 5 == 0 && nbligne >= 5) {
                System.out.println(nbligne + " - Je n'ai pas le droit d'aller sur Udemy en classe.");
            } else {
                System.out.println("Je n'ai pas le droit d'aller sur Udemy en classe.");
            }
        }

        //PI
        double pi=0d;
        double denominateur=1d;


        for(int i=1; i<1000000; i++){
            if(i%2==0){
                pi=pi-(4d/denominateur);
            }else{
                pi=pi+(4d/denominateur);
            }
            denominateur=denominateur+2d;
        }
        System.out.println(pi);


        //Distributeur boisson
        int prixBoisson=3;
        int montantIntroduit=10;
        int montantRestant=montantIntroduit;
        int nbPiece2=0;
        int nbPiece1=0;

        while(montantRestant>prixBoisson){
            if(montantRestant-prixBoisson>=2){
                nbPiece2++;
                montantRestant=montantRestant-2;
            }else if (montantRestant-prixBoisson>=1){
                nbPiece1++;
                montantRestant--;
            }
        }
        System.out.println("Le nombre de pieces de 2 est de : "+nbPiece2);
        System.out.println("Le nombre de pieces de 1 est de : "+nbPiece1);

        //Dichotomie
        float distance=8.0f;
        int i=0;

        while(distance!=0.0f){
            distance=distance/2.0f;
            i++;
        }
        System.out.println("nombre de fois float : "+i);

        double distance2=8.0d;
        int j=0;

        while(distance2!=0.0d){
            distance2=distance2/2.0d;
            j++;
        }
        System.out.println("nombre de fois double : "+j);

        //codingame

        class Solution {

            public static void main(String args[]) {
                Scanner in = new Scanner(System.in);
                int L = in.nextInt();
                int H = in.nextInt();
                if (in.hasNextLine()) {
                    in.nextLine();
                }
                String T = in.nextLine();
                for (int i = 0; i < H; i++) {
                    String ROW = in.nextLine();
                    String str = ROW;
                    String tableauROW[] = new String[27];
                    String tableauAlphabet[] = {"A", 'B', C, D, E, F, G, H, I, J, K, L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,?};


                    for(int j = 0; j<tableauROW.length; j++){
                        int indexDeb;
                        int indexFin;
                        if (j!=0){
                            indexDeb=(j*4)+1;
                            indexFin=indexDeb+3;
                        }else{
                            indexDeb=0;
                            indexFin=4;
                        }

                        String valAscii= str.substring(indexDeb, indexFin);
                        tableauROW[j]=valAscii;
                        System.err.println(tableauROW[j]);

                    }
                }

                // Write an answer using System.out.println()
                // To debug: System.err.println("Debug messages...");

                System.out.println("answer");
            }
        }

        class Solution {

            public static void main(String args[]) {
                Scanner in = new Scanner(System.in);
                String x = in.nextLine();
                String y = in.nextLine();
                String text = in.nextLine();
                String tblTexte[] = new String[text.length()];
                int valeur=0;

                for(int i = 0; i < text.length(); i++){
                    tblTexte[i]=text.substring(i, i);
                }

                for(int j = 0; j < tblTexte.length; j++){
                    if ((tblTexte[j+1] !=y ) && (tblTexte[j]==x)){
                        valeur++;
                    }
                }

                // Write an answer using System.out.println()
                // To debug: System.err.println("Debug messages...");

                System.out.println(valeur);
            }
        }

    }

}


