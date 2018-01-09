package com.sunrin.task04;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    private List<Student> students;

    public CustomAdapter(List<Student> students) {
        this.students = students;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int i) {
        return students.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Context context = viewGroup.getContext();
        Student student = students.get(i);

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_pet, viewGroup, false);
        }

        TextView textName = (TextView) view.findViewById(R.id.text_name);
        TextView textPhone = (TextView) view.findViewById(R.id.text_phone);
        ImageView image = (ImageView) view.findViewById(R.id.image);

        textName.setText("이름 : " + student.getName());
        textPhone.setText("전화번호  : " + student.getPhone());
        Glide.with(viewGroup.getContext()).load(student.getImage()).into(image);

        return view;
    }

}








