package com.pt2.myapplication;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView czas;
    TextView punkty;
    Button start;
    ImageView j1,j2,j3,j4,j5,j6,j7,j8,j9;
    private int ileSekund = 60;
    int punktyLiczba = 0;
    private CountDownTimer countDownTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.start);
        czas = findViewById(R.id.czas);
        punkty = findViewById(R.id.punkty);

        j1 = findViewById(R.id.j1);
        j2 = findViewById(R.id.j2);
        j3 = findViewById(R.id.j3);
        j4 = findViewById(R.id.j4);
        j5 = findViewById(R.id.j5);
        j6 = findViewById(R.id.j6);
        j7 = findViewById(R.id.j7);
        j8 = findViewById(R.id.j8);
        j9 = findViewById(R.id.j9);

        j5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyLiczba++;
                        punkty.setText(String.valueOf(punktyLiczba));
                        j5.setVisibility();
                    }
                }
        );

        start.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        countDownTimer = new CountDownTimer(ileSekund * 1000, 1000) {
                            @Override
                            public void onTick(long l) {
                                ileSekund = (int) (l/1000);
                                czas.setText(ileSekund+"s");
                            }

                            @Override
                            public void onFinish() {

                            }
                        };
                        countDownTimer.start();
                    }
                }
        );

    }
}