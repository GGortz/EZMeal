package be.lsinf1225.ezmeal;

/**
 * Created by louis on 7/05/17.
 */

public class recette_étape {


    private int ID_recette;
    private int num_etap;
    private String etape;


    public String getEtape() {
        return etape;
    }

    public void setEtape(String etape) {
        this.etape = etape;
    }

    public int getNum_etap() {
        return num_etap;
    }

    public void setNum_etap(int num_etap) {
        this.num_etap = num_etap;
    }

    public int getID() {
        return ID_recette;
    }

    public void setID(int ID) {
        this.ID_recette = ID;
    }
}