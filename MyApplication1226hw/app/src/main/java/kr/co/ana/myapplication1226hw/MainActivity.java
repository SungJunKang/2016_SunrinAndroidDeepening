package kr.co.ana.myapplication1226hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private EditText edit_name, edit_price, edit_image;
    private List<Food> foodList = new ArrayList<>();
    private Realm realm;
    private Button bt_save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Realm.init(getApplicationContext());
        realm = Realm.getDefaultInstance();

        listView = (ListView) findViewById(R.id.list);
        edit_name = (EditText) findViewById(R.id.et_food);
        edit_price = (EditText) findViewById(R.id.et_price);
        edit_image = (EditText) findViewById(R.id.et_image);
        bt_save = (Button) findViewById(R.id.save);

        bt_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edit_name.getText().toString();
                String price = edit_price.getText().toString();
                String image = edit_image.getText().toString();
                realm.beginTransaction();

                Food food = realm.createObject(Food.class);
                food.setFood(name);
                food.setPrice(price);
                food.setImage(image);
                realm.commitTransaction();
                CustomAdapter adapter = new CustomAdapter(getFoodList());
                listView.setAdapter(adapter);
                }
        });
        CustomAdapter adapter = new CustomAdapter(getFoodList());
        listView.setAdapter(adapter);

    }
}
