package com.example.android.fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.fragment_titles);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        TitlesFragment fragContent = new TitlesFragment();
        fragmentTransaction.add(R.id.FragmentContainer, fragContent);
        fragmentTransaction.commit();

//        @Override
//            super.onCreate(savedInstanceState);
//
//            setContentView(R.layout.activity_main);
//        }
    }
}
