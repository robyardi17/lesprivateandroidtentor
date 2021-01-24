package com.example.lesprivatetentor.Fragment.Jadwal.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.lesprivatetentor.Fragment.Jadwal.JadwalSemuaFragment;
import com.example.lesprivatetentor.Fragment.Jadwal.JadwalSkrFragment;

public class JadwalViewPagerAdapter extends FragmentPagerAdapter {

    public JadwalViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0) {
            fragment = new JadwalSkrFragment();
        } else if (position == 1) {
            fragment = new JadwalSemuaFragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;

        if (position == 0) {
            title = "Jadwal Sekarang";
        } else if (position == 1) {
            title = "Semua Jadwal";
        }

        return title;
    }
}
