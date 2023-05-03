package fr.epita.lafabrique.session7.tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TableauEntier();
        TableauString();
        TableauTroisDimension();

        DessinerDamier(3,3);

        int[] damier = new int[3];
        RetournerTableauModifie(9,damier);


        // Début du jeu Tic Tac Toe
        System.out.println("DEBUT DU JEU TIC TAK TOE");

        char [][] plateauJeu = new char[3][3];

        boolean partieGagnee = false;
        boolean egalite = false;

        char symbolJoueur = 'X';

        int tourDeJeu = 1;

        Scanner sc = new Scanner(System.in);

        while (partieGagnee == false && egalite ==false) {

            System.out.print("Joueur" + tourDeJeu + " " + "Entrez la ligne :");
            int ligne1 = sc.nextInt();
            System.out.print("Joueur" + tourDeJeu + " " + "Entrez la colonne :");
            int colonne1 = sc.nextInt();
            System.out.println("Ligne : " + ligne1 + "Colonne : " + colonne1);
            partieGagnee = TicTacToe.ChercherGagnant(plateauJeu,symbolJoueur, ligne1, colonne1);
            TicTacToe.AfficherPlateau(plateauJeu);
            switch(tourDeJeu) {
                case 1:
                    tourDeJeu = 2;
                    symbolJoueur = 'O';
                    break;
                case 2:
                    tourDeJeu = 1;
                    symbolJoueur = 'X';
                    break;
                default:
                    break;
            }
        }
           if (partieGagnee){
               System.out.println("BRAVO joueur" + tourDeJeu + "vous avez GAGNE !!");
           }
    }

    public static void TableauEntier (){
        int[] tableau = {1, 2, 3, 4};

        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Contenu tableau : " + tableau[i]);
        }
    }

    public static void TableauString() {
        String[] tableau2 = new String[3]; // déclaration et initalisation en 2 temps.

        for (int i = 0; i < tableau2.length; i++) { // Comment alimenter un tableau à postiori ?
            tableau2[i] = "Bonjour";
        }
        for (String elem : tableau2) {
            System.out.println("Contenu tableau2 :" + elem);
        }
    }

    public static void TableauTroisDimension() {

        String[][][] tableauTroisDimension = new String[3][3][3];

        System.out.println("Tableau 3 dimensions : " + tableauTroisDimension[0][0][0]);
        System.out.println("Tableau 3 dimensions : " + tableauTroisDimension[0][1][0]);
        System.out.println("Tableau 3 dimensions : " + tableauTroisDimension[0][2][0]);
    }
public static void DessinerDamier(int largeur, int longueur){

    for (int i = 0; i < largeur; i++) {
        for (int j = 0; j < longueur; j++) {
            System.out.print("X");
        }
        System.out.println("X");
        }
    }

public static void RetournerTableauModifie(int nombreAAjouter, int[] casier){
        int dimension = casier.length + 1;
        int[] nouveauTab = new int[dimension];
        System.out.println(dimension);

        nouveauTab[3] = 9;
        System.out.println("Nouveau tableau :" + nouveauTab[3]);

}

}