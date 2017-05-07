package be.lsinf1225.ezmeal;



public class Ingredients {
    private String nomingredient;
    private String souscategorie;

 public String getNomingredient(){
     return this.nomingredient;
 }

 public String getSouscategorie(String n){
     return this.souscategorie;
        /*Cursor c=DBHelper.rawQuery("select Sous-catégorie from Ingrédient where Nom = ",  new String[]{n});
        *String sc="";
        *if(c.moveToFirst()){
        * sc=c.getString(1);
        * }
        * return sc;
         */


 }

 public String getCategorie(String n){
     Souscategorie.getCategorie(this.souscategorie);
 }

 public void createIngredient(String n, String sc){
     //Faire commande SQL
     //ContentValues newingredient = new ContentValues();
     //newingredient.put(Nom, n);
     //newingredient.put(Sous-catégorie, sc);
     //be.lsinf1225.catalogue.DBHelper.insert(Ingrédient, null, newingredient);
 }


 public void del_ingredient(String n){
     //Faire commande SQL
     //DBHelper.delete(Ingrédient, Nom, n);

 }

 public void add_ingredient(String n, String sc){
     //Commande SQL
     //ContentValues newingredient = new ContentValues();
     //newingredient.put(Nom, n);
     //newingredient.put(Sous-catégorie, sc);
     //be.lsinf1225.catalogue.DBHelper.insert(Ingrédient, null, newingredient);
 }



}
