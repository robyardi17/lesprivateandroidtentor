package com.example.lesprivatetentor.Fragment.Bimbingan.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.lesprivatetentor.Fragment.Bimbingan.BimbinganBerjalanFragment;
import com.example.lesprivatetentor.Fragment.Bimbingan.PermintaanBimbinganFragment;
import com.example.lesprivatetentor.Fragment.Jadwal.JadwalSemuaFragment;
import com.example.lesprivatetentor.Fragment.Jadwal.JadwalSkrFragment;

public class BimbinganViewPagerAdapter extends FragmentPagerAdapter {

    public BimbinganViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0) {
            fragment = new PermintaanBimbinganFragment();
        } else if (position == 1) {
            fragment = new BimbinganBerjalanFragment();
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
            title = "Permintaan Bimbingann";
        } else if (position == 1) {
            title = "Bimbingann Sekarang";
        }

        return title;
    }
}
