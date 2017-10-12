package com.example.student.beautysalon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
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
