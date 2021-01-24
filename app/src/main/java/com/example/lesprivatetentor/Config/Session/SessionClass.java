package com.example.lesprivatetentor.Config.Session;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class SessionClass {
    public static final String my_shared_preferences = "my_shared_preferences";
    public static final String session_status = "session_status";

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private Constant constant;
    private Activity activity;

    public  Boolean session = false;
    public String id, nama, token, email, emailverified, no_hp, asal, domisili, username, password, role;
    public String pend_terakhir, pend_berjalan, jkelamin, peng_mengajar, ringkasan, foto, status, createAt, updateAt;

    public SessionClass(Activity activity) {
        this.activity = activity;
        this.sharedPreferences = activity.getSharedPreferences(my_shared_preferences, Context.MODE_PRIVATE);
        this.constant = new Constant();
    }

    public void saveSession() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(session_status, true);
        editor.putString(Constant.TAG_ID, id);
        editor.putString(Constant.TAG_EMAIL, email);
        editor.putString(Constant.TAG_EMAIL_VERIFIED_AT, emailverified);
        editor.putString(Constant.TAG_USER, username);
        editor.putString(Constant.TAG_ROLE, role);
        editor.putString(Constant.TAG_CREATE_AT, createAt);
        editor.putString(Constant.TAG_UPDATE_AT, updateAt);
        editor.putString(Constant.TAG_TOKEN, token);
        editor.commit();
    }

    public void updateFoto(){

    }
}
