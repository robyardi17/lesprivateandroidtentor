package com.example.lesprivatetentor.Fragment.Pertemuan;

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

import com.example.lesprivatetentor.R;

public class PertemuanFragment extends Fragment {

    private PertemuanViewModel pertemuanViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pertemuanViewModel =
                ViewModelProviders.of(this).get(PertemuanViewModel.class);
        View root = inflater.inflate(R.layout.fragment_pertemuan, container, false);
        final TextView textView = root.findViewById(R.id.text_pertemuan);
        pertemuanViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}