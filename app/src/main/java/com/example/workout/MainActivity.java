package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    public int type = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton chest = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton back = (ImageButton) findViewById(R.id.imageButton);
        ImageButton legs = (ImageButton) findViewById(R.id.imageButton3);

        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = 1;
                startActivity(new Intent(MainActivity.this,pop.class));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = 2;
                startActivity(new Intent(MainActivity.this,pop.class));
            }
        });
        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = 3;
                startActivity(new Intent(MainActivity.this,pop.class));
            }
        });
    }
}
