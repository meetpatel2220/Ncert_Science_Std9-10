package com.example.ncertmathsstd_910;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class allquestionstd10 extends AppCompatActivity {

    Button ch1,ch15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allquestionstd10);

        ch1=findViewById(R.id.ch1);
        ch15=findViewById(R.id.ch15);

        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(allquestionstd10.this,ch1std10.class);
                startActivity(in);

            }
        });

        ch15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(allquestionstd10.this,ch15std10.class);
                startActivity(in);

            }
        });


    }
}
