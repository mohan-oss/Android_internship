package com.example.book_dsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void arrays(View view) {
        startActivity(new Intent(this,ArraysActivity.class));
    }

    public void LinkedList(View view) {
        startActivity(new Intent(this, LinkedList.class));
    }

}