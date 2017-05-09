        package be.lsinf1225.ezmeal.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;
//yolo

import be.lsinf1225.ezmeal.Model.Utilisateur;

        public class DBHelper extends android.database.sqlite.SQLiteOpenHelper{


    final static String T_Utilisateur = "Utilisateur";
            final static String C_Login = "C_Login";
            final static String C_Password = "C_Password";
            final static String C_Annee = "C_Annee";
            final static String C_Mois = "C_Mois";
            final static String C_Jour = "C_Jour";
            final static String C_Sexe = "C_sexe";
            final static String C_City = "C_City";
            final static String C_Country = "C_Country";

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override  //Pour mettre à jour la version de la DB
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
     db.execSQL("DROP TABLE IF EXISTS "+T_Utilisateur);
     onCreate(db);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE Table "+T_Utilisateur+"("+C_Login+" TEXT, "+C_Password+" TEXT, "+C_Annee+" INTEGER, "+C_Mois+" Integer, "+C_Jour+" Integer, "+C_Sexe+" TEXT, "+C_City+" TEXT, "+C_Country+" TEXT)");
    }

    public void onOpen(SQLiteDatabase db){
        //
    }

    public void save(Utilisateur u){ // sauve un utilisateur
        ContentValues v = new ContentValues();
        v.put(C_Login,u.getLogin());
        v.put(C_Password,u.getPassword());
        v.put(C_Annee,u.getAnnee());
        v.put(C_Mois,u.getMois());
        v.put(C_Jour,u.getJour());
        v.put(C_Sexe,u.getSexe());
        v.put(C_City,u.getCity());
        v.put(C_Country,u.getCountry());
        String login = u.getLogin();
        if(login == null){
            //creation
            login=  this.getWritableDatabase().insert(T_Utilisateur,null,v);
        }
        else{
            //mise à jour
        }
    }
    public List<Utilisateur> getAllUtilisateur(Utilisateur u){//renvois tt les utilisateurs

    }




    //POur accéder à la DB de n'importe ou
    //SQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
    // context :
    // name : nom de la DB
    //factory : null
    //version : version de la DB (dispo variable public)

    //Pour écrire et lire dans la DB
    //SQLiteDatabase getWritableDatabase()
    // sin on veut faire des modif avant, il faut les faire dans void onOpen(SQLiteDatabase)


}