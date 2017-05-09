package be.lsinf1225.ezmeal.Model;

/**
 * Created by mart1 on 04-05-17.
 */

public class Categorie {
    private Sous_Categorie[] s_cat;
    private String nom_cat;

    public Categorie(String nom_cat,Sous_Categorie[] s_cat) {
        this.nom_cat = str_cat;
        this.s_cat= s_cat;
    }

    public void set_categorie(String nom) {
        this.nom_cat = nom;
    }


    public String get_nom_cat()
    {
        return this.nom_cat;
    }

    public Sous_Categorie[] get_scat() {
        return this.s_cat;
    }




}
}