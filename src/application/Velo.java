package application;

import javafx.scene.image.Image;

public class Velo {
    private String type;
    private String couleurCadre;
    private String marque;
    private Image lienPhoto;
    private double prix;
    private String personnalisation;
    private String taille;

    public Velo(String type, String couleurCadre, String marque, Image image, double prix, String personnalisation, String taille) {
        this.setType(type);
        this.setCouleurCadre(couleurCadre);
        this.setMarque(marque);
        this.setLienPhoto(image);
        this.setPrix(prix);
        this.setPersonnalisation(personnalisation);
        this.setTaille(taille);
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCouleurCadre() {
		return couleurCadre;
	}

	public void setCouleurCadre(String couleurCadre) {
		this.couleurCadre = couleurCadre;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Image getLienPhoto() {
		return lienPhoto;
	}

	public void setLienPhoto(Image image) {
		this.lienPhoto = image;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getPersonnalisation() {
		return personnalisation;
	}

	public void setPersonnalisation(String personnalisation) {
		this.personnalisation = personnalisation;
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

}
