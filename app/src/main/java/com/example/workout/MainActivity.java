package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationManagerCompat;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int extype = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton chest = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton back = (ImageButton) findViewById(R.id.imageButton);
        ImageButton legs = (ImageButton) findViewById(R.id.imageButton3);
        Button button = (Button) findViewById(R.id.button2);
        createNotificationChannel();

        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                extype = 1;
                Intent popup = new Intent(MainActivity.this,pop.class);
                popup.putExtra("type", extype);
                startActivity(popup);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                extype = 2;
                Intent popup = new Intent(MainActivity.this,pop.class);
                popup.putExtra("type", extype);
                startActivity(popup);
            }
        });
        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                extype = 3;
                Intent popup = new Intent(MainActivity.this,pop.class);
                popup.putExtra("type", extype);
                startActivity(popup);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Reminder Set!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,RemindBroadcast.class);
                PendingIntent pendingIntent = PendingIntent.getBroadcast(MainActivity.this, 0, intent, 0);
                AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

                long timeAtButtonClick = System.currentTimeMillis();

                long tenSeconds = 1000 * 10;

                alarmManager.set(AlarmManager.RTC_WAKEUP, timeAtButtonClick + tenSeconds, pendingIntent);
            }
        });
    }
    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.BASE) {
            CharSequence name = "reminderChannel";
            String description = "channel";
            int importance = NotificationManagerCompat.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("motify", name, NotificationManager.IMPORTANCE_DEFAULT);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }
}
