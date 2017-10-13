package com.example.student.beautysalon;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactactivity);


    }

    public void clicktel(View view) {
        Uri uri = Uri.parse("tel://0227735243");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }

    public void clickmap(View view) {
        Uri uri = Uri.parse("geo:25.0417025,121.5504265?zoom=15");
        //Uri uri = Uri.parse("geo:0,0?q=巨匠電腦東區認證");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void clickemail(View view) {

    }
}
