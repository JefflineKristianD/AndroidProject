package com.example.ashaapps;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ashaapps.Login;
import com.example.ashaapps.R;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        //kalendar
//        Button btn = findViewById(R.id.secondActivityButton2);
//        btn.setOnClickListener(view -> {
//            Intent intent2 = new Intent(MainActivity.this, com.firebase.notificationandroidstudio.MainActivity2.class);
//            startActivity(intent2);
//        });
//        //aktivitas
//        Button btn3=findViewById(R.id.secondActivityButton3);
//        btn3.setOnClickListener(view1 -> {
//            Intent intent3 = new Intent(MainActivity.this, MainActivity3.class);
//            startActivity(intent3);
//        });
//        //dokter
//        Button btn4=findViewById(R.id.secondActivityButton4);
//        btn4.setOnClickListener(view2 -> {
//            Intent intent4 = new Intent(MainActivity.this, MainActivity4.class);
//            startActivity(intent4);
//        });
//        //location
//        Button btn5=findViewById(R.id.secondActivityButton5);
//        btn5.setOnClickListener(view3 -> {
//            Intent intent5 = new Intent(MainActivity.this, MainActivity5.class);
//            startActivity(intent5);
//        });
//        //dimensia
//        Button btn6 = findViewById(R.id.secondActivityButton6);
//        btn6.setOnClickListener(view4 -> {
//            Intent intent6 = new Intent(MainActivity.this, MainActivity6.class);
//            startActivity(intent6);
//        });
        //login
        Button btn7 = findViewById(R.id.secondActivityButtonLogin);
        btn7.setOnClickListener(view4 -> {
            Intent intent7 = new Intent(MainActivity.this, Login.class);
            startActivity(intent7);
        });




        NotificationChannel();



        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,18);
        calendar.set(Calendar.MINUTE,22);
        calendar.set(Calendar.SECOND,0);

        if (Calendar.getInstance().after(calendar)) {
            calendar.add(Calendar.DAY_OF_MONTH, 03);
        }

        Intent intent = new Intent(MainActivity.this, MemoBroadcast.class);
        @SuppressLint("UnspecifiedImmutableFlag") PendingIntent pendingIntent = PendingIntent.getBroadcast(getApplicationContext(), 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY, pendingIntent);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            alarmManager.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),pendingIntent);
        }






    }
    private void NotificationChannel() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "PLASTICINE";
            String description = "PLASTICINE`S CHANNEL";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("Notification", name, importance);
            channel.setDescription(description);


            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);


        }
    }


}