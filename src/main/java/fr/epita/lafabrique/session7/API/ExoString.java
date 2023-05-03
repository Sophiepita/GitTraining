package fr.epita.lafabrique.session7.API;

public class ExoString {
    public static void main(String[] args) {
        // Compte le nombre de "a" dans la chaine de caractères - la case est importante
        String phrase = "Ahahahahahaaaaaa";
        System.out.println("le nombre de A est : " + compteA(phrase));

        //compare 2 chaine de caractères, retourne un int indiquant quelle chaine se situe par rapport à l'autre
        // a est 2 positions devant c
        String mot = "a";
        System.out.println("Comparaison de niveau entre 2 chaines : " + mot.compareToIgnoreCase("c"));

        // mise en majuscule
        transfMaj("blablabla");

        // Remplace les "a" en "4"
        String expression = "La banane a une peau jaune";
        System.out.println("L'expression transformée : " + expression.replace("a","4"));

        // Couper un bout de la chaine de caractère
        String commentaire = "je ne comprends pas le Cobol";
        System.out.println("La phrase devient : " + commentaire.substring(0,2) + commentaire.substring(5,14) + commentaire.substring(19));

        // Transformer un int en String
        int nombre = 123456;
        System.out.println("Le nombre devient une chaine de caractères : " + nombre);
        System.out.println("Avec la méthode valueOf() : " + String.valueOf(nombre));

        // Transformer un String en int
        String identifiant = "139117";
        System.out.println("Le nombre devient une chaine de caractères : " + identifiant);
        System.out.println("Avec la méthode Intege.parseInt(<chaine>) : " + Integer.parseInt(identifiant));
    }

    public static void transfMaj(String mot) {
        System.out.println("le mot " + mot + " en majuscule est " + mot.toUpperCase());
    }

    public static int compteA(String phrase) {
        int res = 0;
        // Transformation d'une chaine de caractères en tableau de char

        char[] lettre = phrase.toCharArray();
        for (int i = 0; i < lettre.length; i++) {
            if (lettre[i] == 'a') {
                res++;
            }
        }
        return res;
    }

}
