package sinf1225.projetmeal;

/**
 * Created by User on 01-05-17.
 */

public class Utilisateur {

    private String login;
    private String password;
    private int annee;
    private int mois;
    private int jour;
    private String sexe;
    private String city;
    private String country;

    public Utilisateur(String login,String password,String sexe,int jour, int mois, int annee,String city,String country){
        this.login=login;
        this.password=password;
        this.sexe=sexe;
        this.jour=jour;
        this.mois=mois;
        this.annee=annee;
        this.city=city;
        this.country=country;
    }

    public void connexion(String login,String secret){
        this.login=login;
        if(secret ==password){
            //créer une instance du menu principale
        }
        else {
            //message d'erreur;
        }
    }

    public void inscription(String login,String password,String passwordbis,String sexe,int jour, int mois, int annee,String city,String country){
        this.login=login;
        this.password=password;
        this.sexe=sexe;
        this.jour=jour;
        this.mois=mois;
        this.annee=annee;
        this.city=city;
        this.country=country;
        if (password==passwordbis){
            if(jour<31 && jour>0){
                if(mois<31 && mois>0){
                    if(annee<2018 && annee>1900){
                        //créer une nouvelle ligne dans la base SQL
                        //créer l'instance du menu principale
                    }
                    else{
                        //message d'erreur
                    }

                }
                else{
                    //message d'erreur
                }
            }
            else{
                //message d'erreur
            }
        }
        else{
            //message d'erreur
        }

    }
    public void deletutilisateur(){
        //supprimer la ligne de la DTB
    }
    public void modifutilisateur(String login){
            this.login=login;

    }

    public void modifpassword(String password){
        this.password=password;
    }
    public void modifpassword(String sexe){
        this.sexe=sexe;
    }



}
