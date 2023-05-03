package fr.epita.lafabrique.session7.javajour2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        afficherTableau();


    }

    // Exo 1 & 2 - Création de tableau
    public static void afficherTableau() {

        String[] tableau = new String[3];
        tableau = new String[]{"salut", "bonjou", "coucou"};

        for (String table : tableau) {
            System.out.println(table);
        }

        String[][] tableauTroisDimension= new String[2][2];
        tableauTroisDimension = new String[][]{{"X","X"},{"O","O"}};


    }


}
