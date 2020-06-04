package com.example.masakkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class bahanlauk_resep extends AppCompatActivity {

    TextView namaResep, bahanResep, caraResep;
    ImageView imgResep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahanlauk_resep);

        namaResep = (TextView)findViewById(R.id.namaResep_lauk);
        bahanResep = (TextView)findViewById(R.id.bahanResep_lauk);
        caraResep = (TextView)findViewById(R.id.caraResep_lauk);
        imgResep = (ImageView) findViewById(R.id.imgResep_lauk);

        String pilihanResep = getIntent().getStringExtra("Nama");

        namaResep.setText(pilihanResep);

        if (pilihanResep.equalsIgnoreCase("daging")){
            bahanResep.setText("-Daging Segar \n-Gula 2Sdt \n-Garam 1Sdt \n-Lombok \n-Kecap");
            caraResep.setText("1. Campurkan Daging bahan. \n2. Oleskan bahan pada ikan.\n3. Masak Ikan sampai matang.\n4.Tuangkan bahan yang sudah dicampur di atas ikan.\n5. Ikan sudah siap dihidangkan. ");
            imgResep.setImageResource(R.drawable.ayamgeprek);
        } else if (pilihanResep.equalsIgnoreCase("ayam")){
            bahanResep.setText("-Ayam Segar\n-Gula 2Sdt\n-Garam 1Sdt\n-Lombok\n-Kecap");
            caraResep.setText("1. Campurkan Ayam bahan.\n2. Oleskan bahan pada ikan.\n3. Masak Ikan sampai matang.\n4.Tuangkan bahan yang sudah dicampur di atas ikan.\n5. Ikan sudah siap dihidangkan. ");
            imgResep.setImageResource(R.drawable.daging_utama);
        }
    }
}
