package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button toast, countplus, countminus;
    TextView tv;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast = findViewById(R.id.toast);
        countplus = findViewById(R.id.countplus);
        countminus = findViewById(R.id.countminus);
        tv = findViewById(R.id.tv);
        countplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i>=0 && i<12){
                    i++;
                }
                tv.setText("" + i);
            }
        });
        countminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i>0){
                    i--;
                }
                else if(i==0){
                    i=12;
                }
                tv.setText("" + i);
            }
        });
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "WELCOME TO ANDROID.YOUR COUNT IS " + i,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}