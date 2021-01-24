package com.example.lesprivatetentor.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.lesprivatetentor.R;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        getSupportActionBar().setTitle("Web");
        WebView web = (WebView) findViewById(R.id.web_view);
        web.loadUrl("http://10.0.2.2:8000/");
        web.setWebViewClient(new WebViewClient());
    }
}