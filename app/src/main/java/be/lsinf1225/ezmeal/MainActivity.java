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

public class MainActivity extends AppCompatActivity {
    android.support.v7.widget.Toolbar toolbar;
    ListView listView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Catégories");
        listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> mAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.categories));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("categories", listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }

        });
        listView.setAdapter(mAdapter);
    }
}