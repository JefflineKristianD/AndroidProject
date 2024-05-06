package com.example.ashaapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class CekBox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_box);

        ImageButton imageButton = findViewById(R.id.ceklis);
        imageButton.setOnClickListener(view -> {
            Intent int0 = new Intent(CekBox.this,MainActivity2.class);
            startActivity(int0);
        });

        ImageButton imageButton1 = findViewById(R.id.silang);
        imageButton1.setOnClickListener(view -> {
            Intent int1 = new Intent(CekBox.this,MainActivity.class);
            startActivity(int1);
        });
    }
}