package com.example.masakkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class bahansayur_resep extends AppCompatActivity {

    TextView namaResep, bahanResep, caraResep;
    ImageView imgResep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahansayur_resep);

        namaResep = (TextView)findViewById(R.id.namaResep_sayur);
        bahanResep = (TextView)findViewById(R.id.bahanResep_sayur);
        caraResep = (TextView)findViewById(R.id.caraResep_sayur);
        imgResep = (ImageView) findViewById(R.id.imgResep_sayur);

        String pilihanResep = getIntent().getStringExtra("Nama");

        namaResep.setText(pilihanResep);

        if (pilihanResep.equalsIgnoreCase("jagung")){
            bahanResep.setText("-Jagung Segar \n-Gula 2Sdt \n-Garam 1Sdt \n-Lombok \n-Kecap");
            caraResep.setText("1. Campurkan Jagung bahan. \n2. Oleskan bahan pada ikan.\n3. Masak Ikan sampai matang.\n4.Tuangkan bahan yang sudah dicampur di atas ikan.\n5. Ikan sudah siap dihidangkan. ");
            imgResep.setImageResource(R.drawable.jagung_utama);
        } else if (pilihanResep.equalsIgnoreCase("wortel")){
            bahanResep.setText("-Wortel Segar\n-Gula 2Sdt\n-Garam 1Sdt\n-Lombok\n-Kecap");
            caraResep.setText("1. Campurkan Wortel bahan.\n2. Oleskan bahan pada ikan.\n3. Masak Ikan sampai matang.\n4.Tuangkan bahan yang sudah dicampur di atas ikan.\n5. Ikan sudah siap dihidangkan. ");
            imgResep.setImageResource(R.drawable.wortel_utama);
        }

    }


}
