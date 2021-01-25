package com.example.lesprivatetentor.Fragment.Bimbingan;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.lesprivatetentor.Fragment.Bimbingan.Function.getBimbinganBerjalan;
import com.example.lesprivatetentor.R;

public class BimbinganBerjalanFragment extends Fragment {
    private static final String TAG_TOKEN = "token";
    private getBimbinganBerjalan getBimbinganBerjalan;
    private SharedPreferences sharedPreferences;
    public static final String my_shared_preferences = "my_shared_preferences";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_jadwal_semua, container, false);
        sharedPreferences = getActivity().getSharedPreferences(my_shared_preferences, Context.MODE_PRIVATE);
        String token = sharedPreferences.getString(TAG_TOKEN, "");
        getBimbinganBerjalan = new getBimbinganBerjalan(getActivity());
        System.out.println("token" +token);
        getBimbinganBerjalan.getBimbinganBerjalan(token, "");
        return view;
    }
}
