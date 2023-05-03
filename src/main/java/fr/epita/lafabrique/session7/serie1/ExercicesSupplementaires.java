package fr.epita.lafabrique.session7.serie1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ExercicesSupplementaires {

    public static long exercice1(long... elements) {

        long resultat = 0;

        if (elements.length == 0) {
            resultat = -1;
        }

        for (long element : elements) {
            resultat += element * element;
        }
        System.out.println((resultat));
        return resultat;
    }

    public static int exercice2(float[] elements) throws IllegalArgumentException {

        float somme = 0;

        for (float element : elements) {
            somme += element;
        }

        return (int) somme / elements.length;
    }

    public static int exercice3(long[] entiers) {

        int max = 0;
        long valeur_abs = 0;

        for (int i = 0; i < entiers.length; i++) {

            if (Math.abs(entiers[i]) > valeur_abs) {
                valeur_abs = Math.abs(entiers[i]);
                max = i;
            } else if ((Math.abs(entiers[i]) == valeur_abs) && (entiers[i] > 0)) {
                max = i;
            }
        }
        return max;
    }

    public static long exercice4(int n) {
        return 0;
    }

    public static boolean exercice5(int age, int pysique, long revenusAnnuels) {
        return true;
    }

    public static String exercice6(String numeroClair) {
        return "";
    }

    public static String exercice7(String texteMinEtMaj) {
        return "";
    }

    public static long exercice8(int[] entiers) {
        return 0;
    }

    public static long exercice9(int[] entiersPositifs) {
        return 0;
    }

    public static long exercice10(String nombre, int nombreVirgules) {
        return 0;
    }

    public static boolean exercice11(int pieces10ct, int pieces20ct, int pieces50ct, int totalARendre) {
        return false;
    }

}

