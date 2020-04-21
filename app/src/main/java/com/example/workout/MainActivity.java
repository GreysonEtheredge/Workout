package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ImageButton chestButton = (ImageButton) findViewById(R.id.chestButton);
        //TextView tv = (TextView) findViewById(R.id.textView);

        ImageButton chest = (ImageButton) findViewById(R.id.imageButton2);
        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, pop.class));
            }
        });
    }
}
