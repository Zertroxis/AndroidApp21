package com.example.myapplicationrgfr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int x1 = -5;
    int x2 = 5;
    int x0 = 0;
    int y1 = -5;
    int y2 = 5;
    int y0 = 0;
    TextView textView;
    TextView coordinateX;
    TextView coordinateY;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.calc);

        View.OnClickListener  listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coordinateX = (EditText) findViewById(R.id.coordinateX);
                coordinateY = (EditText) findViewById(R.id.coordinateY);
                final TextView textView = (TextView) findViewById(R.id.answer);
                x0 = Integer.parseInt(coordinateX.getText().toString());
                y0 = Integer.parseInt(coordinateY.getText().toString());
                if ((((y0>y1) && (x0>x1) && (y0<=0)&& (x0<=0))||((y0<y2)&&(x0<x2)&&(y0>=0)&&(x0>=0)))) {
                    textView.setText("Попададает");
                } else {
                    textView.setText("Не попададает");

                }

            }

        };
        button.setOnClickListener(listener);

    }
}
