        package be.lsinf1225.ezmeal.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;
import be.lsinf1225.ezmeal.Model.Utilisateur;

public class DBHelper extends android.database.sqlite.SQLiteOpenHelper{

    public static final String DBNAME="DBV2(2).sqlite";
    public static final String DBLocation="data/data/be.lsinf1225.ezmeal/databases";
    private Context mContext;
    private SQLiteDatabase mDatabase;

    //final static String T_Utilisateur = "Utilisateur";
      //      final static String C_Login = "C_Login";
        //    final static String C_Password = "C_Password";
          //  final static String C_Annee = "C_Annee";
            //final static String C_Mois = "C_Mois";
            //final static String C_Jour = "C_Jour";
           // final static String C_Sexe = "C_sexe";
            //final static String C_City = "C_City";
            //final static String C_Country = "C_Country";

    public DBHelper(Context context) {
        super(context, DBNAME, null, 1);
        this.mContext=context;
    }

    @Override  //Pour mettre à jour la version de la DB
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
     //db.execSQL("DROP TABLE IF EXISTS "+T_Utilisateur);
     //onCreate(db);
    }

    public void onCreate(SQLiteDatabase db) {
        //db.execSQL("CREATE Table "+T_Utilisateur+"("+C_Login+" TEXT, "+C_Password+" TEXT, "+C_Annee+" INTEGER, "+C_Mois+" Integer, "+C_Jour+" Integer, "+C_Sexe+" TEXT, "+C_City+" TEXT, "+C_Country+" TEXT)");
    }

    public void openDatabase(){
       String dbPath = mContext.getDatabasePath(DBNAME).getPath();
        if(mDatabase !=null && mDatabase.isOpen()){
            return;
        }
        mDatabase = SQLiteDatabase.openDatabase(dbPath,null, SQLiteDatabase.OPEN_READWRITE);
    }

    public void closeDatabase(){
        if(mDatabase != null){
            mDatabase.close();
        }
    }

    //public void save(Utilisateur u){ // sauve un utilisateur
      //  ContentValues v = new ContentValues();
        //v.put(C_Login,u.getLogin());
        //v.put(C_Password,u.getPassword());
        //v.put(C_Annee,u.getAnnee());
        //v.put(C_Mois,u.getMois());
        //v.put(C_Jour,u.getJour());
        //v.put(C_Sexe,u.getSexe());
        //v.put(C_City,u.getCity());
        //v.put(C_Country,u.getCountry());
        //String login = u.getLogin();
        //if(login == null){
            //creation
          //  login=  this.getWritableDatabase().insert(T_Utilisateur,null,v);
        //}
        //else{
            //mise à jour
        //}
    //}
    public List<Utilisateur> getUtilisateur() {//renvois t
        Utilisateur utilisateur = null;
        List<Utilisateur> utilisateurList = new ArrayList<>();
        openDatabase();
        Cursor cursor=mDatabase.rawQuery("SELECT * FROM UTILISATEUR", null);
        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
            utilisateur= new Utilisateur(cursor.getString(0),cursor.getString(1), cursor.getString(2), cursor.getString(3),cursor.getString(4),cursor.getInt(5),cursor.getInt(6), cursor.getInt(7));
            utilisateurList.add(utilisateur);
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return utilisateurList;

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