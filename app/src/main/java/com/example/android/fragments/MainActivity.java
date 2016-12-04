package com.example.android.fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

//import android.support.v4.app.Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}
//        setContentView(R.layout.fragment_titles);
    public void onFragmentActivated(View v) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        TitlesFragment fragment = new TitlesFragment();
//        TitlesFragment fragment2 = new TitlesFragment();
//        TitlesFragment fragment3 = new TitlesFragment();
        fragmentTransaction.add(R.id.FragmentContainer, fragment);
        fragmentTransaction.commit();

//        @Override
//            super.onCreate(savedInstanceState);
//
//            setContentView(R.layout.activity_main);
//        }
    }}

