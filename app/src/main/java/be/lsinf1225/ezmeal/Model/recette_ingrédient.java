package be.lsinf1225.ezmeal.Model;

/**
 *  Created by louis on 7/05/17.
 */

public class recette_ingrédient {

    private int ID_recette;

    private String nom_ingrédient;

    private String quantité;

    public int getID_recette() {
        return ID_recette;
    }

    public void setID_recette(int ID_recette) {
        this.ID_recette = ID_recette;
    }

    public String getNom_ingrédient() {
        return nom_ingrédient;
    }

    public void setNom_ingrédient(String nom_ingrédient) {
        this.nom_ingrédient = nom_ingrédient;
    }

    public String getQuantité() {
        return quantité;
    }

    public void setQuantité(String quantité) {
        this.quantité = quantité;
    }
}
