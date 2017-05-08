package sinf1225.projetmeal;


/**
 * Created by User on 01-05-17.
 */

public class Utilisateur{

    private String login;
    private String password;
    private int annee;
    private int mois;
    private int jour;
    private String sexe;
    private String city;
    private String country;




    public Utilisateur(String login,String password,String sexe,int jour, int mois, int annee,String city,String country){
        super();
        this.login=login;
        this.password=password;
        this.sexe=sexe;
        this.jour=jour;
        this.mois=mois;
        this.annee=annee;
        this.city=city;
        this.country=country;
    }


    public String getLogin(){
            return login;
    }
    public void setLogin(String login){
        this.login=login;
    }
    public String getPassword(){
        return login;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public int getAnnee(){
        return annee;
    }
    public void setAnnee(int annee){
        this.annee=annee;
    }
    public int getMois(){
        return mois;
    }
    public void setMois(int mois){
        this.mois=mois;
    }
    public int getJour(){
        return jour;
    }
    public void setJour(int jour){
        this.jour=jour;
    }
    public String getSexe(){
        return sexe;
    }
    public void setSexe(String sexe){
        this.sexe=sexe;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }






}
