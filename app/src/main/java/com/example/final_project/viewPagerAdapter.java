package com.example.final_project;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class viewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> frgList = new ArrayList<>();
    private final List<String> titleList = new ArrayList<>();
    public viewPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }


    @Override
    public Fragment getItem(int position) {
        return frgList.get(position);
    }

    @Override
    public int getCount() {
        return titleList.size();
    }

    public void addFrg (Fragment frg,String title){
        frgList.add(frg);
        titleList.add(title);
    }

}

