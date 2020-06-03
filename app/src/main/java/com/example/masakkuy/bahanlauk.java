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

    public void pindahLauk_Ayam(View view) {
        Intent intent = new Intent(bahanlauk.this, bahanlauk_suggestion.class);
        intent.putExtra("dataLauk", "ayam");
        startActivity(intent);
    }
    public void pindahLauk_Telur(View view) {
        Intent intent = new Intent(bahanlauk.this, bahanlauk_suggestion.class);
        intent.putExtra("dataLauk", "telur");
        startActivity(intent);
    }
    public void pindahLauk_Tahu(View view) {
        Intent intent = new Intent(bahanlauk.this, bahanlauk_suggestion.class);
        intent.putExtra("dataLauk", "tahu");
        startActivity(intent);
    }
    public void pindahLauk_Ikan(View view) {
        Intent intent = new Intent(bahanlauk.this, bahanlauk_suggestion.class);
        intent.putExtra("dataLauk", "ikan");
        startActivity(intent);
    }
    public void pindahLauk_Daging(View view) {
        Intent intent = new Intent(bahanlauk.this, bahanlauk_suggestion.class);
        intent.putExtra("dataLauk", "daging");
        startActivity(intent);
    }
    public void pindahLauk_Udang(View view) {
        Intent intent = new Intent(bahanlauk.this, bahanlauk_suggestion.class);
        intent.putExtra("dataLauk", "udang");
        startActivity(intent);
    }
    public void pindahLauk_Cumi(View view) {
        Intent intent = new Intent(bahanlauk.this, bahanlauk_suggestion.class);
        intent.putExtra("dataLauk", "cumi");
        startActivity(intent);
    }
    public void pindahLauk_Tempe(View view) {
        Intent intent = new Intent(bahanlauk.this, bahanlauk_suggestion.class);
        intent.putExtra("dataLauk", "tempe");
        startActivity(intent);
    }
}
