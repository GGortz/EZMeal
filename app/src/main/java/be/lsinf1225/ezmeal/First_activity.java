package be.lsinf1225.ezmeal;

import android.content.Intent;
 import android.support.v7.app.AppCompatActivity;
 import android.os.Bundle;
 import android.util.Log;
 import android.view.View;
 import android.widget.Button;

public class First_activity extends AppCompatActivity {

    private Button btnInscription;
    private Button btnConnexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_activity);

        btnInscription = (Button) findViewById(R.id.BtnInscription);
        btnConnexion = (Button) findViewById( R.id.BtnConnexion);

        btnInscription.setOnClickListener(btnInscriptionListener);
        btnConnexion.setOnClickListener(btnConnexionListener);
    }

    private View.OnClickListener btnInscriptionListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(First_activity.this,Inscription.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener btnConnexionListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(First_activity.this,Login.class);
            startActivity(intent);
        }
    };


}
