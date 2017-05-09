package be.lsinf1225.ezmeal.Model;


public class Recettes{


    private String nom_r;
    private int t_prep;
    private int t_cuiss;
    private int n_couv;
    private String description;
    private int ch_fr;
    private String date;
    private String auteur;
    private Recettes recette;
    private String prix;
    private String difficulte;
    private int rating;

    public Recettes create_recette(String nom_r,int t_prep, int t_cuiss, int n_couv, String description, int ch_fr, String date, String auteur, String prix, String difficulte){
        this.nom_r = nom_r;
        this.t_prep=t_prep;
        this.t_cuiss=t_cuiss;
        this.n_couv=n_couv;
        this.description=description;
        this.ch_fr=ch_fr;
        this.date=date;
        this.auteur=auteur;
        this.prix=prix;
        this.difficulte=difficulte;
        return this;
    }


    public String getNom_r() {
        return this.nom_r;
    }
    public String getDate() {
        return this.date;
    }
    public int getCh_fr() {
        return this.ch_fr;
    }
    public int getN_couv() {
        return this.n_couv;
    }
    public int getT_cuiss() {
        return this.t_cuiss;
    }
    public int getT_prep() {
        return this.t_prep;
    }
    public String getDescription() {
        return this.description;
    }
    public String getAuteur() {
        return this.auteur;
    }
    public int get_tt() {
        return (this.t_cuiss + this.t_prep);
        }
public String getPrix() {return this.prix;}
    public String getDifficulte() {return this.difficulte;}
    public int getRating() {return this.rating;}

    public void setNom_r(String nom_r) {
        this.nom_r = nom_r;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCh_fr(int ch_fr) {
        this.ch_fr = ch_fr;
    }

    public void setN_couv(int n_couv) {
        this.n_couv = n_couv;
    }

    public void setT_cuiss(int t_cuiss) {
        this.t_cuiss = t_cuiss;
    }

    public void setT_prep(int t_prep) {
        this.t_prep = t_prep;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setPrix(String prix) {this.prix=prix;}
    public void setDifficulte(String difficulte) {this.difficulte=difficulte;}
}


