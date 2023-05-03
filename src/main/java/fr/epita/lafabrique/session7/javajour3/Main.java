package fr.epita.lafabrique.session7.javajour3;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Enfant olivier = new Enfant();
        olivier.presentation("Bertoto", "Olivier");

        Enfant charlotte = new Enfant();
        charlotte.presentation("Dupont", "Charlotte");

        int ageCharlotte = charlotte.feterAnniversaire(15);
        System.out.println("Charlotte a " + ageCharlotte + " ans");

        int ageOlivier = olivier.feterAnniversaire(17);

        System.out.println("Olivier a " + ageOlivier + " ans");

        // Methode toString qui affiche que l'adresse
        System.out.println(" Olivier :" + olivier.toString());

        int i = 1;
        int j = 2;
        i = j;
        j = 42;
        System.out.println("i : " + i + " j : " + j);

        // Exercice sur les adresses des classes

        Chat chat = new Chat("Gribouille");
        Chat chat2 = new Chat("Napoleon");

        chat = chat2;
        chat2.setNom("Felix");
        System.out.println("chat : " + chat.getNom() + " chat2 : " + chat2.getNom());

        Chat gribouille = new Chat("Gribouille");
        Chat gribouille2 = clonerChat(gribouille);
        gribouille2.setNom("Felix");
        System.out.println("Nom de gribouille : " + gribouille.getNom());

        // Heritage: Véhicule (Class abstract) Vélo et Voiture
        Velo velo = new Velo(2);
        velo.direBonjour(velo.getNombreDeRoue());
        Voiture voiture = new Voiture(8);
        voiture.direBonjour(voiture.getNombreDeRoue());

        if (voiture.equals(velo)) {
            System.out.println("même adresse");
        } else {
            System.out.println("autre adresse");
        }

        Maison maisonChaud = new Maison(15);
        double temp = maisonChaud.getTemperature();
        maisonChaud.chauffer(temp);
        Maison maisonFroide = new Maison(30);
        maisonFroide.refroidir(10);

        // Exercice sur les Centaures
        Centaure.nbPopulation();

        // Exercice sur les dictionnaires
        Dico.getInstance("Harraps");
        Dico.getInstance("Larousse");

    }

    private static Chat clonerChat(Chat gribouille) {
        Chat clone = new Chat("Griffu");
        clone = gribouille;
        return clone;
    }

}



