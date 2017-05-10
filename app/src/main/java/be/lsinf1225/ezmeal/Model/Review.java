package be.lsinf1225.ezmeal.Model;


import android.content.ContentValues;
import android.database.Cursor;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;

import java.util.ArrayList;
import java.util.List;

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


public ArrayList<Review> reviewConverter(Cursor c){
    ArrayList<Review> review=ArrayList<~>;
    c.moveToFirst();
    while(!c.isAfterLast()) {
        Review revue = null;
        revue.iD_recette = c.getInt(1);
        revue.auteur = c.getString(0);
        revue.date = c.getString(2);
        revue.rating = c.getInt(3);
        revue.commentaire = c.getString(4);
        review.add(revue);
        c.moveToNext();
    }
    return review;
}


    //Retourne la liste de Review de la recette
   public ArrayList<Review> getListeReview(int id){
        return reviewConverter(be.lsinf1225.ezmeal.Database.DBHelper.getReadableDatabase().rawQuery("SELECT * FROM Review WHERE Num = ", new String[]{Integer.toString(id)}));
    }


    //Retourne la moyenne d'une recette sous forme de int
    public int getMoyenneRecette(int id){
        return this.rating;
        Cursor c= be.lsinf1225.ezmeal.Database.DBHelper.getReadableDatabase().rawQuery("SELECT Note FROM Review WHERE Num = ",  new String[]{Integer.toString(id)});
        int somme=0;
        int nbre=0;
        c.moveToFirst();
        while(!c.isAfterLast()){
         nbre++;
         somme=somme+c.getInt(1);
         }
         return (int) somme/nbre;

    }

    //Retourne les commentaires d'une recette sous forme de String
    public String getCommentaire(int id){   //ok
        Cursor c= be.lsinf1225.ezmeal.Database.DBHelper.getReadableDatabase().rawQuery("select Commentaire from Review where Num = ",  new String[]{Integer.toString(id)});
        String s="";
        c.moveToFirst();
        while(!c.isAfterLast()){
        s= s+" "+c.getString(1);   //s=s+"\n"c.getString(1);   //Si on veut un retour a la ligne mais pas sur que ca fonctionne
        }
        return s;

    }

    //Ajoute une review (commentaire) pour la recette avec l'id
    public void create_Review(int id, String com){    //ok
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/YYYY");
        String strDate = sdf.format(c.getTime());
        ContentValues newreview = new ContentValues();
     //   newreview.put("User", login.getUtilisateur(););   //Besoin de récupérer le login de la personne
        newreview.put("Num", id);
        newreview.put("Date", strDate);
        newreview.put("Commentaire", com);
        be.lsinf1225.ezmeal.Database.DBHelper.getWritableDatabase().insert("Review", null, newreview);
    }

    //Ajoute une review (rating) à la recette avec l'id
    public void create_Review(int id, int rate){   //ok
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/YYYY");
        String strDate = sdf.format(c.getTime());
        ContentValues newreview = new ContentValues();
    //    newreview.put("User", login.getUtilisateur(););
        newreview.put("Num", id);
        newreview.put("Date", strDate);
        newreview.put("Note", rate);
        be.lsinf1225.ezmeal.Database.DBHelper.getWritableDatabase().insert("Review", null, newreview);
    }


    //Ajoute une review (commentaire, rating) à la recette avec l'id
    public void create_Review(int id, int rate, String com){   //ok
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/YYYY");
        String strDate = sdf.format(c.getTime());
        ContentValues newreview = new ContentValues();
     //   newreview.put("User", login.getUtilisateur(););
        newreview.put("Num", id);
        newreview.put("Date", strDate);
        newreview.put("Commentaire", com);
        newreview.put("Note", rate);
        be.lsinf1225.ezmeal.Database.DBHelper.getWritableDatabase().insert("Review", null, newreview);
    }



}
