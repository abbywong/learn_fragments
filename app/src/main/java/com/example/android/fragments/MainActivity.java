package com.example.android.fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        TitlesFragment fragment = new TitlesFragment();
//        BeibeiFragment fragment = new BeibeiFragment();
//        BeibeiFragment fragment = new BeibeiFragment();
        fragmentTransaction.add(R.id.FragmentContainer, fragment);
        fragmentTransaction.commit();
    }

}

