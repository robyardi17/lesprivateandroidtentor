package com.example.lesprivatetentor.Fragment.Bimbingan;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.lesprivatetentor.Fragment.Bimbingan.Function.getPermintaanBimbingan;
import com.example.lesprivatetentor.R;

public class PermintaanBimbinganFragment extends Fragment {
    private static final String TAG_TOKEN = "token";
    private getPermintaanBimbingan getPermintaanBimbingan;
    private SharedPreferences sharedPreferences;
    public static final String my_shared_preferences = "my_shared_preferences";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_jadwal_semua, container, false);
        sharedPreferences = getActivity().getSharedPreferences(my_shared_preferences, Context.MODE_PRIVATE);
        String token = sharedPreferences.getString(TAG_TOKEN, "");
        getPermintaanBimbingan = new getPermintaanBimbingan(getActivity());
        System.out.println("token" +token);
        getPermintaanBimbingan.getPermintaanBimbingan(token);
        return view;
    }
}
