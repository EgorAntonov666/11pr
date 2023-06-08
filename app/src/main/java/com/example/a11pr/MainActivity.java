package com.example.a11pr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public boolean Started = false;
    public boolean Finished = false;

//    Button button, button3, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        try {
//            this.getSupportActionBar().hide();
//        } catch (NullPointerException e) {
//        }
        setContentView(R.layout.activity_main);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        button = findViewById(R.id.button);
//        button.setOnClickListener(this);
//        button2 = findViewById(R.id.button2);
//        button2.setOnClickListener(this);
//        button3 = findViewById(R.id.button3);
//        button3.setOnClickListener(this);
   }


    public void Start(View view) {
        Button button = (Button) findViewById(R.id.button2);
        if (!Finished) {
            if (!Started) {
                button.setBackgroundColor(Color.RED);
                button.setText("Пауза");
                Started = true;
            } else if (Started) {
                button.setBackgroundColor(Color.GREEN);
                button.setText("Старт");
                Started = false;

            }
        } else {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        }

    }

    public void Drive1(View view) {
        Button button = (Button) findViewById(R.id.button2);
        View Car = (View) findViewById(R.id.m1);
        TextView result = (TextView) findViewById(R.id.tvResult);
        if (Started && !Finished) {
            ViewGroup.MarginLayoutParams margin = (ViewGroup.MarginLayoutParams) Car.getLayoutParams();
            margin.leftMargin += 40;
            margin.rightMargin -= 40;
            Car.requestLayout();
            if (margin.rightMargin <= -100) {
                result.setText("Победа первого игрока");
                button.setText("Занова");
                result.setTextColor(0xfff00000);
                Finished = true;
            }
        }
    }

    public void Drive2(View view) {
        Button button = (Button) findViewById(R.id.button2);
        View Car = (View) findViewById(R.id.m2);
        TextView result = (TextView) findViewById(R.id.tvResult);
        if (Started && !Finished) {
            ViewGroup.MarginLayoutParams margin = (ViewGroup.MarginLayoutParams) Car.getLayoutParams();
            margin.leftMargin += 40;
            margin.rightMargin -= 40;
            Car.requestLayout();
            if (margin.rightMargin <= -100) {
                result.setText("Победа второго игрока");
                button.setText("Занова");
                result.setTextColor(0xfff00000);
                Finished = true;

            }


        }


    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.button2:
//                if (!Finished) {
//                    if (!Started) {
//                        button2.setBackgroundColor(Color.RED);
//                        button2.setText("Пауза");
//                        Started = true;
//                    } else if (Started) {
//                        button2.setBackgroundColor(Color.GREEN);
//                        button2.setText("Старт");
//                        Started = false;
//
//                    }
//                } else {
//                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
//                    startActivity(intent);
//                }
//                break;
//            case R.id.button:
//                ImageView Car =  findViewById(R.id.m2);
//                TextView result = findViewById(R.id.tvResult);
//                if (Started && !Finished) {
//                    ViewGroup.MarginLayoutParams margin = (ViewGroup.MarginLayoutParams) Car.getLayoutParams();
//                    margin.leftMargin += 40;
//                    margin.rightMargin -= 40;
//                    Car.requestLayout();
//                    if (margin.rightMargin <= -100) {
//                        result.setText("Победа второго игрока");
//                        button.setText("Занова");
//                        result.setTextColor(0xfff00000);
//                        Finished = true;
//
//                    }
//
//
//                }
//                break;
//            case R.id.button3:
//                ImageView Car1 =  findViewById(R.id.m1);
//                TextView result1 = findViewById(R.id.tvResult);
//                if (Started && !Finished) {
//                    ViewGroup.MarginLayoutParams margin = (ViewGroup.MarginLayoutParams) Car1.getLayoutParams();
//                    margin.leftMargin += 40;
//                    margin.rightMargin -= 40;
//                    Car1.requestLayout();
//                    if (margin.rightMargin <= -100) {
//                        result1.setText("Победа первого игрока");
//                        button.setText("Занова");
//                        result1.setTextColor(0xfff00000);
//                        Finished = true;
//
//                    }
//
//
//                }
//                break;
//
//
//
//        }
//
//    }
}