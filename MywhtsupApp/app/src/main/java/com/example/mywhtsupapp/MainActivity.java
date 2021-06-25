package com.example.mywhtsupapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChangeFragment(View view) {
        Fragment fragment;
        if(view==findViewById(R.id.chat)){
            fragment= new chatsFragment();
            FragmentManager fm = getFragmentManager () ;
            FragmentTransaction ft = fm. beginTransaction () ;
            ft.replace (R. id. frag, fragment) ;
            ft.commit();

        }
        if(view==findViewById(R.id.stat)){
            fragment =new StatusFragment();
            FragmentManager fm = getFragmentManager () ;
            FragmentTransaction ft = fm. beginTransaction () ;
            ft.replace (R.id.frag, fragment) ;
            ft.commit();
        }
        if(view ==findViewById(R.id.call)){
            fragment=new CallsFragment();
            FragmentManager fm = getFragmentManager () ;
            FragmentTransaction ft = fm. beginTransaction () ;
            ft.replace (R. id. frag, fragment) ;
            ft.commit();
        }

    }
}