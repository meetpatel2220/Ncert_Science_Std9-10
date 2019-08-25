package com.example.ncertmathsstd_910;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ch15std10 extends AppCompatActivity {

    Button b1a,b1b,b1c,b1d,
            b2a,b2b,b2c,b2d,
            b3a,b3b,b3c,b3d,
            b4a,b4b,b4c,b4d,
            b5a,b5b,b5c,b5d,
            b6a,b6b,b6c,b6d,
            b7a,b7b,b7c,b7d,
            b8a,b8b,b8c,b8d,
            b9a,b9b,b9c,b9d,
            b10a,b10b,b10c,b10d,
            b11a,b11b,b11c,b11d,
            b12a,b12b,b12c,b12d,
            b13a,b13b,b13c,b13d;

    int b1=0;
    int b2=0;
    int b3=0;
    int b4=0;
    int b5=0;
    int b6=0;
    int b7=0;
    int b8=0;
    int b9=0;
    int b10=0;
    int b11=0;
    int b12=0;
    int b13=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch15std10);

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

        b9a=findViewById(R.id.b9a);
        b9b=findViewById(R.id.b9b);
        b9c=findViewById(R.id.b9c);
        b9d=findViewById(R.id.b9d);

        b10a=findViewById(R.id.b10a);
        b10b=findViewById(R.id.b10b);
        b10c=findViewById(R.id.b10c);
        b10d=findViewById(R.id.b10d);

        b11a=findViewById(R.id.b11a);
        b11b=findViewById(R.id.b11b);
        b11c=findViewById(R.id.b11c);
        b11d=findViewById(R.id.b11d);

        b12a=findViewById(R.id.b12a);
        b12b=findViewById(R.id.b12b);
        b12c=findViewById(R.id.b12c);
        b12d=findViewById(R.id.b12d);

        b13a=findViewById(R.id.b13a);
        b13b=findViewById(R.id.b13b);
        b13c=findViewById(R.id.b13c);
        b13d=findViewById(R.id.b13d);

        b1a.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b1a.setBackgroundColor(getColor(R.color.fals));
                b1b.setBackgroundColor(getColor(R.color.tru));
                b1c.setBackground(getDrawable(R.drawable.back5));
                b1d.setBackground(getDrawable(R.drawable.back5));
                b1=1;

            }
        });
        b1b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                if(b1==0){

                    b1a.setBackground(getDrawable(R.drawable.back5));
                    b1b.setBackgroundColor(getColor(R.color.tru));
                    b1c.setBackground(getDrawable(R.drawable.back5));
                    b1d.setBackground(getDrawable(R.drawable.back5));
                    b1=1;

                }else {
                    int k=1;
                }


            }
        });
        b1c.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b1a.setBackground(getDrawable(R.drawable.back5));
                b1b.setBackgroundColor(getColor(R.color.tru));
                b1c.setBackgroundColor(getColor(R.color.fals));
                b1d.setBackground(getDrawable(R.drawable.back5));
                b1=1;

            }
        });
        b1d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b1a.setBackground(getDrawable(R.drawable.back5));
                b1b.setBackgroundColor(getColor(R.color.tru));
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
                b2b.setBackground(getDrawable(R.drawable.back5));
                b2c.setBackgroundColor(getColor(R.color.tru));
                b2d.setBackground(getDrawable(R.drawable.back5));
                b2=1;

            }
        });

        b2b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                b2a.setBackground(getDrawable(R.drawable.back5));
                b2b.setBackgroundColor(getColor(R.color.fals));
                b2c.setBackgroundColor(getColor(R.color.tru));
                b2d.setBackground(getDrawable(R.drawable.back5));
                b2=1;

            }
        });

        b2c.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                if(b2==0){
                    b2a.setBackground(getDrawable(R.drawable.back5));
                    b2b.setBackground(getDrawable(R.drawable.back5));
                    b2c.setBackgroundColor(getColor(R.color.tru));
                    b2d.setBackground(getDrawable(R.drawable.back5));
                    b2=1;

                }else {

                    int k=0;
                }


            }
        });

        b2d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                b2a.setBackground(getDrawable(R.drawable.back5));
                b2b.setBackground(getDrawable(R.drawable.back5));
                b2c.setBackgroundColor(getColor(R.color.tru));
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
                b4c.setBackground(getDrawable(R.drawable.back5));
                b4d.setBackgroundColor(getColor(R.color.tru));
                b4=1;

            }
        });

        b4b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b4a.setBackground(getDrawable(R.drawable.back5));
                b4b.setBackgroundColor(getColor(R.color.fals));
                b4c.setBackground(getDrawable(R.drawable.back5));
                b4d.setBackgroundColor(getColor(R.color.tru));
                b4=1;



            }
        });

        b4c.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b4a.setBackground(getDrawable(R.drawable.back5));
                b4b.setBackground(getDrawable(R.drawable.back5));
                b4c.setBackgroundColor(getColor(R.color.fals));
                b4d.setBackgroundColor(getColor(R.color.tru));




                b4=1;


            }
        });

        b4d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                if(b4==0){
                    b4a.setBackground(getDrawable(R.drawable.back5));
                    b4b.setBackground(getDrawable(R.drawable.back5));
                    b4c.setBackground(getDrawable(R.drawable.back5));
                    b4d.setBackgroundColor(getColor(R.color.tru));
                    b4=1;

                }else {
                    int k=0;
                }


            }
        });

        b5a.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b5a.setBackgroundColor(getColor(R.color.fals));
                b5b.setBackgroundColor(getColor(R.color.tru));
                b5c.setBackground(getDrawable(R.drawable.back5));
                b5d.setBackground(getDrawable(R.drawable.back5));
                b5=1;

            }
        });
        b5b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                if(b5==0){
                    b5a.setBackground(getDrawable(R.drawable.back5));
                    b5b.setBackgroundColor(getColor(R.color.tru));
                    b5c.setBackground(getDrawable(R.drawable.back5));
                    b5d.setBackground(getDrawable(R.drawable.back5));
                    b5=1;

                }else {

                    int k=0;
                }


            }
        });
        b5c.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b5a.setBackground(getDrawable(R.drawable.back5));
                b5b.setBackgroundColor(getColor(R.color.tru));
                b5c.setBackgroundColor(getColor(R.color.fals));
                b5d.setBackground(getDrawable(R.drawable.back5));
                b5=1;

            }
        });
        b5d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b5a.setBackground(getDrawable(R.drawable.back5));
                b5b.setBackgroundColor(getColor(R.color.tru));
                b5c.setBackground(getDrawable(R.drawable.back5));
                b5d.setBackgroundColor(getColor(R.color.fals));
                b5=1;

            }
        });



        b6a.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                if(b6==0){
                    b6a.setBackgroundColor(getColor(R.color.tru));
                    b6b.setBackground(getDrawable(R.drawable.back5));
                    b6c.setBackground(getDrawable(R.drawable.back5));
                    b6d.setBackground(getDrawable(R.drawable.back5));
                    b6=1;
                }else {
                    int k=0;
                }


            }
        });

        b6b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b6a.setBackgroundColor(getColor(R.color.tru));
                b6b.setBackgroundColor(getColor(R.color.fals));
                b6c.setBackground(getDrawable(R.drawable.back5));
                b6d.setBackground(getDrawable(R.drawable.back5));
                b6=1;

            }
        });

        b6c.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b6a.setBackgroundColor(getColor(R.color.tru));
                b6b.setBackground(getDrawable(R.drawable.back5));
                b6c.setBackgroundColor(getColor(R.color.fals));
                b6d.setBackground(getDrawable(R.drawable.back5));
                b6=1;

            }
        });

        b6d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b6a.setBackgroundColor(getColor(R.color.tru));
                b6b.setBackground(getDrawable(R.drawable.back5));
                b6c.setBackground(getDrawable(R.drawable.back5));
                b6d.setBackgroundColor(getColor(R.color.fals));
                b6=1;

            }
        });


        b7a.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                b7a.setBackgroundColor(getColor(R.color.fals));
                b7b.setBackground(getDrawable(R.drawable.back5));
                b7c.setBackground(getDrawable(R.drawable.back5));
                b7d.setBackgroundColor(getColor(R.color.tru));
                b7=1;

            }
        });

        b7b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b7a.setBackground(getDrawable(R.drawable.back5));
                b7b.setBackgroundColor(getColor(R.color.fals));
                b7c.setBackground(getDrawable(R.drawable.back5));
                b7d.setBackgroundColor(getColor(R.color.tru));
                b7=1;



            }
        });

        b7c.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b7a.setBackground(getDrawable(R.drawable.back5));
                b7b.setBackground(getDrawable(R.drawable.back5));
                b7c.setBackgroundColor(getColor(R.color.fals));
                b7d.setBackgroundColor(getColor(R.color.tru));


                b7=1;


            }
        });

        b7d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                if(b7==0){
                    b7a.setBackground(getDrawable(R.drawable.back5));
                    b7b.setBackground(getDrawable(R.drawable.back5));
                    b7c.setBackground(getDrawable(R.drawable.back5));
                    b7d.setBackgroundColor(getColor(R.color.tru));
                    b7=1;

                }else {
                    int k=0;
                }


            }
        });


        b8a.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b8a.setBackgroundColor(getColor(R.color.fals));
                b8b.setBackground(getDrawable(R.drawable.back5));
                b8c.setBackgroundColor(getColor(R.color.tru));
                b8d.setBackground(getDrawable(R.drawable.back5));
                b8=1;

            }
        });

        b8b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                b8a.setBackground(getDrawable(R.drawable.back5));
                b8b.setBackgroundColor(getColor(R.color.fals));
                b8c.setBackgroundColor(getColor(R.color.tru));
                b8d.setBackground(getDrawable(R.drawable.back5));
                b8=1;

            }
        });

        b8c.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                if(b8==0){
                    b8a.setBackground(getDrawable(R.drawable.back5));
                    b8b.setBackground(getDrawable(R.drawable.back5));
                    b8c.setBackgroundColor(getColor(R.color.tru));
                    b8d.setBackground(getDrawable(R.drawable.back5));
                    b8=1;

                }else {

                    int k=0;
                }


            }
        });

        b8d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                b8a.setBackground(getDrawable(R.drawable.back5));
                b8b.setBackground(getDrawable(R.drawable.back5));
                b8c.setBackgroundColor(getColor(R.color.tru));
                b8d.setBackgroundColor(getColor(R.color.fals));
                b8=1;

            }
        });


        b9a.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b9a.setBackgroundColor(getColor(R.color.fals));
                b9b.setBackgroundColor(getColor(R.color.tru));
                b9c.setBackground(getDrawable(R.drawable.back5));
                b9d.setBackground(getDrawable(R.drawable.back5));
                b9=1;

            }
        });
        b9b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                if(b9==0){
                    b9a.setBackground(getDrawable(R.drawable.back5));
                    b9b.setBackgroundColor(getColor(R.color.tru));
                    b9c.setBackground(getDrawable(R.drawable.back5));
                    b9d.setBackground(getDrawable(R.drawable.back5));
                    b9=1;

                }else {

                    int k=0;
                }


            }
        });
        b9c.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b9a.setBackground(getDrawable(R.drawable.back5));
                b9b.setBackgroundColor(getColor(R.color.tru));
                b9c.setBackgroundColor(getColor(R.color.fals));
                b9d.setBackground(getDrawable(R.drawable.back5));
                b9=1;

            }
        });
        b9d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b9a.setBackground(getDrawable(R.drawable.back5));
                b9b.setBackgroundColor(getColor(R.color.tru));
                b9c.setBackground(getDrawable(R.drawable.back5));
                b9d.setBackgroundColor(getColor(R.color.fals));
                b9=1;

            }
        });


        b10a.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                if(b10==0){
                    b10a.setBackgroundColor(getColor(R.color.tru));
                    b10b.setBackground(getDrawable(R.drawable.back5));
                    b10c.setBackground(getDrawable(R.drawable.back5));
                    b10d.setBackground(getDrawable(R.drawable.back5));
                    b10=1;
                }else {
                    int k=0;
                }


            }
        });

        b10b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b10a.setBackgroundColor(getColor(R.color.tru));
                b10b.setBackgroundColor(getColor(R.color.fals));
                b10c.setBackground(getDrawable(R.drawable.back5));
                b10d.setBackground(getDrawable(R.drawable.back5));
                b10=1;

            }
        });

        b10c.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b10a.setBackgroundColor(getColor(R.color.tru));
                b10b.setBackground(getDrawable(R.drawable.back5));
                b10c.setBackgroundColor(getColor(R.color.fals));
                b10d.setBackground(getDrawable(R.drawable.back5));
                b10=1;

            }
        });

        b10d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b10a.setBackgroundColor(getColor(R.color.tru));
                b10b.setBackground(getDrawable(R.drawable.back5));
                b10c.setBackground(getDrawable(R.drawable.back5));
                b10d.setBackgroundColor(getColor(R.color.fals));
                b10=1;

            }
        });

        b11a.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                if(b11==0){
                    b11a.setBackgroundColor(getColor(R.color.tru));
                    b11b.setBackground(getDrawable(R.drawable.back5));
                    b11c.setBackground(getDrawable(R.drawable.back5));
                    b11d.setBackground(getDrawable(R.drawable.back5));
                    b11=1;
                }else {
                    int k=0;
                }


            }
        });

        b11b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b11a.setBackgroundColor(getColor(R.color.tru));
                b11b.setBackgroundColor(getColor(R.color.fals));
                b11c.setBackground(getDrawable(R.drawable.back5));
                b11d.setBackground(getDrawable(R.drawable.back5));
                b11=1;

            }
        });

        b11c.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b11a.setBackgroundColor(getColor(R.color.tru));
                b11b.setBackground(getDrawable(R.drawable.back5));
                b11c.setBackgroundColor(getColor(R.color.fals));
                b11d.setBackground(getDrawable(R.drawable.back5));
                b11=1;

            }
        });

        b11d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b11a.setBackgroundColor(getColor(R.color.tru));
                b11b.setBackground(getDrawable(R.drawable.back5));
                b11c.setBackground(getDrawable(R.drawable.back5));
                b11d.setBackgroundColor(getColor(R.color.fals));
                b11=1;

            }
        });


        b12a.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                b12a.setBackgroundColor(getColor(R.color.fals));
                b12b.setBackground(getDrawable(R.drawable.back5));
                b12c.setBackground(getDrawable(R.drawable.back5));
                b12d.setBackgroundColor(getColor(R.color.tru));
                b12=1;

            }
        });

        b12b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b12a.setBackground(getDrawable(R.drawable.back5));
                b12b.setBackgroundColor(getColor(R.color.fals));
                b12c.setBackground(getDrawable(R.drawable.back5));
                b12d.setBackgroundColor(getColor(R.color.tru));
                b12=1;



            }
        });

        b12c.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b12a.setBackground(getDrawable(R.drawable.back5));
                b12b.setBackground(getDrawable(R.drawable.back5));
                b12c.setBackgroundColor(getColor(R.color.fals));
                b12d.setBackgroundColor(getColor(R.color.tru));


                b12=1;


            }
        });

        b12d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                if(b12==0){
                    b12a.setBackground(getDrawable(R.drawable.back5));
                    b12b.setBackground(getDrawable(R.drawable.back5));
                    b12c.setBackground(getDrawable(R.drawable.back5));
                    b12d.setBackgroundColor(getColor(R.color.tru));
                    b12=1;

                }else {
                    int k=0;
                }


            }
        });

        b13a.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {

                if(b13==0){
                    b13a.setBackgroundColor(getColor(R.color.tru));
                    b13b.setBackground(getDrawable(R.drawable.back5));
                    b13c.setBackground(getDrawable(R.drawable.back5));
                    b13d.setBackground(getDrawable(R.drawable.back5));
                    b13=1;
                }else {
                    int k=0;
                }


            }
        });

        b13b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b13a.setBackgroundColor(getColor(R.color.tru));
                b13b.setBackgroundColor(getColor(R.color.fals));
                b13c.setBackground(getDrawable(R.drawable.back5));
                b13d.setBackground(getDrawable(R.drawable.back5));
                b13=1;

            }
        });

        b13c.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b13a.setBackgroundColor(getColor(R.color.tru));
                b13b.setBackground(getDrawable(R.drawable.back5));
                b13c.setBackgroundColor(getColor(R.color.fals));
                b13d.setBackground(getDrawable(R.drawable.back5));
                b13=1;

            }
        });

        b13d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                b13a.setBackgroundColor(getColor(R.color.tru));
                b13b.setBackground(getDrawable(R.drawable.back5));
                b13c.setBackground(getDrawable(R.drawable.back5));
                b13d.setBackgroundColor(getColor(R.color.fals));
                b13=1;

            }
        });



    }
}
