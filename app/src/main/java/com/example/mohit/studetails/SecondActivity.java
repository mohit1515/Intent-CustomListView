package com.example.mohit.studetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private ListView llv;
    private ArrayList<SingleRowCode2> arlt;
    private SingleRowCode2 ss2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        llv = findViewById(R.id.llv1);

        Bundle bundle =getIntent().getExtras();
        String name= bundle.getString("name_key");
        int image = bundle.getInt("image_key");
        String mobile = bundle.getString("mob_key");
        String course = bundle.getString("course_key");
        String email = bundle.getString("email_key");
        String blood = bundle.getString("Blood_key");


        arlt = new ArrayList<>();
        ss2 = new SingleRowCode2(name,course,mobile, image, blood, email);
        arlt.add(ss2);

        MyAdap2 mm = new MyAdap2(this, arlt);
        llv.setAdapter(mm);
    }
}
