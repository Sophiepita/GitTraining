package fr.epita.lafabrique.session7.API;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class ExoCollection {
    public static void main(String[] args) {

        //Exo sur création d'une liste (non trée) avec ajout d'un élément et affichage
        List<String> liste = new ArrayList<>();
        liste.add("bo");
        liste.add("nj");
        liste.add("ou");
        liste.add("r ");

        ajoutElementListe(liste);

        // Exo sur le tri d'une liste non triée
        List<Integer> listeNombre = new ArrayList<>();

        listeNombre.add(5);
        listeNombre.add(-1);
        listeNombre.add(11);
        listeNombre.add(2);
        listeNombre.add(7);
        listeNombre.add(5);

        System.out.println("\nListe au départ :" + listeNombre);
        Collections.sort(listeNombre);
        System.out.println("Liste triée :" + listeNombre);

        // Mêmes exos que précédemment mais avec une Collection triée (PriorityQueue)

        PriorityQueue<String> queueTriee = new PriorityQueue();
        queueTriee.add("abc");
        queueTriee.add("aac");
        queueTriee.add("abd");
        queueTriee.add("bbc");
        queueTriee.add("dbc");
        queueTriee.add("acb");
        System.out.println("Priority Queue : " + queueTriee);

        queueTriee.add("aaa");
        System.out.println("Après ajout de PriorityQueue : " + queueTriee);

        // Tableau de l'interface List à 2 dimensions

        List<List<Integer>> tableauDeuxDimension = new ArrayList<>();

        /* Faire 2 boucles, alimenter la 1ère liste, puis écrire la ligne dans le tableau

        for (int i = 0;  i < 5; i++) {
            List<Integer> ligne = new ArrayList <>();

            for (int j = 0; j < 5; j++){
                System.out.println(" i : " + i + " j : " + j);
                ligne.add(i, j);
                System.out.println(" i : " + i + " j : " + j);
            }
            tableauDeuxDimension.add(ligne);
            System.out.println("ligne : " + ligne);
        }
        */

        // Gestion de la file de voyageurs

        List<Voyageur> listeDAttente = new ArrayList<>();

        Voyageur voyageur1 = new Voyageur(132, "32b",Classe.Première);
        Voyageur voyageur2 = new Voyageur(16, "46d",Classe.Business);
        Voyageur voyageur3 = new Voyageur(52, "25a",Classe.Eco);
        Voyageur voyageur4 = new Voyageur(152, "95a",Classe.Première);

        listeDAttente.add(voyageur1);
        listeDAttente.add(voyageur2);
        listeDAttente.add(voyageur3);
        listeDAttente.add(voyageur4);




    }


    public static void ajoutElementListe(List<String> liste) {

        liste.add("Mme");
        for (String str : liste) {
            System.out.print("" + str);
        }
    }
}
