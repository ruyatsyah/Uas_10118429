package com.example.a10118429_uas;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;
//    tanggal pengerjaan 11/08/2021
//    Nama  : Ruyatsyah
//    Nim   : 10118429
//    Kelas : IF10

public class SlidePagerAdapter extends FragmentStatePagerAdapter {


    private List<Fragment> fragmentList;

    public SlidePagerAdapter(FragmentManager fm,List<Fragment> fragmentList){

        super(fm);
        this.fragmentList = fragmentList;

    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
