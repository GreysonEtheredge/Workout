package com.example.workout;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pop extends MainActivity {

    EditText editText3;
    TextView textView8;
    public int exerciseNumber = 0;
    Button submitButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chestpopup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);



        editText3 = (EditText) findViewById(R.id.editText3);
        textView8 = (TextView) findViewById(R.id.textView8);
        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exerciseNumber = Integer.valueOf(editText3.getText().toString());
                if (getIntent().getIntExtra("type", 0) == 1) {
                    Intent popup = new Intent(pop.this,ChestExercises.class);
                    popup.putExtra("num", exerciseNumber);
                    startActivity(popup);
                    //startActivity(new Intent(pop.this,ChestExercises.class));
                }
                if (getIntent().getIntExtra("type", 0) == 2) {
                    Intent popup = new Intent(pop.this,BackExercises.class);
                    popup.putExtra("num", exerciseNumber);
                    startActivity(popup);
                    //startActivity(new Intent(pop.this,BackExercises.class));
                }
                if (getIntent().getIntExtra("type", 0) == 3) {
                    Intent popup = new Intent(pop.this,LegExercises.class);
                    popup.putExtra("num", exerciseNumber);
                    startActivity(popup);
                    //startActivity(new Intent(pop.this,LegExercises.class));
                }
            }
        });
    }
}
