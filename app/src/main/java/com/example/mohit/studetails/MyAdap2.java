package com.example.mohit.studetails;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdap2 extends BaseAdapter {

    Context context;
    private ArrayList<SingleRowCode2> arrt;
    LayoutInflater inflater;

    public MyAdap2(Context context, ArrayList<SingleRowCode2> arrt) {
        this.context = context;
        this.arrt = arrt;
    }

    @Override
    public int getCount() {
        return arrt.size();
    }

    @Override
    public Object getItem(int position) {
        return arrt.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.singlerow2, parent, false);

        //Getting the views
        ImageView iv = view.findViewById(R.id.imv1);
        TextView txtname = view.findViewById(R.id.txtname);
        TextView txtcor = view.findViewById(R.id.txtcourse);
        TextView txtemail = view.findViewById(R.id.txtemail);
        TextView txtgroup = view.findViewById(R.id.txtbgrp);
        TextView txtmob = view.findViewById(R.id.txtmob);

        //Getting data from data source
        SingleRowCode2 ssw= arrt.get(position);
        int image=ssw.getImage();
        String name=ssw.getName();
        String email =ssw.getEmailid();
        String blood = ssw.getBloodgroup();
        String course = ssw.getCourse();
        String mobile = ssw.getMobile();

        //loading data into views
        iv.setImageResource(image);
        txtname.setText(name);
        txtcor.setText(course);
        txtgroup.setText(blood);
        txtemail.setText(email);
        txtmob.setText(mobile);

        return view;
    }
}
