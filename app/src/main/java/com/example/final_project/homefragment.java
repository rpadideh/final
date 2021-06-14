package com.example.final_project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import javax.annotation.Nullable;

public class homefragment<container> extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home,container,false);
    }


    private BottomNavigationView.OnNavigationItemSelectedListener navlistener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()){

                        case R.id.home:
                            selectedFragment=new homefragment<>();
                            break;

                        case R.id.wallet:
                            selectedFragment=new walletfragment<>();
                            break;

                        case R.id.income:
                            selectedFragment=new incomefragment<>();
                            break;

                        case R.id.used:
                            selectedFragment=new usedfragment<>();
                            break;

                        case R.id.logout:
                            selectedFragment=new logoutfragment<>();
                            break;

                    }
                    

                    return true;
                }
            };
    }

