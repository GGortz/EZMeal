        package be.lsinf1225.catalogue;

        import android.database.sqlite.*;


public class DBHelper extends android.database.sqlite.SQLiteOpenHelper{

    public String Catégorie_Catégorie;
   // public String Catégorie_Sous-Catégorie;
    public String


    @Override  //Pour mettre à jour la version de la DB
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //db.execSQL(VERSION);
        onCreate(db);
    }

    private void onCreate(SQLiteDatabase db) {
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