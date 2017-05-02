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


public class Main2Activity extends AppCompatActivity {
    android.support.v7.widget.Toolbar toolbar2;
    ListView listView2;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toolbar2 = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar2);
        toolbar2.setTitle("Sous-catégories");
        listView2 = (ListView) findViewById(R.id.listView2);
        ArrayAdapter<String> mAdapter2 = new ArrayAdapter<>(Main2Activity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.souscategories));
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> adapterView2, View view2, int i2, long l2){
                Intent intent2 = new Intent(Main2Activity.this, Main3Activity.class);
                intent2.putExtra("sous-categories", listView2.getItemAtPosition(i2).toString());
                startActivity(intent2);
            }

        });
        listView2.setAdapter(mAdapter2);
    }
}