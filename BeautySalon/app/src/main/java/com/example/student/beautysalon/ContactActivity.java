package com.example.student.beautysalon;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ContactActivity extends AppCompatActivity {
    ImageView image3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactactivity);


    }

    public void clicktel(View view) {
        Uri uri = Uri.parse("tel:0227735243");
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

        Intent intent = new Intent(Intent.ACTION_SENDTO); // it's not ACTION_SEND
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "請問Beauty Salon");
        intent.putExtra(Intent.EXTRA_TEXT, "我是...");
        intent.setData(Uri.parse("mailto:chen.katerine@gmail.com")); // or just "mailto:" for blank
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this will make such that when user returns to your app, your app is displayed, instead of the email app.
        startActivity(intent);
    }

    public void clicktalk(View view) {
        final String PACKAGE_NAME = "jp.naver.line.android";
        final String CLASS_NAME = "jp.naver.line.android.activity.selectchat.SelectChatActivity";
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setClassName(PACKAGE_NAME, CLASS_NAME);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "Hello");
        startActivity(intent);
    }
}
