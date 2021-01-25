package com.example.lesprivatetentor.Fragment.Jadwal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.lesprivatetentor.Fragment.Jadwal.Function.getJadwalSkr;
import com.example.lesprivatetentor.R;

public class JadwalSkrFragment extends Fragment {

    private static final String TAG_TOKEN = "token";
    private getJadwalSkr getJadwalSkr;
    private SharedPreferences sharedPreferences;
    public static final String my_shared_preferences = "my_shared_preferences";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_jadwal_skr, container, false);
        sharedPreferences = getActivity().getSharedPreferences(my_shared_preferences, Context.MODE_PRIVATE);
        String token = sharedPreferences.getString(TAG_TOKEN, "");
        getJadwalSkr = new getJadwalSkr(getActivity());
        getJadwalSkr.token = token;
        getJadwalSkr.getJadwalSekarang(view);
        return view;
    }
}
