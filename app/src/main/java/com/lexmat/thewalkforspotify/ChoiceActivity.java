package com.lexmat.thewalkforspotify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class ChoiceActivity extends AppCompatActivity {
    String[] categories;
    ImageView[] choices;
    int choicePos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        Intent intent = getIntent();
        categories = intent.getStringArrayExtra("categories");
        choicePos = intent.getIntExtra("choicePos",0);
        Log.d("choiceActivity","choicePos is " + choicePos);

        choices = new ImageView[3];
        choices[0] = findViewById(R.id.imageOne);
        choices[1] = findViewById(R.id.imageTwo);
        choices[2] = findViewById(R.id.imageThree);

        /*for(int i = 0; i < categories.length; i++){
            if(categories[i].equals("empty")){
                Log.d("ChoiceActivity","choicePos is "+i);
                choicePos = i;
                break;
            }
        }*/

        if(choicePos == 0){
            choices[0].setImageResource(R.drawable.morning);
            choices[1].setImageResource(R.drawable.day);
            choices[2].setImageResource(R.drawable.evening);
        }else if(choicePos == 1){
            choices[0].setImageResource(R.drawable.warm);
            choices[1].setImageResource(R.drawable.transition);
            choices[2].setImageResource(R.drawable.cold);
        }else if(choicePos == 2){
            choices[0].setImageResource(R.drawable.city);
            choices[1].setImageResource(R.drawable.beach);
            choices[2].setImageResource(R.drawable.nature);
        }else if(choicePos == 3){
            choices[0].setImageResource(R.drawable.cheerful);
            choices[1].setImageResource(R.drawable.melancholy);
            choices[2].setImageResource(R.drawable.calm);
        }

    }

    public void onOne(View view) {
        if(choicePos == 0){
            categories[0] = "morning";
        }else if(choicePos == 1){
            categories[1] = "warm";
        }else if(choicePos == 2){
            categories[2] = "city";
        }else if(choicePos == 3){
            categories[3] = "cheerful";
        }
        if(choicePos < 3){
            nextChoice();
        }else{
            finishedChoice();
        }
    }

    public void onTwo(View view) {
        if(choicePos == 0){
            categories[0] = "day";
        }else if(choicePos == 1){
            categories[1] = "transition";
        }else if(choicePos == 2){
            categories[2] = "nature";
        }else if(choicePos == 3){
            categories[3] = "calm";
        }

        if(choicePos < 3){
            nextChoice();
        }else{
            finishedChoice();
        }
    }

    public void onThree(View view) {
        if(choicePos == 0){
            categories[0] = "evening";
        }else if(choicePos == 1){
            categories[1] = "cold";
        }else if(choicePos == 2){
            categories[2] = "beach";
        }else if(choicePos == 3){
            categories[3] = "melancholy";
        }
        if(choicePos < 3){
            nextChoice();
        }else{
            finishedChoice();
        }
    }

    public void nextChoice(){
        Intent intent = new Intent(this, ChoiceActivity.class);
        intent.putExtra("categories",  categories);
        intent.putExtra("choicePos", choicePos+1);
        startActivity(intent);
    }

    public void finishedChoice(){
        Intent intent = new Intent(this, PlaylistActivity.class);
        intent.putExtra("categories", categories);
        startActivity(intent);
    }

}
