package com.formationflorent.exercice.fomo;

public class Message {


    public String contactVoix(String numeroTelephone){
        return contactVoix("Téléphone", numeroTelephone);
    }

    public String contactVoix(String moyenCommunication, String identifiant){
        return ("Tentative de contact voix avec "+identifiant+" par "+moyenCommunication+".");
    }

    public String contactTexte(String adresseMail){
        return (contactTexte("Mail", adresseMail));
    }

    public String contactTexte(String moyenCommunication, String identifiant){
        return ("Tentative de contact texte avec "+identifiant+" par "+moyenCommunication+".");
    }

}
