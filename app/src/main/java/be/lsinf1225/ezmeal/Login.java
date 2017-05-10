package be.lsinf1225.ezmeal;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import be.lsinf1225.ezmeal.Adapter.ListUtilisateurAdapter;
import be.lsinf1225.ezmeal.Database.DBHelper;
import be.lsinf1225.ezmeal.Model.Utilisateur;

public class Login extends AppCompatActivity {

    //private EditText txtLogin = null;
    //private EditText txtPassword = null;
    //private Button btnEnter;
    //private ListUtilisateurAdapter adapter;
    //private List<Utilisateur> mUtilisateurList;
    //private DBHelper mDBHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //  txtLogin = (EditText) findViewById(R.id.txtLogin);
        //txtPassword = (EditText) findViewById(R.id.txtPassword);
        //btnEnter = (Button) findViewById(R.id.btnConnexion);
       // mDBHelper = new DBHelper(this);
    }
}
/*
       File database = getApplicationContext().getDatabasePath(DBHelper.DBNAME);
        if(false == database.exists()){
            mDBHelper.getReadableDatabase();
            //copydb
            if(copyDatabase(this)){
                Toast.makeText(this, "Copy database succes",Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Copy data error", Toast.LENGTH_SHORT).show();
                return;
            }
        }
        mUtilisateurList = mDBHelper.getUtilisateur();
        adapter= new ListUtilisateurAdapter(this, mUtilisateurList);
       btnEnter.setOnClickListener(btnEnterListener);


    }

    private boolean copyDatabase(Context context){
        try{

            InputStream inputStream = context.getAssets().open(DBHelper.DBNAME);
            String outFileName = DBHelper.DBLocation +DBHelper.DBNAME;
            OutputStream outputStream = new FileOutputStream(outFileName);
            byte[]buff = new byte[1024];
            int length = 0;
            while ((length = inputStream.read(buff)) > 0) {
              outputStream.write(buff, 0, length);
            }
            outputStream.flush();
            outputStream.close();
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private View.OnClickListener btnEnterListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strLogin= txtLogin.getText().toString();
            String strPassword= txtPassword.getText().toString();

            Intent intent = new Intent(Login.this,pageacceuil.class);
            startActivity(intent);
        }
    };
}
*/