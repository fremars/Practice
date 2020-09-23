package com.formationflorent.exercice.rugby;

public class FranceVSNouvelleZeland {

    public static void main(String[] args) {

        Equipe france = new Equipe();
        france.nom = "France";
        france.score=0;
        Equipe nouvelleZeland = new Equipe();
        nouvelleZeland.nom = "Nouvelle-Zeland";
        nouvelleZeland.score=0;

        france.essai();
        france.transformation();
        nouvelleZeland.essai();
        nouvelleZeland.transformation();
        nouvelleZeland.essai();
        nouvelleZeland.transformation();
        france.essai();
        france.drop();
        france.drop();
        nouvelleZeland.essai();
        nouvelleZeland.transformation();
        nouvelleZeland.essai();
        nouvelleZeland.transformation();

        if(france.score>nouvelleZeland.score){
            System.out.println("L'équipe de France bat la Nouvelle-Zeland sur le score de "+france.score+"-"+nouvelleZeland.score+" !!!");

        }else if (france.score<nouvelleZeland.score){
            System.out.println("L'équipe de Nouvelle-Zeland bat la France sur le score de "+nouvelleZeland.score+"-"+france.score+" !!!");
        }else {
            System.out.println("L'équipe de France et de la Nouvelle-Zeland sont à égalité "+france.score+"-"+nouvelleZeland.score);
        }

    }
}
