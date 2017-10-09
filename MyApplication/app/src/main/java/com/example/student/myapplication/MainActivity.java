package com.example.student.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v){
        Intent it=new Intent(this, EX2.class);
        startActivity(it);
    }

    public void click2(View v){
        Intent it=new Intent(this, EX3.class);
        startActivity(it);
    }
    public void click3(View v){
        Intent it=new Intent(this, EX4.class);
        startActivity(it);
    }
    public void click4(View v){
        Intent it=new Intent(this, EX5.class);
        startActivity(it);
    }














}
