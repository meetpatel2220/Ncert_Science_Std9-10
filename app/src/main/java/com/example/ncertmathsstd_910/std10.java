package com.example.ncertmathsstd_910;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class std10 extends AppCompatActivity {
    Button all,test,formula;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_std10);


        all=findViewById(R.id.allquestion);
        test=findViewById(R.id.test);
        formula=findViewById(R.id.formula);


        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in=new Intent(std10.this,allquestionstd10.class);
                startActivity(in);

            }
        });

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in=new Intent(std10.this,teststd10.class);
                startActivity(in);

            }
        });

        formula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in=new Intent(std10.this,formulastd10.class);
                startActivity(in);

            }
        });


    }
}
