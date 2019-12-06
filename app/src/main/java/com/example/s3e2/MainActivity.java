package com.example.s3e2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView t1 = findViewById(R.id.tv1);
        t1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "jan", LENGTH_LONG).show();
            }
        });

        TextView t2 = findViewById(R.id.tv2);
        t2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "feb", LENGTH_LONG).show();
            }
        });
        TextView t3 = findViewById(R.id.tv3);

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "mar", LENGTH_LONG).show();
            }
        });
        TextView t4 = findViewById(R.id.tv4);

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "apr", LENGTH_LONG).show();
            }
        });
        TextView t5 = findViewById(R.id.tv5);

        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "may", LENGTH_LONG).show();
            }
        });
        ImageButton b1 = findViewById(R.id.btn1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "jan", LENGTH_LONG).show();
            }
        });
        ImageButton b2 = findViewById(R.id.btn2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "feb", LENGTH_LONG).show();
            }
        });
        ImageButton b3 = findViewById(R.id.btn3);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "mar", LENGTH_LONG).show();
            }
        });
        ImageButton b4 = findViewById(R.id.btn4);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "apr", LENGTH_LONG).show();
            }
        });
        ImageButton b5 = findViewById(R.id.btn5);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "may", LENGTH_LONG).show();
            }
        });
        }
        
}

