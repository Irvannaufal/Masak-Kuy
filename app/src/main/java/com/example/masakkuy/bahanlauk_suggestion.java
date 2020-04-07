package com.example.masakkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bahanlauk_suggestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahanlauk_suggestion);
    }

    public void pindahResep_lauk(View view) {
        Intent intent = new Intent(bahanlauk_suggestion.this, bahanlauk_resep.class);
        startActivity(intent);
    }
}
