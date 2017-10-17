package com.example.student.beautysalon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class AboutActivity extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutactivity);
        wv = (WebView) findViewById(R.id.webView);
        //設定網路連線true
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebChromeClient(new WebChromeClient());
        Intent it = getIntent();
        wv.clearCache(true);
        wv.loadUrl("https://android-5bfc6.firebaseapp.com/");
    }
}
