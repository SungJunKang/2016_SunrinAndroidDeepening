package kr.co.ana.student1223;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class CustomAdapter extends BaseAdapter{

    List<Student> stus;

    public CustomAdapter(List<Student> stu) {
        this.stus = stu;
    }

    @Override
    public int getCount() {
        return stus.size();
    }

    @Override
    public Object getItem(int position) {
        return stus.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        Student stu = stus.get(position);

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, viewGroup, false);
        }
        ImageView image = (ImageView) view.findViewById(R.id.image);
        Glide.with(viewGroup.getContext()).load("이미지 주소").into(image);
        return null;
    }
}
