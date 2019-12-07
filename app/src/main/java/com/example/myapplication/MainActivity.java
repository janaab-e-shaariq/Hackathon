package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.airbnb.lottie.LottieAnimationView;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private GraphView graphView;
    private LineGraphSeries<DataPoint> series;
    public static int count = -10;
    private final Handler mHandler = new Handler();

    /*@Override
    protected void onResume() {
        super.onResume();
        series = new LineGraphSeries<>();
        MainActivity.count = 0;
    }*/

    private Runnable timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        graphView = findViewById(R.id.graphView);

        graphView.getViewport().setScalableY(true);
        graphView.getViewport().setXAxisBoundsManual(true);
        graphView.getViewport().setMinX(0);
        graphView.getViewport().setMaxX(100);
        graphView.getViewport().setYAxisBoundsManual(true);
        graphView.getViewport().setMinY(0);
        graphView.getViewport().setMaxY(100);

        series = new LineGraphSeries<>();

        series.setTitle("Random Curve 1");
        series.setColor(Color.parseColor("#4788C7"));
        series.setDrawDataPoints(false);
        series.setThickness(25);
        series.setDrawBackground(true);
        series.setBackgroundColor(Color.parseColor("#CCEBF8"));
        graphView.addSeries(series);

        timer = new Runnable() {
            @Override
            public void run() {
                MainActivity.count += 10;
                Log.e("tag1","running");
                series.appendData(new DataPoint(MainActivity.count, getRandom()), true, 40);
                mHandler.postDelayed(this, 1000);
            }
        };
        mHandler.postDelayed(timer, 100);
    }

    Random mRand = new Random();
    private double getRandom() {
        return mRand.nextInt(100);
    }
}
