package com.example.lesprivatetentor.Activity.Registrasi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lesprivatetentor.R;

public class RegistrasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        getSupportActionBar().setTitle("Registrasi Akun Untuk Tentor");
    }
}
