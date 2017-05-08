package be.lsinf1225.ezmeal;


import android.content.ContentValues;
import android.database.Cursor;

public class Ingredients {
    private String nomingredient;
    private String souscategorie;

    public Ingredients (String n, String sc){
        this.nomingredient=n;
        this.souscategorie=sc;
    }

 public String getNomingredient(){
     return this.nomingredient;
 }


 public Ingredients ingredientConverter(Cursor c){

 }

 public String getSouscategorie(String n){
     return this.souscategorie;
        Cursor c= be.lsinf1225.ezmeal.DBHelper.getReadableDatabase().rawQuery("select Sous-catégorie from Ingrédient where Nom = ",  new String[]{n});
        String sc="";
        if(c.moveToFirst()){
         sc=c.getString(1);
         }
        return sc;
         


 }

 public String getCategorie(String n){souscategorie.getCategorie(this.souscategorie);
 }

 public void createIngredient(String n, String sc){
     //Faire commande SQL
     ContentValues newingredient = new ContentValues();
     newingredient.put("Nom", n);
     newingredient.put("Sous-catégorie", sc);
     be.lsinf1225.ezmeal.DBHelper.insert("Ingrédient", null, newingredient);
 }


 public void del_ingredient(String n){
     //Faire commande SQL
     be.lsinf1225.ezmeal.DBHelper.delete("Ingrédient", "Nom", n);

 }

 public void add_ingredient(String n, String sc){
     //Commande SQL
     ContentValues newingredient = new ContentValues();
     newingredient.put("Nom", n);
     newingredient.put("Sous-catégorie", sc);
     be.lsinf1225.ezmeal.DBHelper.insert("Ingrédient", null, newingredient);
 }



}
