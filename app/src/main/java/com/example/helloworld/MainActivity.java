package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.button_id);
        final ProgressBar bar = findViewById(R.id.progressBar);
        final Button restart = findViewById(R.id.restart);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView hello = findViewById(R.id.hello);
                if(hello.getVisibility() == View.VISIBLE){
                    hello.setVisibility(View.INVISIBLE);
                    button.setText("Say Hello!");
                } else {
                    hello.setVisibility(View.VISIBLE);
                    button.setText("Say Goodbye");
                    bar.incrementProgressBy(1);
                    if(bar.getProgress() == 50){
                        TextView congrats = findViewById(R.id.congrats);
                        congrats.setVisibility(View.VISIBLE);
                        restart.setVisibility(View.VISIBLE);
                    }
                }
            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView hello = findViewById(R.id.hello);
                TextView congrats = findViewById(R.id.congrats);
                hello.setVisibility(View.INVISIBLE);
                congrats.setVisibility(View.INVISIBLE);
                button.setText("Say Hello!");
                bar.setProgress(0);
                restart.setVisibility(View.INVISIBLE);
            }
        });
    }
}