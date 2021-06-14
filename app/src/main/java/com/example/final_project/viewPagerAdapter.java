package com.example.final_project;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

class PagerAdapter extends FragmentStatePagerAdapter
{

    private final  int pageCount=4;
    private String[] tabTitles =new  String[] {"wallet","used","home","income","logout"};
    PagerAdapter(@NonNull FragmentManager fm) {
        super ( fm ,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT );
    }
    @NonNull
    @Override
    public Fragment getItem(int position){
        switch (position) {
            case 0:
                return new walletfragment ( );
            case 1:
                return new usedfragment( );
            case 2:
                return new homefragment( );
            case 3:
                return new incomefragment( );
            case 4:
                return new logoutfragment( );
            default:

                return null;
        }
    }
    @Override
    public  int getCount(){
        return pageCount;
    }
    @NonNull
    @Override
    public  CharSequence getPageTitle(int position){
        return  tabTitles[position];
    }
}



