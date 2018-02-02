package com.bisponet.pontuator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.shapes.Shape;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    Button b1, b2, b3, b5, b8, b13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.btn_1);
        b2 = (Button) findViewById(R.id.btn_2);
        b3 = (Button) findViewById(R.id.btn_3);
        b5 = (Button) findViewById(R.id.btn_5);
        b8 = (Button) findViewById(R.id.btn_8);
        b13 = (Button) findViewById(R.id.btn_13);

        setButtonsBackground(this, this.getColor(R.color.btnStartColor),
                this.getColor(R.color.btnEndColor));



    }

    public void setButtonsBackground(Context context, int startcolor, int endcolor) {

        int[] colors = new int[]
                {ContextCompat.getColor(context, startcolor),
                        ContextCompat.getColor(context, endcolor)};

        GradientDrawable gradientDrawable =
                new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, colors);
        gradientDrawable.setCornerRadius(50);
        gradientDrawable.setGradientType(GradientDrawable.LINEAR_GRADIENT);

        b1.setBackground(gradientDrawable);
        b2.setBackground(gradientDrawable);
        b3.setBackground(gradientDrawable);
        b5.setBackground(gradientDrawable);
        b8.setBackground(gradientDrawable);
        b13.setBackground(gradientDrawable);
    }
}
