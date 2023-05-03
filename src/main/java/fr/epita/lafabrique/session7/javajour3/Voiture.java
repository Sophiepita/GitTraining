package fr.epita.lafabrique.session7.javajour3;

public class Voiture extends Vehicule{

    public Voiture(int nombreDeRoue) {
        super(nombreDeRoue);
    }
    @Override
    void direBonjour(int nombreDeRoue){
        System.out.println("je suis une voiture à " + nombreDeRoue + " roues");
    }
}
