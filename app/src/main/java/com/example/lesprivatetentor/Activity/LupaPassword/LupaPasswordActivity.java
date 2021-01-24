package com.example.lesprivatetentor.Activity.LupaPassword;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lesprivatetentor.R;

public class LupaPasswordActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password);
        getSupportActionBar().setTitle("Reset Password");
    }
}
