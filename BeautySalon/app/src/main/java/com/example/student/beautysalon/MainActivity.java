package com.example.student.beautysalon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnnews,btnabout,btnquery,btncontact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnnews=(Button)findViewById(R.id.btnnews);
        btnabout=(Button)findViewById(R.id.btnabout);
        btnquery=(Button)findViewById(R.id.btnquery);
        btncontact=(Button)findViewById(R.id.btncontact);
    }
    public void clicknews(View v){
        Intent it=new Intent(this, NewsActivity.class);
        startActivity(it);
    }

    public void clickabout(View v){
        Intent it=new Intent(this, AboutActivity.class);
        startActivity(it);
    }
    public void clickquery(View v){
        Intent it=new Intent(this, QueryActivity.class);
        startActivity(it);
    }
    public void clickcontact(View v){
        Intent it=new Intent(this, ContactActivity.class);
        startActivity(it);
    }



}
