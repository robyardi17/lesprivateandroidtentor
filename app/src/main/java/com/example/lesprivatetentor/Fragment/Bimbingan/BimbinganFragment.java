package com.example.lesprivatetentor.Fragment.Bimbingan;

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
import androidx.viewpager.widget.ViewPager;

import com.example.lesprivatetentor.Fragment.Bimbingan.Adapter.BimbinganViewPagerAdapter;
import com.example.lesprivatetentor.R;
import com.google.android.material.tabs.TabLayout;

public class BimbinganFragment extends Fragment implements ViewPager.OnPageChangeListener {

    TabLayout tabLayout;
    ViewPager viewPager;

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bimbingan, container, false);

        tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        BimbinganViewPagerAdapter adapter = new BimbinganViewPagerAdapter(getChildFragmentManager());
        viewPager.setOffscreenPageLimit(2);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(this);
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}