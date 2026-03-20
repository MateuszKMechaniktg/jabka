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