package com.example.workout;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class pop extends MainActivity {

    EditText editText3;
    int exerciseNumber = 0;
    Button submitButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chestpopup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);



        editText3 = (EditText) findViewById(R.id.editText3);
        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exerciseNumber = Integer.valueOf(editText3.getText().toString());
                if (extype == 1) {
                    startActivity(new Intent(pop.this,ChestExercises.class));
                }
                if (extype == 2) {
                    startActivity(new Intent(pop.this,ChestExercises.class));
                }
                if (extype == 3) {
                    startActivity(new Intent(pop.this,ChestExercises.class));
                }
            }
        });
    }
}
