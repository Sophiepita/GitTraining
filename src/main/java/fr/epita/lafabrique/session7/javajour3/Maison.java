package fr.epita.lafabrique.session7.javajour3;

public class Maison implements AvecChauffage,AvecClimatisation{
    private double temperature;

    public Maison(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void chauffer(double temperature){

        temperature += 2;
        System.out.println("Température après chauffage : " + temperature);
    }
    public void refroidir(double temperature){
        temperature -= 2 ;
        System.out.println("Température après clim : " + temperature);
    }
}
