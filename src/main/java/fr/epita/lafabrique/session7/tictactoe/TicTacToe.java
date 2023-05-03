package fr.epita.lafabrique.session7.tictactoe;

import java.util.Arrays;

public class TicTacToe {

    public static void AfficherPlateau(char[][] plateau) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(plateau[i][j]);
                }
            System.out.println();
        }
     }

    public static boolean ChercherGagnant (char[][] plateau,char symbol, int ligne, int colonne){

        plateau[ligne][colonne] = symbol;

        boolean partieGagne = false;

        if ((plateau[0][0] == symbol && plateau[0][1] == symbol && plateau[0][2] == symbol)
           ||
                (plateau[1][0] == symbol && plateau[1][1] == symbol && plateau[1][2] == symbol)
           ||
                (plateau[2][0] == symbol && plateau[2][1] == symbol && plateau[2][2] == symbol))

            {partieGagne = true;}

        if ((plateau[0][0] == symbol && plateau[1][0] == symbol && plateau[2][0] == symbol)
                ||
                (plateau[0][1] == symbol && plateau[1][1] == symbol && plateau[2][1] == symbol)
                ||
                (plateau[0][2] == symbol && plateau[1][2] == symbol && plateau[2][2] == symbol))
        { partieGagne = true;}

        if ((plateau[0][0] == symbol && plateau[1][1] == symbol && plateau[2][2] == symbol)
                ||
                (plateau[0][2] == symbol && plateau[1][1] == symbol && plateau[2][0] == symbol))
        { partieGagne = true;}

        return partieGagne;
    }



}