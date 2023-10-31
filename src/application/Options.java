package application;

public class Options {
    private String nom;
    private int valeur;

    public Options(String nom, int valeur) {
        this.nom = nom;
        this.valeur = valeur;
    }

    public String getNom() {
        return nom;
    }

    public int getValeur() {
        return valeur;
    }
}
