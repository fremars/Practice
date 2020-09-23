package com.formationflorent.exercice.tortue;

public class Tortue {
    int x=0;
    int y=0;
    int angleActuel=0;

    void avancer(int combien){
        switch (angleActuel){
            case 0:
                y=y+combien;
                break;
            case 90:
                x=x+combien;
                break;
            case 180:
                y=y-combien;
                break;
            case 270:
                x=x-combien;
                break;
        }
    }

    void tournerDroite(int angle){
        switch (angle){
            case 0:
                break;
            case 90:
                angleActuel=angleActuel+90;
                break;
            case 180:
                angleActuel=angleActuel+180;
                break;
            case 270:
                angleActuel=angleActuel+270;
                break;
            default:
                System.out.println("Angle incorrect");
                break;
        }
        if (angleActuel>=360){
            angleActuel=angleActuel-360;
        }
    }

    void tournerGauche(int angle){
        switch (angle){
            case 0:
                break;
            case 90:
                angleActuel=angleActuel-90;
                break;
            case 180:
                angleActuel=angleActuel-180;
                break;
            case 270:
                angleActuel=angleActuel-270;
                break;
            default:
                System.out.println("Angle incorrect");
                break;
        }

        if (angleActuel<0){
            angleActuel=angleActuel+360;
        }
    }
}
