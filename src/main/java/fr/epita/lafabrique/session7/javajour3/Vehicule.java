package fr.epita.lafabrique.session7.javajour3;

public abstract class Vehicule {
    private int nombreDeRoue;

    public Vehicule(int nombreDeRoue) {
        this.nombreDeRoue = nombreDeRoue;
    }

    public int getNombreDeRoue() {
        return nombreDeRoue;
    }

    public void setNombreDeRoue(int nombreDeRoue) {
        this.nombreDeRoue = nombreDeRoue;
    }

    void direBonjour(int nombreDeRoue){
        System.out.println("je suis un véhicule à" + nombreDeRoue + "  roues");
    }

}
