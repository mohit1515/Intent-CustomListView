package com.example.mohit.studetails;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdap extends BaseAdapter {

    Context context;
    ArrayList<SingleRowCode> arrr;
    LayoutInflater inflater;

    public MyAdap(Context context, ArrayList<SingleRowCode> arrr) {
        this.context = context;
        this.arrr = arrr;
    }

    @Override
    public int getCount() {
        return arrr.size();
    }

    @Override
    public Object getItem(int position) {
        return arrr.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.activity_single_row, parent, false);

        //Getting the views
        ImageView iv = view.findViewById(R.id.iv1);
        TextView txtName = view.findViewById(R.id.txtname);

        //Getting data from data source
        SingleRowCode ssw= arrr.get(position);
        int image=ssw.getImage();
        String name=ssw.getName();

        //loading data into views
        iv.setImageResource(image);
        txtName.setText(name);

    return view;
    }
}
