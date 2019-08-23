package com.example.ncertmathsstd_910;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Main2Activity extends AppCompatActivity {

    CardView std9,std10,settings,about;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        std9=findViewById(R.id.std9);
        std10=findViewById(R.id.std10);
        settings=findViewById(R.id.settings);
        about=findViewById(R.id.about);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        std9.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              Intent in=new Intent(Main2Activity.this,std9.class);
              startActivity(in);

       }
       });
        std10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Main2Activity.this,std10.class);
                startActivity(in);

            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Main2Activity.this,setting.class);
                startActivity(in);



            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Main2Activity.this,about.class);
                startActivity(in);


            }
        });


    }
}
