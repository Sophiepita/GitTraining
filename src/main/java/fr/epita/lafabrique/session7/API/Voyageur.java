package fr.epita.lafabrique.session7.API;

public class Voyageur {

    // Exercice à revoir
    private int identifiant;
    private String numeroSiege;
    private Classe classe;

    public Voyageur(int identifiant, String numeroSiege, Classe classe) {
        this.identifiant = identifiant;
        this.numeroSiege = numeroSiege;
        this.classe = classe;
    }

    public Voyageur() {
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNumeroSiege() {
        return numeroSiege;
    }

    public void setNumeroSiege(String numeroSiege) {
        this.numeroSiege = numeroSiege;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
}
