package be.lsinf1225.ezmeal;



public class Review {
    private int iD_recette;
    private String commentaire;
    private int rating;

public Review(int id, String com){
    this.iD_recette=id;
    this.commentaire=com;
}
public Review(int id, int rate){
    this.iD_recette=id;
    this.rating=rate;
}
public Review(int id, int rate, String com){
    this.iD_recette=id;
    this.rating=rate;
    this.commentaire=com;
}
public Review(int id, String com, int rate){
    this.iD_recette=id;
    this.rating=rate;
    this.commentaire=com;
}


    public int getRating(int id){
        return this.rating;
        /*Cursor c=DBHelper.rawQuery("select Note from Review where Num = ",  new String[]{"id"});
        *int somme=0;
        *int nbre=0;
        *while(c.moveToNext()){
        * nbre++;
        * somme+c.getint(1);
        * }
        * return somme/nbre;
         */
    }
    public String getCommentaire(int id){
        return this.commentaire;
        /*Cursor c=DBHelper.rawQuery("select Commentaire from Review where Num = ",  new String[]{"id"});
        *String s="";
        *while(c.moveToNext()){
        * s+" "+c.getString(1);
        * }
        * return s;
         */
    }
    public create_Review(int id, String com){
        //ContentValues newreview = new ContentValues();
        //newreview.put(User, login.getUtilisateur(););
        //newreview.put(Num, id);
        //newreview.put(Date, getDate(););
        //newreview.put(Commentaire, com);
        //be.lsinf1225.catalogue.DBHelper.insert(Review, null, newreview);
    }
    public create_Review(int id, int rate){
        //ContentValues newreview = new ContentValues();
        //newreview.put(User, login.getUtilisateur(););
        //newreview.put(Num, id);
        //newreview.put(Date, getDate(););
        //newreview.put(Note, rate);
        //be.lsinf1225.catalogue.DBHelper.insert(Review, null, newreview);
    }
    public create_Review(int id, int rate, String com){
        //ContentValues newreview = new ContentValues();
        //newreview.put(User, login.getUtilisateur(););
        //newreview.put(Num, id);
        //newreview.put(Date, getDate(););
        //newreview.put(Commentaire, com);
        //newreview.put(Note, rate);
        //be.lsinf1225.catalogue.DBHelper.insert(Review, null, newreview);
    }





}
