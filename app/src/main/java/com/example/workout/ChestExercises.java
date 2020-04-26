package com.example.workout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChestExercises extends pop {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chestex);

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        if (exerciseNumber == 0) {
            textView7.setVisibility(View.INVISIBLE);
            textView6.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.INVISIBLE);
        }
        if (exerciseNumber == 1) {
            textView7.setVisibility(View.INVISIBLE);
            textView6.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.INVISIBLE);
        }
        if (exerciseNumber == 2) {
            textView7.setVisibility(View.INVISIBLE);
            textView6.setVisibility(View.INVISIBLE);
            textView5.setVisibility(View.INVISIBLE);
        }
        if (exerciseNumber == 3) {
            textView7.setVisibility(View.INVISIBLE);
            textView6.setVisibility(View.INVISIBLE);
        }
        if (exerciseNumber == 4) {
            textView7.setVisibility(View.INVISIBLE);
        }
    }
}