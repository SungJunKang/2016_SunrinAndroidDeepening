package com.jin.todo3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jin on 2016-12-22.
 */
public class InformAdapter extends BaseAdapter {

    List<Inform> infList;

    public InformAdapter(List<Inform> infList){this.infList = infList;}

    @Override
    public int getCount(){ return infList.size();}

    @Override
    public Object getItem(int position){ return infList.get(position);}

    @Override
    public long getItemId(int position){ return 0; }

    @Override
    public  View getView(int position, View convertView, ViewGroup parent){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.inform,null);
        ImageView imageView = (ImageView)view.findViewById(R.id.infImage);
        TextView textname = (TextView)view.findViewById(R.id.infName);
        TextView textnum = (TextView)view.findViewById(R.id.infNum);

        Inform inform = infList.get(position);

        String name = inform.getName();
        String num = String.valueOf(inform.getNum());

        textname.setText(name);
        textnum.setText(num);

        return view;
    }
}
