package fr.epita.lafabrique.session7.API;

import sun.text.normalizer.UTF16;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardOpenOption.CREATE;

public class MainNIO {
    public static void main(String[] args) {

        int nbOccurrence = 0;

        Path path = Paths.get("src/Comptines.txt");

        List<String> ligne = new ArrayList<>();
// Vérifie existence du fichier
        if (Files.exists(path)) {
            try {
                // Lire le fichier, tout est balancé dans ligne
                ligne = Files.readAllLines(path);

                for (String ligneLu : ligne) {
                    System.out.println("Ligne lue : " + ligneLu);
                    // Pour toutes les lignes, extraire les mots
                    String[] mot = ligneLu.split(" ");
                    for (String motLu : mot) {
                        System.out.println("mot lu:" + motLu);
                        nbOccurrence++;
                    }
                }
            } catch (IOException e) {
                System.out.println("Le fichier n'existe pas");
                e.printStackTrace();
            }
        } else {
            System.out.println("Le fichier n'existe pas");
        }
        System.out.println("Nombre de mots de la comptine : " + nbOccurrence);


        // Ecriture du fichier Comptines.txt dans un nouveau fichier
        Path myFile = Paths.get("/copie_comptine.txt");

        Boolean exist = Files.exists(myFile);

        if (!exist) {
            try {
                System.out.println("Le fichier doit être créé !");
                //Files.createFile(myFile);

                //Files.copy(path, myFile);

                Files.write(myFile, ligne, CREATE);
            } catch (IOException e) {
                System.out.println("Erreur d'écriture");
            }
        }
        else{
            System.out.println("Le fichier existe déjà !");
        }
    }
}
