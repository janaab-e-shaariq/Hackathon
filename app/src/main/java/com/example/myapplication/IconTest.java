package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class IconTest extends AppCompatActivity implements View.OnClickListener {
    Button btn_connect;
    private LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon_test);

        lottieAnimationView = findViewById(R.id.dash_anim);

        lottieAnimationView.pauseAnimation();


        btn_connect = findViewById(R.id.button2);
        btn_connect.setOnClickListener(this);
        btn_connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn_connect.getText() == "Connect"){
                    btn_connect.setBackground(getDrawable(R.drawable.btn_connect2));
                    btn_connect.setText("Connected");
                    lottieAnimationView.resumeAnimation();
                }
                else{
                    btn_connect.setBackground(getDrawable(R.drawable.btn_connect1));
                    btn_connect.setText("Connect");
                    lottieAnimationView.pauseAnimation();
                }
            }
        });


    }

    @Override
    public void onClick(View view) {
        if (btn_connect.getText() == "Connect"){
            btn_connect.setBackground(getDrawable(R.drawable.btn_connect2));
            btn_connect.setText("Connected");
            lottieAnimationView.resumeAnimation();
        }
        else{
            btn_connect.setBackground(getDrawable(R.drawable.btn_connect1));
            btn_connect.setText("Connect");
            lottieAnimationView.pauseAnimation();
        }
    }

    private class AsyncRunner extends AsyncTask<String,String,String>{



        @Override
        protected String doInBackground(String... strings) {
                String resp = "";
            try {

            } catch (Exception e) {
                e.printStackTrace();
                resp = e.getMessage();
            }
            return resp;
        }
    }
}
