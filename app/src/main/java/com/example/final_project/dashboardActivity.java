package com.example.final_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class dashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_dashboard );

        ViewPager vp = findViewById ( R.id.viewpager2 );
        PagerAdapter PA = new PagerAdapter ( getSupportFragmentManager ( ) );
        vp.setAdapter ( PA );
        TabLayout tL = findViewById ( R.id.tabl);
        tL.setupWithViewPager ( vp );
    }
}