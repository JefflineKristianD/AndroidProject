package com.example.ashaapps;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class NotificationOpen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_box);
        ImageButton imageButton = findViewById(R.id.ceklis);
        imageButton.setOnClickListener(view -> {
            Intent int1 = new Intent(NotificationOpen.this,MainActivity2.class);
            startActivity(int1);
        });

        ImageButton imageButton1 = findViewById(R.id.silang);
        imageButton1.setOnClickListener(view -> {
            Intent int1 = new Intent(NotificationOpen.this,MainActivity.class);
            startActivity(int1);
        });
    }
}