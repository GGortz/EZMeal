package be.lsinf1225.ezmeal.Model;

/**
 * Created by mart1 on 28-04-17.
 */

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

    public Recettes create_recette(String nom_r,int t_prep, int t_cuiss, int n_couv, String description, int ch_fr, String date, String auteur){
        this.nom_r = nom_r;
        this.t_prep=t_prep;
        this.t_cuiss=t_cuiss;
        this.n_couv=n_couv;
        this.description=description;
        this.ch_fr=ch_fr;
        this.date=date;
        this.auteur=auteur;

    }
