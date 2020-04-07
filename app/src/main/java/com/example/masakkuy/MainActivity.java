package com.example.masakkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//Test Commite mas
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindahLauk(View view) {
        Intent intent = new Intent(MainActivity.this, bahanlauk.class);
        startActivity(intent);
    }

    public void pindahSayur(View view) {
        Intent intent = new Intent(MainActivity.this, bahansayur.class);
        startActivity(intent);
    }
}
