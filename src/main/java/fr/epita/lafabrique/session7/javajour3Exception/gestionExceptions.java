package fr.epita.lafabrique.session7.javajour3Exception;

public class gestionExceptions {
    public static void main(String[] args) {
        int nombre = 16;
        int res = 0;

        try {
            res = Factoriel.calculFactoriel(nombre);
        } catch (FactorielleException e) {
            System.out.println("Nombre trop grand - 2è message" + "\n" + e);
        }
        System.out.println("Factoriel est : " + res);
    }

}
