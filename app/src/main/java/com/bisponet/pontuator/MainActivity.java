package com.bisponet.pontuator;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b5, b8, b13;
    TextView displayingNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayingNumber = (TextView)  findViewById(R.id.display);
        b1 = (Button) findViewById(R.id.btn_1);
        b2 = (Button) findViewById(R.id.btn_2);
        b3 = (Button) findViewById(R.id.btn_3);
        b5 = (Button) findViewById(R.id.btn_5);
        b8 = (Button) findViewById(R.id.btn_8);
        b13 = (Button) findViewById(R.id.btn_13);

        Drawable btnBackground = getDrawable(R.drawable.btn_background);
        b1.setBackground(btnBackground);
        b2.setBackground(btnBackground);
        b3.setBackground(btnBackground);
        b5.setBackground(btnBackground);
        b8.setBackground(btnBackground);
        b13.setBackground(btnBackground);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("3");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("5");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("8");
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNumber("13");
            }
        });
    }

    private void setNumber(String number){
        displayingNumber.setText(number);
    }
}
