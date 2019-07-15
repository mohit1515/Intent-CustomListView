package com.example.mohit.studetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lllv;
    ArrayList<SingleRowCode> aar;

    SingleRowCode s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lllv=findViewById(R.id.llv);

        final String[] name={"Mohit Mohindru", "Ekansh Goel", "Munish Salgotra","Barinder","AjitPal Singh","Davinder"};
        final int []image = {R.drawable.mohit,R.drawable.pic,R.drawable.pic,R.drawable.pic,R.drawable.pic,R.drawable.pic};
        final String[] number = {"1234567890", "2222222222", "3333333333","4444444444", "5555555555", "6666666666"};
        final String[] course = {"Android","Android","Android","Android","Android","Android"};
        final String[] emailid = {"mohit@gmail.com", "Ekansh@gmail.com", "munish@gmail.com", "barinder@gmail.com", "ajit@gmail.com","davinder@gmail.com"};
        final String[] bloodgrp = {"B+","O+","A+","B+","O+","A+"};
        aar = new ArrayList<>();
        for (int i =0;i<name.length;i++){
            s=new SingleRowCode(name[i],image[i]);
            aar.add(s);
        }

        MyAdap aadd = new MyAdap(this, aar);
        lllv.setAdapter(aadd);

        lllv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0)
                {
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class );
                    intent.putExtra("name_key", name[0]);
                    intent.putExtra("image_key", image[0]);
                    intent.putExtra("email_key", emailid[0] );
                    intent.putExtra("mob_key", number[0]);
                    intent.putExtra("course_key", course[0]);
                    intent.putExtra("Blood_key", bloodgrp[0]);

                    startActivity(intent);
                }

                if(position == 1)
                {
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class );
                    intent.putExtra("name_key", name[1]);
                    intent.putExtra("image_key", image[1]);
                    intent.putExtra("email_key", emailid[1] );
                    intent.putExtra("mob_key", number[1]);
                    intent.putExtra("course_key", course[1]);
                    intent.putExtra("Blood_key", bloodgrp[1]);
                    startActivity(intent);
                }

                if(position == 2)
                {
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class );
                    intent.putExtra("name_key", name[2]);
                    intent.putExtra("image_key", image[2]);
                    intent.putExtra("email_key", emailid[2] );
                    intent.putExtra("mob_key", number[2]);
                    intent.putExtra("course_key", course[2]);
                    intent.putExtra("Blood_key", bloodgrp[2]);
                    startActivity(intent);
                }

                if(position == 3)
                {
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class );
                    intent.putExtra("name_key", name[3]);
                    intent.putExtra("image_key", image[3]);
                    intent.putExtra("mob_key", number[3]);
                    intent.putExtra("course_key", course[3]);
                    intent.putExtra("Blood_key", bloodgrp[3]);
                    intent.putExtra("email_key", emailid[3] );
                    startActivity(intent);
                }

                if(position == 4)
                {
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class );
                    intent.putExtra("name_key", name[4]);
                    intent.putExtra("image_key", image[4]);
                    intent.putExtra("Blood_key", bloodgrp[4]);
                    intent.putExtra("email_key", emailid[4] );
                    intent.putExtra("mob_key", number[4]);
                    intent.putExtra("course_key", course[4]);
                    startActivity(intent);
                }

                if(position == 5)
                {
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class );
                    intent.putExtra("name_key", name[5]);
                    intent.putExtra("image_key", image[5]);
                    intent.putExtra("Blood_key", bloodgrp[5]);
                    intent.putExtra("email_key", emailid[5] );
                    intent.putExtra("mob_key", number[5]);
                    intent.putExtra("course_key", course[5]);
                    startActivity(intent);
                }
            }
        });
    }
}
