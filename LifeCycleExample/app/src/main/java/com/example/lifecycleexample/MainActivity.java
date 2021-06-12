package com.example.lifecycleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("APSSDC","ActivityCreated");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("APSSDC","ActivityCreated");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("APSSDC","ActivityResumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("APSSDC","Activitypaused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("APSSDC","Activitystopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("APSSDC","Activityrestarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("APSSDC","ActivityDestroyed");
    }

    public void next (View view) {

        startActivity (new Intent(  MainActivity . this, SecondActivity . class) );

    }
}