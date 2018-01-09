package com.jin.todo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView PetList;
    ListView InformList;
    List<PetInform> petList = new ArrayList<>();
    List<Inform> infList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        petList.add(new PetInform("우흥","우흥",1));
        petList.add(new PetInform("좌흥","좌흥",2));
        infList.add(new Inform("우흥",1));
        infList.add(new Inform("좌흥",2));

        PetList = (ListView)findViewById(R.id.Pet);
        InformList = (ListView)findViewById(R.id.Inform);

        InformAdapter infAdapter = new InformAdapter(infList);
        PetAdapter petAdapter = new PetAdapter(petList);

        PetList.setAdapter(petAdapter);
        InformList.setAdapter(infAdapter);
    }
}
