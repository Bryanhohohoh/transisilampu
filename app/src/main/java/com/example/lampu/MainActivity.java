package com.example.testgdrive;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView lampuhidup;
    Button button1,button2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lampuhidup = findViewById(R.id.lampu);
        button1 = findViewById(R.id.lampuBtnOn);
        button2 = findViewById(R.id.lampuBtnOff);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button2.setVisibility(View.INVISIBLE);
                button1.setVisibility(View.VISIBLE);
                button1.setText("ON");
                lampuhidup.setImageDrawable(getDrawable(R.drawable.lampumati));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.VISIBLE);
                lampuhidup.setImageDrawable(getDrawable(R.drawable.lampuhidup));
            }
        });


    }
}


