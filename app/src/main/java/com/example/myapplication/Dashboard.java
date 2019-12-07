package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.anastr.speedviewlib.SpeedView;

public class Dashboard extends AppCompatActivity {

    private SpeedView speedView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        speedView = findViewById(R.id.speedView);
    }
}
