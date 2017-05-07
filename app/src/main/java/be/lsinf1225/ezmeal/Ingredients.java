package be.lsinf1225.ezmeal;



public class Ingredients {
    private String nomingredient;
    private String souscategorie;

 public String getNomingredient(){
     return this.nomingredient;
 }

 public String getSouscategorie(String n){
     return this.souscategorie;
 }

 public String getCategorie(String n){
     Souscategorie.getCategorie(this.souscategorie);
 }

 public void createIngredient(String n, String sc){
     //Faire commande SQL
 }


 public void del_ingredient(String n){
     //Faire commande SQL
 }

 public void add_ingredient(String n, String sc){
     //Commande SQL
 }



}
