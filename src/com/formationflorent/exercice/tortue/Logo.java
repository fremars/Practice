package com.formationflorent.exercice.tortue;

public class Logo {

    static Tortue tortue=new InstrumentedTortue();
    public static void main(String[] args) {

        tortue.tournerDroite(90);
        tortue.avancer(200);
        tortue.tournerGauche(90);
        tortue.avancer(400);
        tortue.tournerGauche(90);
        tortue.avancer(100);
        tortue.tournerGauche(90);
        tortue.avancer(300);
        tortue.tournerDroite(90);
        tortue.avancer(200);
        tortue.tournerDroite(90);
        tortue.avancer(300);
        tortue.tournerGauche(90);
        tortue.avancer(100);
        tortue.tournerGauche(90);
        tortue.avancer(400);
        tortue.tournerGauche(90);
        tortue.avancer(200);

        System.out.println("X="+tortue.x+"  Y="+tortue.y+"  Angle="+tortue.angleActuel);

    }

}
