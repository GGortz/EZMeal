package be.lsinf1225.ezmeal.Model;

/**
 * Created by mart1 on 08-05-17.
 */

public class Sous_Categorie {
    private String nom_scat;
    private Categorie cat;
    public Sous_Categorie(Categorie cat, String nom_scat){

        this.nom_scat = nom_scat;
        this.cat =cat;
    }

    public void set_nom_scat(String nom){

        this.nom_scat = nom;
    }
    public String get_nom_scat(Sous_Categorie s_cat){

        return s_cat.nom_scat;
    }
    public Categorie get_cat(){
        return this.cat;
    }
    public void set_cat(Categorie cat){
        this.cat =cat;
    }

}
