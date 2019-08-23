package com.example.ncertmathsstd_910;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ch1std9 extends AppCompatActivity {

     Button b1a,b1b,b1c,b1d,
            b2a,b2b,b2c,b2d,
            b3a,b3b,b3c,b3d,
            b4a,b4b,b4c,b4d,
            b5a,b5b,b5c,b5d,
            b6a,b6b,b6c,b6d,
            b7a,b7b,b7c,b7d,
            b8a,b8b,b8c,b8d;

      int b1=0;
     int b2=0;
     int b3=0;
     int b4=0;
     int b5=0;
     int b6=0;
     int b7=0;
     int b8=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch1std9);


        b1a=findViewById(R.id.b1a);
        b1b=findViewById(R.id.b1b);
        b1c=findViewById(R.id.b1c);
        b1d=findViewById(R.id.b1d);

        b2a=findViewById(R.id.b2a);
        b2b=findViewById(R.id.b2b);
        b2c=findViewById(R.id.b2c);
        b2d=findViewById(R.id.b2d);

        b3a=findViewById(R.id.b3a);
        b3b=findViewById(R.id.b3b);
        b3c=findViewById(R.id.b3c);
        b3d=findViewById(R.id.b3d);

        b4a=findViewById(R.id.b4a);
        b4b=findViewById(R.id.b4b);
        b4c=findViewById(R.id.b4c);
        b4d=findViewById(R.id.b4d);

        b5a=findViewById(R.id.b5a);
        b5b=findViewById(R.id.b5b);
        b5c=findViewById(R.id.b5c);
        b5d=findViewById(R.id.b5d);

        b6a=findViewById(R.id.b6a);
        b6b=findViewById(R.id.b6b);
        b6c=findViewById(R.id.b6c);
        b6d=findViewById(R.id.b6d);

        b7a=findViewById(R.id.b7a);
        b7b=findViewById(R.id.b7b);
        b7c=findViewById(R.id.b7c);
        b7d=findViewById(R.id.b7d);

        b8a=findViewById(R.id.b8a);
        b8b=findViewById(R.id.b8b);
        b8c=findViewById(R.id.b8c);
        b8d=findViewById(R.id.b8d);


        b1a.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                if(b1==0){
                    b1a.setBackgroundColor(getColor(R.color.tru));
                    b1b.setBackground(getDrawable(R.drawable.back5));
                    b1c.setBackground(getDrawable(R.drawable.back5));
                    b1d.setBackground(getDrawable(R.drawable.back5));
                    b1=1;
                }
              else {

                  int k=0;
                }


            }
        });

        b1b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b1a.setBackgroundColor(getColor(R.color.tru));
                b1b.setBackgroundColor(getColor(R.color.fals));
                b1c.setBackground(getDrawable(R.drawable.back5));
                b1d.setBackground(getDrawable(R.drawable.back5));
           b1=1;

            }
        });

        b1c.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b1a.setBackgroundColor(getColor(R.color.tru));
                b1b.setBackground(getDrawable(R.drawable.back5));
                b1c.setBackgroundColor(getColor(R.color.fals));
                b1d.setBackground(getDrawable(R.drawable.back5));
                   b1=1;

            }
        });

        b1d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b1a.setBackgroundColor(getColor(R.color.tru));
                b1b.setBackground(getDrawable(R.drawable.back5));
                b1c.setBackground(getDrawable(R.drawable.back5));
                b1d.setBackgroundColor(getColor(R.color.fals));
            b1=1;

            }
        });

        b2a.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b2a.setBackgroundColor(getColor(R.color.fals));
                b2b.setBackgroundColor(getColor(R.color.tru));
                b2c.setBackground(getDrawable(R.drawable.back5));
                b2d.setBackground(getDrawable(R.drawable.back5));
        b2=1;

            }
        });
        b2b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                if(b2==0){

                    b2a.setBackground(getDrawable(R.drawable.back5));
                    b2b.setBackgroundColor(getColor(R.color.tru));
                    b2c.setBackground(getDrawable(R.drawable.back5));
                    b2d.setBackground(getDrawable(R.drawable.back5));
                    b2=1;

                }else {
                    int k=1;
                }


            }
        });
        b2c.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b2a.setBackground(getDrawable(R.drawable.back5));
                b2b.setBackgroundColor(getColor(R.color.tru));
                b2c.setBackgroundColor(getColor(R.color.fals));
                b2d.setBackground(getDrawable(R.drawable.back5));
             b2=1;

            }
        });
        b2d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b2a.setBackground(getDrawable(R.drawable.back5));
                b2b.setBackgroundColor(getColor(R.color.tru));
                b2c.setBackground(getDrawable(R.drawable.back5));
                b2d.setBackgroundColor(getColor(R.color.fals));
            b2=1;

            }
        });

        b3a.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b3a.setBackgroundColor(getColor(R.color.fals));
                b3b.setBackground(getDrawable(R.drawable.back5));
                b3c.setBackgroundColor(getColor(R.color.tru));
                b3d.setBackground(getDrawable(R.drawable.back5));
            b3=1;

            }
        });

        b3b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                b3a.setBackground(getDrawable(R.drawable.back5));
                b3b.setBackgroundColor(getColor(R.color.fals));
                b3c.setBackgroundColor(getColor(R.color.tru));
                b3d.setBackground(getDrawable(R.drawable.back5));
            b3=1;

            }
        });

        b3c.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                if(b3==0){

                    b3a.setBackground(getDrawable(R.drawable.back5));
                    b3b.setBackground(getDrawable(R.drawable.back5));
                    b3c.setBackgroundColor(getColor(R.color.tru));
                    b3d.setBackground(getDrawable(R.drawable.back5));
                    b3=1;

                }else {
                    int k=1;
                }



            }
        });

        b3d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                b3a.setBackground(getDrawable(R.drawable.back5));
                b3b.setBackground(getDrawable(R.drawable.back5));
                b3c.setBackgroundColor(getColor(R.color.tru));
                b3d.setBackgroundColor(getColor(R.color.fals));
               b3=1;

            }
        });

        b4a.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b4a.setBackgroundColor(getColor(R.color.fals));
                b4b.setBackground(getDrawable(R.drawable.back5));
                b4c.setBackgroundColor(getColor(R.color.tru));
                b4d.setBackground(getDrawable(R.drawable.back5));
             b4=1;

            }
        });

        b4b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                b4a.setBackground(getDrawable(R.drawable.back5));
                b4b.setBackgroundColor(getColor(R.color.fals));
                b4c.setBackgroundColor(getColor(R.color.tru));
                b4d.setBackground(getDrawable(R.drawable.back5));
                  b4=1;

            }
        });

        b4c.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                if(b4==0){
                    b4a.setBackground(getDrawable(R.drawable.back5));
                    b4b.setBackground(getDrawable(R.drawable.back5));
                    b4c.setBackgroundColor(getColor(R.color.tru));
                    b4d.setBackground(getDrawable(R.drawable.back5));
                    b4=1;

                }else {

                    int k=0;
                }


            }
        });

        b4d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                b4a.setBackground(getDrawable(R.drawable.back5));
                b4b.setBackground(getDrawable(R.drawable.back5));
                b4c.setBackgroundColor(getColor(R.color.tru));
                b4d.setBackgroundColor(getColor(R.color.fals));
              b4=1;

            }
        });

        b5a.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                if(b5==0){
                    b5a.setBackgroundColor(getColor(R.color.tru));
                    b5b.setBackground(getDrawable(R.drawable.back5));
                    b5c.setBackground(getDrawable(R.drawable.back5));
                    b5d.setBackground(getDrawable(R.drawable.back5));
                    b5=1;

                }
               else {

                   int k=0;
                }

            }
        });

        b5b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b5a.setBackgroundColor(getColor(R.color.tru));
                b5b.setBackgroundColor(getColor(R.color.fals));
                b5c.setBackground(getDrawable(R.drawable.back5));
                b5d.setBackground(getDrawable(R.drawable.back5));
                b5=1;

            }
        });

        b5c.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b5a.setBackgroundColor(getColor(R.color.tru));
                b5b.setBackground(getDrawable(R.drawable.back5));
                b5c.setBackgroundColor(getColor(R.color.fals));
                b5d.setBackground(getDrawable(R.drawable.back5));
               b5=1;

            }
        });

        b5d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b5a.setBackgroundColor(getColor(R.color.tru));
                b5b.setBackground(getDrawable(R.drawable.back5));
                b5c.setBackground(getDrawable(R.drawable.back5));
                b5d.setBackgroundColor(getColor(R.color.fals));
        b5=1;

            }
        });

        b6a.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b6a.setBackgroundColor(getColor(R.color.fals));
                b6b.setBackgroundColor(getColor(R.color.tru));
                b6c.setBackground(getDrawable(R.drawable.back5));
                b6d.setBackground(getDrawable(R.drawable.back5));
      b6=1;

            }
        });
        b6b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                if(b6==0){
                    b6a.setBackground(getDrawable(R.drawable.back5));
                    b6b.setBackgroundColor(getColor(R.color.tru));
                    b6c.setBackground(getDrawable(R.drawable.back5));
                    b6d.setBackground(getDrawable(R.drawable.back5));
              b6=1;

                }else {

                    int k=0;
                }


            }
        });
        b6c.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b6a.setBackground(getDrawable(R.drawable.back5));
                b6b.setBackgroundColor(getColor(R.color.tru));
                b6c.setBackgroundColor(getColor(R.color.fals));
                b6d.setBackground(getDrawable(R.drawable.back5));
         b6=1;

            }
        });
        b6d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b6a.setBackground(getDrawable(R.drawable.back5));
                b6b.setBackgroundColor(getColor(R.color.tru));
                b6c.setBackground(getDrawable(R.drawable.back5));
                b6d.setBackgroundColor(getColor(R.color.fals));
         b6=1;

            }
        });

        b7a.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                if(b7==0){
                    b7a.setBackgroundColor(getColor(R.color.tru));
                    b7b.setBackground(getDrawable(R.drawable.back5));
                    b7c.setBackground(getDrawable(R.drawable.back5));
                    b7d.setBackground(getDrawable(R.drawable.back5));
                    b7=1;
                }else {
                    int k=0;
                }


            }
        });

        b7b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b7a.setBackgroundColor(getColor(R.color.tru));
                b7b.setBackgroundColor(getColor(R.color.fals));
                b7c.setBackground(getDrawable(R.drawable.back5));
                b7d.setBackground(getDrawable(R.drawable.back5));
          b7=1;

            }
        });

        b7c.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b7a.setBackgroundColor(getColor(R.color.tru));
                b7b.setBackground(getDrawable(R.drawable.back5));
                b7c.setBackgroundColor(getColor(R.color.fals));
                b7d.setBackground(getDrawable(R.drawable.back5));
          b7=1;

            }
        });

        b7d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b7a.setBackgroundColor(getColor(R.color.tru));
                b7b.setBackground(getDrawable(R.drawable.back5));
                b7c.setBackground(getDrawable(R.drawable.back5));
                b7d.setBackgroundColor(getColor(R.color.fals));
                b7=1;

            }
        });


        b8a.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                b8a.setBackgroundColor(getColor(R.color.fals));
                b8b.setBackground(getDrawable(R.drawable.back5));
                b8c.setBackground(getDrawable(R.drawable.back5));
                b8d.setBackgroundColor(getColor(R.color.tru));
                b8=1;

            }
        });

        b8b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b8a.setBackground(getDrawable(R.drawable.back5));
                b8b.setBackgroundColor(getColor(R.color.fals));
                b8c.setBackground(getDrawable(R.drawable.back5));
                b8d.setBackgroundColor(getColor(R.color.tru));
                b8=1;



            }
        });

        b8c.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b8a.setBackground(getDrawable(R.drawable.back5));
                b8b.setBackground(getDrawable(R.drawable.back5));
                b8c.setBackgroundColor(getColor(R.color.fals));
                b8d.setBackgroundColor(getColor(R.color.tru));
                b8=1;


            }
        });

        b8d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                if(b8==0){
                    b8a.setBackground(getDrawable(R.drawable.back5));
                    b8b.setBackground(getDrawable(R.drawable.back5));
                    b8c.setBackground(getDrawable(R.drawable.back5));
                    b8d.setBackgroundColor(getColor(R.color.tru));
                    b8=1;

                }else {
                    int k=0;
                }


            }
        });


    }
}
