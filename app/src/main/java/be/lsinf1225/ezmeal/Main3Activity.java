package be.lsinf1225.ezmeal;
        import android.content.Intent;
        import android.os.Build;
        import android.support.annotation.RequiresApi;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
        import android.widget.Toolbar;
        import be.lsinf1225.ezmeal.R;

public class Main3Activity extends AppCompatActivity {
    android.support.v7.widget.Toolbar toolbar3;
    ListView listView3;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        toolbar3 = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar3);
        toolbar3.setTitle("Recettes");
        listView3 = (ListView) findViewById(R.id.listView3);
        ArrayAdapter<String> mAdapter3 = new ArrayAdapter<>(Main3Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.recettes));
        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> adapterView3, View view3, int i3, long l3){
                Intent intent3 = new Intent(Main3Activity.this, Main4Activity.class);
                intent3.putExtra("sous-categories", listView3.getItemAtPosition(i3).toString());
                startActivity(intent3);
            }

        });
        listView3.setAdapter(mAdapter3);
    }
}