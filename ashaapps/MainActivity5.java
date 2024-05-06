package com.example.ashaapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        EditText editText = findViewById(R.id.Tensi);
        Button button = findViewById(R.id.Cek);
        TextView textView = findViewById(R.id.Hasil);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nomor = Integer.parseInt(editText.getText().toString());

                if (nomor <= 140) {
                    textView.setText("Hasil seluruh pemeriksaan kesehatan Anda dalam batas normal");
                } else if (nomor > 140) {
                    Intent intent6 = new Intent(MainActivity5.this, MainActivity4.class);
                    startActivity(intent6);
                }
            }
        });

        Button btn1 = findViewById(R.id.Lanjut);
        btn1.setOnClickListener(view1 -> {
            Intent intent7 = new Intent(MainActivity5.this, MainActivity1.class);
            startActivity(intent7);
        });
    }
}
