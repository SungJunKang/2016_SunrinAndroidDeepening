package kr.co.ana.myapplication1226hw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter {
    List<Food> foodList = new ArrayList<>();

    public CustomAdapter(List<Food> foodList) {
        this.foodList = foodList;
    }
    @Override
    public int getCount() {
        return foodList.size();
    }
    @Override
    public Object getItem(int position) {
        return foodList.get(position);
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Food food = foodList.get(position);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);
        ImageView image = (ImageView) view.findViewById(R.id.image);
        TextView name = (TextView) view.findViewById(R.id.food);
        TextView price = (TextView) view.findViewById(R.id.price);
        name.setText(food.getFood());
        price.setText(food.getPrice());
        Glide.with(parent.getContext()).load(food.getImage()).error(R.mipmap.ic_launcher).into(image);
        return view;
    }
}
