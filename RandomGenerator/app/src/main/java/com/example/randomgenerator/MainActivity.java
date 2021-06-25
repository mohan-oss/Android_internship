package com.example.randomgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {
    Button enter,reset;
    TextView generate;
    int b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter=findViewById(R.id.enter);
        reset=findViewById(R.id.reset);
        generate=findViewById(R.id.generate);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int min = 1;
                int max = 6;
                b = (int)(Math.random()*(max-min+1)+min);
                //System.out.println(b);
                generate.setText(""+b);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //b=0;
                generate.setText("Generate");
            }
        });
    }
}