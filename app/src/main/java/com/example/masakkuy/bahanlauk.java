package com.example.masakkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bahanlauk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahanlauk);
    }

    public void pindahSuggest_lauk(View view) {
        Intent intent = new Intent(bahanlauk.this, bahanlauk_suggestion.class);
        startActivity(intent);
    }
}
