package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView hello = findViewById(R.id.hello);
                if(hello.getVisibility() == View.VISIBLE){
                    hello.setVisibility(View.INVISIBLE);
                    button.setText("Say Hello!");
                } else {
                    hello.setVisibility(View.VISIBLE);
                    button.setText("Say Goodbye");
                }
            }
        });
    }
}