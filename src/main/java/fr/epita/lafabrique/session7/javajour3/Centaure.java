package fr.epita.lafabrique.session7.javajour3;

import sun.rmi.transport.ObjectTable;

public class Centaure {
    private int nbPattes = 4;
    private int nbBras = 2;

    public static int population = 0;

    public static void nbPopulation () {
        System.out.println("Avant incrémentation : " + population);
        population ++;
        System.out.println("Nombre population :" + population);}
}
