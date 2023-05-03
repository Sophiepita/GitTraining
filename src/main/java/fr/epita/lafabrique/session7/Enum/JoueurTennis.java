package fr.epita.lafabrique.session7.Enum;

public enum JoueurTennis {
    Sampras(true, ":)"),
    Agassis(true, " :)"),
    Edberg(true, ":)"),
    Tsonga(false, ":)"),
    Ivanovic(false, ":("),
    Nadal(true, ":)"),
    Djokovic(true, ":("),
    Tchang(false, ":|");

    private boolean joueurPremier;
    private String joueurAime;

    JoueurTennis(boolean joueurPremier, String joueurAime) {
        this.joueurPremier = joueurPremier;
        this.joueurAime = joueurAime;
    }

    public boolean isJoueurPremier() {
        return joueurPremier;
    }

    public void setJoueurPremier(boolean joueurPremier) {
        this.joueurPremier = joueurPremier;
    }

    public String getJoueurAime() {
        return joueurAime;
    }

    public void setJoueurAime(String joueurAime) {
        this.joueurAime = joueurAime;
    }
}
