package com.example.gingerbreadman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText etNoun;
    private EditText etPluralNoun;
    private Button btnNextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //edit text objects
        etNoun = findViewById(R.id.et_noun);
        etPluralNoun = findViewById(R.id.et_plural_noun);

        btnNextPage = findViewById(R.id.btn_nextpage);

        Intent mainActivity2 = new Intent(MainActivity.this, MainActivity2.class);

        String sendThisString = " Whatever String I want to send";
        String sendThisToo = "The other string I want to send";

        mainActivity2.putExtra("data1", sendThisString);
        mainActivity2.putExtra("data2", sendThisToo);

        btnNextPage.setOnClickListener(new View.OnClickListener()) {
            @Override
            public void onClick(View v) {


                String story = "";
                story += "\nThe gingerbread man has a " + etNoun.getText();
                story += "\n";


                mainActivity2.putExtra("story",story);
                startActivity(mainActivity2);
            }
        }
    }
}