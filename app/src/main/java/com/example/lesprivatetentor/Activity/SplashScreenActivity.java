package com.example.lesprivatetentor.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lesprivatetentor.Activity.Login.LoginActivity;
import com.example.lesprivatetentor.R;

public class SplashScreenActivity extends AppCompatActivity {
    private int time_loading = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash_screen);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent login = new Intent(SplashScreenActivity.this, LoginActivity.class);
//                Intent login = new Intent(SplashScreenActivity.this, WebViewActivity.class);
                startActivity(login);
                finish();
            }
        }, time_loading);
    }
}
