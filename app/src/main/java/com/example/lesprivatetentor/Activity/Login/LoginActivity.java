package com.example.lesprivatetentor.Activity.Login;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lesprivatetentor.Activity.LupaPassword.LupaPasswordActivity;
import com.example.lesprivatetentor.Activity.MainActivity;
import com.example.lesprivatetentor.Activity.Registrasi.RegistrasiActivity;
import com.example.lesprivatetentor.Config.Session.Constant;
import com.example.lesprivatetentor.R;
import com.xwray.passwordview.PasswordView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    ProgressDialog progressDialog;
    Button loginButton;
    TextView textViewRegistrasi, textViewLupaPw;
    EditText username_txt;
    PasswordView password_txt;
    public String id, nama, token, email, email_verified, no_hp, asal, domisili, username, password;
    public String role, pend_terakhir, pend_berjalan, jkelamin, peng_mengajar, ringkasan, foto, status, createAt, updateAt;

    ConnectivityManager conMgr;
    SharedPreferences sharedPreferences;
    Boolean session = false;

    public static final String my_shared_preferences = "my_shared_preferences";
    public static final String session_status = "session_status";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login");

        progressDialog = new ProgressDialog(this);

        loginButton = findViewById(R.id.btn_login);
        textViewRegistrasi = findViewById(R.id.tv_registrasi);
        textViewLupaPw = findViewById(R.id.tv_lupapass);
        username_txt = (EditText) findViewById(R.id.txt_username);
        password_txt = (PasswordView) findViewById(R.id.password);

        loginButton.setOnClickListener(this);
        textViewRegistrasi.setOnClickListener(this);
        textViewLupaPw.setOnClickListener(this);

        //check session login
        sharedPreferences = getSharedPreferences(my_shared_preferences, Context.MODE_PRIVATE);
        session = sharedPreferences.getBoolean(session_status, false);
        id = sharedPreferences.getString(Constant.TAG_ID, null);
        email = sharedPreferences.getString(Constant.TAG_EMAIL, null);
        email_verified = sharedPreferences.getString(Constant.TAG_EMAIL_VERIFIED_AT, null);
        username = sharedPreferences.getString(Constant.TAG_USER, null);
        role = sharedPreferences.getString(Constant.TAG_ROLE, null);
        createAt = sharedPreferences.getString(Constant.TAG_CREATE_AT, null);
        updateAt = sharedPreferences.getString(Constant.TAG_UPDATE_AT, null);

        if (session) {
            Toast.makeText(getApplicationContext(), "Selamat datang " + username, Toast.LENGTH_LONG).show();
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            intent.putExtra(Constant.TAG_ID, id);
            intent.putExtra(Constant.TAG_EMAIL, email);
            intent.putExtra(Constant.TAG_EMAIL_VERIFIED_AT, email_verified);
            intent.putExtra(Constant.TAG_USER, username);
            intent.putExtra(Constant.TAG_ROLE, role);
            intent.putExtra(Constant.TAG_CREATE_AT, createAt);
            intent.putExtra(Constant.TAG_UPDATE_AT, updateAt);
            finish();
            startActivity(intent);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_login:
                LoginHandler loginHandler = new LoginHandler(this);
                loginHandler.username = username_txt.getText().toString();
                loginHandler.password = password_txt.getText().toString();

                if (loginHandler.username.trim().isEmpty() || loginHandler.password.trim().isEmpty()) {
                    username_txt.setError("Username/Password tidak boleh kosong");
                    Toast.makeText(getApplicationContext(), "Username/Password tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else {
                    conMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                    if(conMgr.getActiveNetworkInfo() != null && conMgr.getActiveNetworkInfo().isAvailable()
                            && conMgr.getActiveNetworkInfo().isConnected()) {
                        loginHandler.login();
                    } else {
                        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
                        alertDialog.setTitle("Connection Error!");
                        alertDialog.setMessage("Pastikan anda terhubung dengan internet, aktifkan Paket data atau Wifi");
                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                });
                        alertDialog.show();
                    }
                }
                break;
            case R.id.tv_registrasi:
                Intent regis = new Intent(LoginActivity.this, RegistrasiActivity.class);
                startActivity(regis);
                break;
            case R.id.tv_lupapass:
                Intent lupa = new Intent(LoginActivity.this, LupaPasswordActivity.class);
                startActivity(lupa);
                break;

        }
    }
}
