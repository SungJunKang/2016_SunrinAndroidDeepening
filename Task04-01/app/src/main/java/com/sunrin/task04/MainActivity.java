package com.sunrin.task04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private CustomAdapter customAdapter;
    private List<Student> students = new ArrayList<>();

    private EditText editPhone, editName, editImage;
    private Button btnSave;


    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Realm.init(getApplicationContext());
        realm = Realm.getDefaultInstance();

        editImage = (EditText) findViewById(R.id.editImage);
        editName = (EditText) findViewById(R.id.editName);
        editPhone = (EditText) findViewById(R.id.editPhone);

        btnSave = (Button) findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                String phone = editPhone.getText().toString();
                String image = editImage.getText().toString();

                //DB 시작
                realm.beginTransaction();
                Student student = realm.createObject(Student.class);
                student.setPhone(phone);
                student.setName(name);
                student.setImage(image);
                //DB 끝
                realm.commitTransaction();

                //adapter를 다시 선언
                customAdapter = new CustomAdapter(getStudents());
                listView.setAdapter(customAdapter);

            }
        });


        customAdapter = new CustomAdapter(getStudents());
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                RealmResults<Student> all = realm.where(Student.class).findAll();
                Student student = all.get(position);

                realm.beginTransaction();
                student.deleteFromRealm();
                realm.commitTransaction();

                customAdapter = new CustomAdapter(getStudents());
                listView.setAdapter(customAdapter);
            }
        });
    }

    private List<Student> getStudents() {
        //조회
        RealmResults<Student> all = realm.where(Student.class).findAll();
        students = new ArrayList<>();
        for (int i = 0; i < all.size(); i++) {
            students.add(all.get(i));
        }
        return students;

    }


}










