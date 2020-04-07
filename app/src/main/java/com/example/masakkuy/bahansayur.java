package com.example.masakkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bahansayur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahansayur);
    }

    public void pindahSuggest_sayur(View view) {
        Intent intent = new Intent(bahansayur.this, bahansayur_suggestion.class);
        startActivity(intent);
    }
}
