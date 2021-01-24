package com.example.lesprivatetentor.Activity.Notification;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lesprivatetentor.R;

public class NotificationActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nofitication);
        getSupportActionBar().setTitle("Upah");
    }
}