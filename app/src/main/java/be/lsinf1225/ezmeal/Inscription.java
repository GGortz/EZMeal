package be.lsinf1225.ezmeal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


/**
 * Created by User on 24-04-17.
 */

public class Inscription extends AppCompatActivity {
    Spinner spinSexe;
    ArrayAdapter<CharSequence> adapSex;
    
    private Button btnEnter;//prochain layout
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        //Button Enter
        btnEnter = (Button) findViewById(R.id.btnConnexion);//Surement changer BtnEnter
        btnEnter.setOnClickListener(btnEnterListener);

        spinSexe=(Spinner) findViewById(R.id.SpinSex);
        adapSex = ArrayAdapter.createFromResource(this,R.array.SpinSex,android.R.layout.simple_spinner_item);
        adapSex.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinSexe.setAdapter(adapSex);
        spinSexe.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    
    
    // Liaison avec prochain layout pageaccueil.java

    private View.OnClickListener btnEnterListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Inscription.this, pageacceuil.class);
            startActivity(intent);
        }
};
    
    
    
    
}
