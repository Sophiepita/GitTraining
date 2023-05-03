package fr.epita.lafabrique.session7.javajour3Exception;

public class Factoriel {
    public static int calculFactoriel(int nombre) throws FactorielleException {
        int res = 1;
        if (nombre > 15) {
            throw new FactorielleException();
        }
        else {
            for (int i = 1; i <= nombre; i++) {
                res = res * i;
                System.out.println(" " + res);
            }
            return res;
        }

    }

}
