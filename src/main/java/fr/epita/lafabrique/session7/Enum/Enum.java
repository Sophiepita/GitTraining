package fr.epita.lafabrique.session7.Enum;

import java.text.Format;

public class Enum {
    public static void main(String[] args) {

        // Exercice sur les semaines

        System.out.println(Semaine.Dimanche.compareTo(Semaine.Lundi));
        System.out.println(Semaine.Mardi.compareTo(Semaine.Jeudi));
        System.out.println(Semaine.Dimanche.ordinal());
        System.out.println(Semaine.Mercredi.ordinal());

        // Exercices perso sur joueurs de tennis
        // Methode values() permet de récupérer toutes les valeurs de l'enum dans un tableau de Classe Enum

        JoueurTennis [] joueurs = JoueurTennis.values();

        for (JoueurTennis joueur : joueurs){
            System.out.println("Notre enumeration : "  + joueur.name() + " Joueurs aimé " + joueur.getJoueurAime() + " a été 1er mondial " + joueur.isJoueurPremier());
        }

        System.out.println("Sampras est déclaré en position de Tsonga : " + JoueurTennis.Sampras.compareTo(JoueurTennis.Tsonga));
    }
}
