package be.lsinf1225.ezmeal;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Catalogue extends AppCompatActivity {

        ListView catalogue;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_catalogue);

                catalogue = (ListView) findViewById(R.id.cataloguederecette);
                ArrayAdapter<String> catalogueAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.catalogue));
                catalogue.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                                Intent intent = new Intent(Catalogue.this, AfficherRecette.class);
                                //intent.putExtra("categories", catalogue.getItemAtPosition(i).toString());
                                startActivity(intent);
                        }
                });

                catalogue.setAdapter(catalogueAdapter);



        }
}

