package fr.epita.lafabrique.session7.javajour3;

public class Velo extends Vehicule{


    public Velo(int nombreDeRoue) {
        super(nombreDeRoue);
    }

    @Override
    void direBonjour(int nombreDeRoue){
        System.out.println("je suis un vélo à " + nombreDeRoue + " roues");
    }
}
