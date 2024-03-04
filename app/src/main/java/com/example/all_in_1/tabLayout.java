package com.example.all_in_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.all_in_1.databinding.ActivityTabLayoutBinding;

public class tabLayout extends AppCompatActivity {
    ActivityTabLayoutBinding b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b= ActivityTabLayoutBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        ViewPagerManager vpm=new ViewPagerManager(getSupportFragmentManager());
        b.vp.setAdapter(vpm);
        b.tl.setupWithViewPager(b.vp);

    }
}