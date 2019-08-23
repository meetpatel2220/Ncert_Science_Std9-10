package com.example.ncertmathsstd_910;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class std9 extends AppCompatActivity {
Button all,test,formula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_std9);


        all=findViewById(R.id.allquestion);
        test=findViewById(R.id.test);
        formula=findViewById(R.id.formula);


        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in=new Intent(std9.this,allquestionstd9.class);
                startActivity(in);

            }
        });

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in=new Intent(std9.this,teststd9.class);
                startActivity(in);

            }
        });

        formula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in=new Intent(std9.this,formulastd9.class);
                startActivity(in);

            }
        });





    }
}
