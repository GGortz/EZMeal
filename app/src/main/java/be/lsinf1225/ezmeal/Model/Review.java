package be.lsinf1225.ezmeal.Model;


import android.content.ContentValues;
import android.database.Cursor;

public class Review {
    private int iD_recette;
    private String commentaire;
    private int rating;
    private String auteur;
    private String date;

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

public Review reviewConverter(Cursor c){
    while(c.moveToNext()) {
        this.iD_recette = c.getInt(1);
        this.auteur = c.getString(0);
        this.date = c.getString(2);
        this.rating = c.getInt(3);
        this.commentaire = c.getString(4);
    }
    return this;
}

/*

   public Review getReview(int id){
        return reviewConverter(be.lsinf1225.ezmeal.DBHelper.getReadableDatabase().rawQuery("SELECT * FROM Review WHERE Num=", new String[]{"id"}));

    }

    public int getRating(int id){
        return this.rating;
        Cursor c= be.lsinf1225.ezmeal.DBHelper.getReadableDatabase().rawQuery("select Note from Review where Num = ",  new String[]{String.valueOf(id)});
        int somme=0;
        int nbre=0;
        while(c.moveToNext()){
         nbre++;
         somme=somme+c.getInt(1);
         }
         return (int) somme/nbre;

    }
    public String getCommentaire(int id){
        return this.commentaire;
        Cursor c= be.lsinf1225.ezmeal.DBHelper.getReadableDatabase().rawQuery("select Commentaire from Review where Num = ",  new String[]{"id"});
        String s="";
        while(c.moveToNext()){
        s= s+" "+c.getString(1);
        }
         return s;

    }
    public void create_Review(int id, String com){
        ContentValues newreview = new ContentValues();
     //   newreview.put("User", login.getUtilisateur(););
        newreview.put("Num", id);
      //  newreview.put("Date", getDate(););
        newreview.put("Commentaire", com);
        be.lsinf1225.ezmeal.DBHelper.getWritableDatabase().insert("Review", null, newreview);
    }
    public void create_Review(int id, int rate){
        ContentValues newreview = new ContentValues();
    //    newreview.put("User", login.getUtilisateur(););
        newreview.put("Num", id);
    //    newreview.put("Date", getDate(););
        newreview.put("Note", rate);
        be.lsinf1225.ezmeal.DBHelper.getWritableDatabase().insert("Review", null, newreview);
    }
    public void create_Review(int id, int rate, String com){
        ContentValues newreview = new ContentValues();
     //   newreview.put("User", login.getUtilisateur(););
        newreview.put("Num", id);
     //   newreview.put("Date", getDate(););
        newreview.put("Commentaire", com);
        newreview.put("Note", rate);
        be.lsinf1225.ezmeal.DBHelper.getWritableDatabase().insert("Review", null, newreview);
    }

*/

}
