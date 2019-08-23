package com.example.ncertmathsstd_910;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Thread t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

t=new Thread(){


    @Override
    public void run() {
        try{
            Thread.sleep(700);
            Intent in = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(in);
            finish();


        }
        catch (Exception e){

        }

    }
};
        t.start();







    }
}
