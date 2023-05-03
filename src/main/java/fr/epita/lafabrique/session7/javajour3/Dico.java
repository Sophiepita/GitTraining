package fr.epita.lafabrique.session7.javajour3;

public class Dico {
    private final static String TITRE = "Larousse";
    private static int nbDico = 1;


    public static void getInstance(String titre) {
        if (titre == TITRE) {
            System.out.println("Le dictionnaire existe déjà ! Mon dico " + TITRE + "\nle dico demandé : " + titre);
        } else {
            nbDico++;
            System.out.println("Nombre de dictionaires :" + nbDico);
        }
    }
}
