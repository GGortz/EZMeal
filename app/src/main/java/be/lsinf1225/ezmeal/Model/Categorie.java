package be.lsinf1225.ezmeal.Model;

/**
 * Created by mart1 on 04-05-17.
 */

public class Categorie {
    private String s_cat;
    private String nom_cat;

    public Categorie(String nom_cat, String s_cat) {
        this.nom_cat = nom_cat;
        this.s_cat = s_cat;
    }

    public String getNom_cat() {
        return nom_cat;
    }

    public String getS_cat() {
        return s_cat;
    }

    public void setNom_cat(String nom_cat) {
        this.nom_cat = nom_cat;
    }

    public void setS_cat(String s_cat) {
        this.s_cat = s_cat;
    }

}