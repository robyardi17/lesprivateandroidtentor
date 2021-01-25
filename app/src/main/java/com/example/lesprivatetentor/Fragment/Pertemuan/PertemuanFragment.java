package com.example.lesprivatetentor.Fragment.Pertemuan;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.lesprivatetentor.Fragment.Pertemuan.Function.getPertemuan;
import com.example.lesprivatetentor.R;

public class PertemuanFragment extends Fragment {

    private static final String TAG_TOKEN = "token";
    private getPertemuan getPertemuan;
    private SharedPreferences sharedPreferences;
    public static final String my_shared_preferences = "my_shared_preferences";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_jadwal_semua, container, false);
        sharedPreferences = getActivity().getSharedPreferences(my_shared_preferences, Context.MODE_PRIVATE);
        String token = sharedPreferences.getString(TAG_TOKEN, "");
        getPertemuan = new getPertemuan(getActivity());
        System.out.println("token" +token);
        getPertemuan.getPertemuan(token, "21-01-2021");
        return view;
    }
}