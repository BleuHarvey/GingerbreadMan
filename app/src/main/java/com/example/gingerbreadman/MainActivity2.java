package com.example.gingerbreadman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    TextView tvTopText;
    TextView tvBottomText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvTopText = findViewById(R.id.tv_top);
        tvBottomText = findViewById(R.id.tv_bottom);

        Intent intent = getIntent();

        String recieve1 = intent.getStringExtra(name:"data1");
        String recieve2 = intent.getStringExtra(name:"data2");

        tvTopText.setText(recieve1);
        tvBottomText.setText(recieve2);

    }
}