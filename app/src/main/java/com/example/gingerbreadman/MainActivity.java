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
    private EditText etVerb;
    private EditText etAdverb;
    private EditText etAdjective;
    private EditText etColor;
    private EditText etCelebrity;
    private EditText etAnimal;
    private EditText etFood;
    private EditText etBodyPart;


    private Button btnNextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //edit text objects
        etNoun = findViewById(R.id.et_noun);
        etPluralNoun = findViewById(R.id.et_plural_noun);
        etVerb = findViewById(R.id.et_verb);
        etAdverb = findViewById(R.id.et_adverb);
        etAdjective = findViewById(R.id.et_adjective);
        etColor = findViewById(R.id.et_color);
        etCelebrity = findViewById (R.id.et_celebrity);
        etAnimal = findViewById (R.id.et_animal);
        etFood = findViewById (R.id.et_food);
        etBodyPart = findViewById (R.id.et_body_part);


        btnNextPage = findViewById(R.id.btn_nextpage);

        Intent mainActivity2 = new Intent(MainActivity.this, MainActivity2.class);

        String sendThisString = " Whatever String I want to send";
        String sendThisToo = "The other string I want to send";

        mainActivity2.putExtra("data1", sendThisString);
        mainActivity2.putExtra("data2", sendThisToo);

        btnNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String story = "";
                story += "\nOn the planet Pandora " + etCelebrity.getText() + " looked at the small " + etAnimal.getText() + " in her hands and felt sad.";
                story += "\nShe walked over to the " + etNoun.getText() + " and " + etVerb.getText() + " on her " + etAdjective.getText() + " surroundings. She had always loved " + etAdjective.getText() + " Pandora with its tricky, talented trees. It was a place that encouraged her tendency to feel sad.";
                story += "\nThen she saw something in the distance, or rather someone. It was the figure of Jake Sully. Jake was a killer earthling with " + etAdverb.getText() + " fingernails and lean " + etBodyPart.getText() + ".";
                story += "\n "+ etCelebrity.getText() + " gulped. She glanced at her own reflection. She was a " + etColor.getText() + " princess, " + etFood.getText() + " eater with blue fingernails and tall toenail. Her friends saw her as a pretty, prickly princess. Once, she had even saved a strange necklace that was stuck in a drain.";
                story += "\nBut not even a blue person who had once saved a strange necklace that was stuck in a drain, was prepared for what Jake had in store today.The rain hammered like retaliate " + etAnimal.getText() + ", making "+ etCelebrity.getText() + " vengeful.";
                story += "\nAs "+ etCelebrity.getText() + " stepped outside and Jake came closer, she could see the loose " + etVerb.getText() + " in his eye. I am here because I want a hug,  Jake bellowed, in a tahkail tone. He slammed his fist against "+ etCelebrity.getText() + " chest, with the force of 676 Toruk Macto’s. I friggin love you, "+ etCelebrity.getText() + ".";
                story += "\n"+ etCelebrity.getText() + " looked back, even more vengeful and still fingering the small Banshee. Jake, you're like a child, she replied. They looked at each other with happy feelings, like two tough, thoughtless Tulkun avenging a very archer doomsday, which had cello music playing in the background and two tall "+ etPluralNoun.getText() + " saving to the beat.";
                story += "\n"+ etCelebrity.getText() + " regarded Jake's fast " + etAnimal.getText() + " and lean " + etAnimal.getText() +". She held out her hand. Let's not fight, she whispered, gently.Hmph, pondered Jake. Please? begged "+ etCelebrity.getText() + " with " + etAnimal.getText() + " eyes.";
                story += "\nJake looked surprised, his body blushing like an ugliest, unnatural Unobtanium. Then Jake came inside for a nice drink of water.";
                story += "\nTHE END";


                mainActivity2.putExtra("story",story);
                startActivity(mainActivity2);
            }
        });
    }
}