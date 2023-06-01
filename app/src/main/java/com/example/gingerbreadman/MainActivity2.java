package com.example.gingerbreadman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tvStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvStory = findViewById(R.id.tv_story);

        Intent intent = getIntent();

        String story = intent.getStringExtra("story");

        tvStory.setText(story);

    }
}