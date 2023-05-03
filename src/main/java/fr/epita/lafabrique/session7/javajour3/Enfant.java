package fr.epita.lafabrique.session7.javajour3;

public class Enfant {
    private String nom;
    private String prenom;
    private int age;

    public Enfant(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public Enfant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Enfant() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void presentation(String nom, String prenom) {
        System.out.println("Bonjour, je m'appelle " + nom + " " + prenom);
    }

    public int feterAnniversaire(int age) {
        if (age < 16) {age += 1;}
        return age;
            }

}
