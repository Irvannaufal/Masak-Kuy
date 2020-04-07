package com.example.masakkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bahansayur_suggestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahansayur_suggestion);
    }

    public void pindahResep_sayur(View view) {
        Intent intent = new Intent(bahansayur_suggestion.this, bahansayur_resep.class);
        startActivity(intent);
    }
}
