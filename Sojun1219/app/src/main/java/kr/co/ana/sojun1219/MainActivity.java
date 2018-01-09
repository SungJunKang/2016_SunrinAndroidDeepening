package kr.co.ana.sojun1219;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView listView;

    String[] ITEMS = {"크리스마스", "솔로", "개이득"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ITEMS);

        listView.setAdapter(adapter);
    }
}
