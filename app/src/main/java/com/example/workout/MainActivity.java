package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationManagerCompat;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int extype = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView quarWorkout = (TextView) findViewById(R.id.quarWorkout);
        ImageButton chest = (ImageButton) findViewById(R.id.chestButton);
        ImageButton back = (ImageButton) findViewById(R.id.backButton);
        ImageButton legs = (ImageButton) findViewById(R.id.legsButton);
        createNotificationChannel();
        Button alarm = (Button) findViewById(R.id.alarmButton);

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
        alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Reminder Set!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,RemindBroadcast.class);
                PendingIntent pendingIntent = PendingIntent.getBroadcast(MainActivity.this, 0, intent, 0);
                AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

                long timeAtButtonClick = System.currentTimeMillis();

                long tenSeconds = 1000 * 10;

                alarmManager.set(AlarmManager.RTC_WAKEUP, timeAtButtonClick + tenSeconds, pendingIntent);
                /*
                AlarmManager alarmMgr;
                PendingIntent alarmIntent;
                alarmMgr = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
                Intent intent = new Intent(MainActivity.this, RemindBroadcast.class);
                alarmIntent = PendingIntent.getBroadcast(MainActivity.this, 0, intent, 0);

                alarmMgr.set(AlarmManager.ELAPSED_REALTIME_WAKEUP,
                        SystemClock.elapsedRealtime() +
                                10 * 1000, alarmIntent);

                 */
            }
        });
    }
    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.BASE) {
            CharSequence name = "reminderChannel";
            String description = "channel";
            int importance = NotificationManagerCompat.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("notifyworkout", name, NotificationManager.IMPORTANCE_DEFAULT);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }
}
