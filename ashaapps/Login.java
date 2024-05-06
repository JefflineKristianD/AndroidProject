package com.example.ashaapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btn1 = findViewById(R.id.secondActivityButtonLogin1);
        btn1.setOnClickListener(view4 -> {
            Intent intent = new Intent(Login.this, MainActivity5.class);
            startActivity(intent);
        });


    }
}