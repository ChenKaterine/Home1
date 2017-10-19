package com.example.student.beautysalon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class NewsDetail extends AppCompatActivity {
    WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);
        WebView wv1;
        wv1 = (WebView) findViewById(R.id.webView1);
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.setWebChromeClient(new WebChromeClient());
        Intent it = getIntent();
        String url = it.getStringExtra("link");
        wv1.loadUrl(url);
//
//        WebSettings settings=wv1.getSettings();
//        settings.setJavaScriptEnabled(true);
//        settings.setSupportZoom(true);
//        settings.setBuiltInZoomControls(true);
//         settings.setDisplayZoomControls(false);
    }
}
