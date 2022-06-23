package com.example.seekbarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    SeekBar seekBar;
    Button showBtn,hideBtn;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBarView();
        progressBarView();
    }

    private void progressBarView() {
        showBtn=findViewById(R.id.showBtn);
        hideBtn=findViewById(R.id.hideBtn);
        progressBar=findViewById(R.id.progressBar);

        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
            }
        });

        hideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.INVISIBLE);
            }
        });

    }




    private void seekBarView() {
        seekBar=findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Log.e("TAG","onProgressChanged:"+"ON PROGRESS CHANGELING"+i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.e("TAG","onStartTrackingTouch:"+"ON START TRACKING TOUCH");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.e("TAG","onStopTrackingTouch:"+"ON STOP TRACKING TOUCH");

            }
        });
    }
}