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

    public void pindahSayur_Wortel(View view) {
        Intent intent = new Intent(bahansayur.this, bahansayur_suggestion.class);
        intent.putExtra("dataSayur", "wortel");
        startActivity(intent);
    }
    public void pindahSayur_Jagung(View view) {
        Intent intent = new Intent(bahansayur.this, bahansayur_suggestion.class);
        intent.putExtra("dataSayur", "jagung");
        startActivity(intent);
    }
    public void pindahSayur_Sawi(View view) {
        Intent intent = new Intent(bahansayur.this, bahansayur_suggestion.class);
        intent.putExtra("dataSayur", "sawi");
        startActivity(intent);
    }
    public void pindahSayur_Brokoli(View view) {
        Intent intent = new Intent(bahansayur.this, bahansayur_suggestion.class);
        intent.putExtra("dataSayur", "brokoli");
        startActivity(intent);
    }
    public void pindahSayur_Kangkung(View view) {
        Intent intent = new Intent(bahansayur.this, bahansayur_suggestion.class);
        intent.putExtra("dataSayur", "kangkung");
        startActivity(intent);
    }
    public void pindahSayur_Bayam(View view) {
        Intent intent = new Intent(bahansayur.this, bahansayur_suggestion.class);
        intent.putExtra("dataSayur", "bayam");
        startActivity(intent);
    }
    public void pindahSayur_Jamur(View view) {
        Intent intent = new Intent(bahansayur.this, bahansayur_suggestion.class);
        intent.putExtra("dataSayur", "jamur");
        startActivity(intent);
    }
    public void pindahSayur_Terung(View view) {
        Intent intent = new Intent(bahansayur.this, bahansayur_suggestion.class);
        intent.putExtra("dataSayur", "terung");
        startActivity(intent);
    }
}
