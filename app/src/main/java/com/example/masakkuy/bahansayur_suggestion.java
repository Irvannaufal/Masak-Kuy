package com.example.masakkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class bahansayur_suggestion extends AppCompatActivity {

    ListView listView;
    SimpleAdapter adapter;
    HashMap<String, String> map;
    ArrayList<HashMap<String, String>> mylist;
    String[] nama_sayur; //deklarasi judul iem
    String[] desc_sayur; //deklarasi keterangan item
    String[] img_sayur; //deklarasi image item

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahansayur_suggestion);


        String onClikSayur = getIntent().getStringExtra("dataSayur");
        listView = (ListView)findViewById(R.id.listSayur);

        //  List Nama Sayuran, Deskripsi, dan Gambar di tulis di bawah ini.
        //  Tulis Sesuai dengan string yang ada di IF
        //  Jika 'WORTEL' maka isi dengan resep berbahan utama Wortel.
        if (onClikSayur.equalsIgnoreCase("wortel")){
            nama_sayur = new String[] {
                    "Wortel","Telur"
            };
            desc_sayur = new String[]{
                    "Wortel Desc","Telur Goreng Desc"
            };
            img_sayur = new String[]{
                    Integer.toString(R.drawable.ayam_resep),Integer.toString(R.drawable.telur_resep)
            };
        } else if (onClikSayur.equalsIgnoreCase("jagung")){
            nama_sayur = new String[] {
                    "Jagung","Ayam"
            };
            desc_sayur = new String[]{
                    "Jagung Desc","Telur Goreng Desc"
            };
            img_sayur = new String[]{
                    Integer.toString(R.drawable.ayam_resep),Integer.toString(R.drawable.telur_resep)
            };
        } else if (onClikSayur.equalsIgnoreCase("sawi")){
            nama_sayur = new String[] {
                    "Sawi","Telur"
            };
            desc_sayur = new String[]{
                    "Sawi Desc","Telur Goreng Desc"
            };
            img_sayur = new String[]{
                    Integer.toString(R.drawable.ayam_resep),Integer.toString(R.drawable.telur_resep)
            };
        } else if (onClikSayur.equalsIgnoreCase("brokoli")){
            nama_sayur = new String[] {
                    "Brokoli","Telur"
            };
            desc_sayur = new String[]{
                    "Brokoli Desc","Telur Goreng Desc"
            };
            img_sayur = new String[]{
                    Integer.toString(R.drawable.ayam_resep),Integer.toString(R.drawable.telur_resep)
            };
        } else if (onClikSayur.equalsIgnoreCase("kangkung")){
            nama_sayur = new String[] {
                    "Kangkung","Telur"
            };
            desc_sayur = new String[]{
                    "Kangkung Desc","Telur Goreng Desc"
            };
            img_sayur = new String[]{
                    Integer.toString(R.drawable.ayam_resep),Integer.toString(R.drawable.telur_resep)
            };
        } else if (onClikSayur.equalsIgnoreCase("bayam")){
            nama_sayur = new String[] {
                    "Bayam","Telur"
            };
            desc_sayur = new String[]{
                    "Bayam Desc","Telur Goreng Desc"
            };
            img_sayur = new String[]{
                    Integer.toString(R.drawable.ayam_resep),Integer.toString(R.drawable.telur_resep)
            };
        } else if (onClikSayur.equalsIgnoreCase("jamur")){
            nama_sayur = new String[] {
                    "Jamur","Telur"
            };
            desc_sayur = new String[]{
                    "Jamur Desc","Telur Goreng Desc"
            };
            img_sayur = new String[]{
                    Integer.toString(R.drawable.ayam_resep),Integer.toString(R.drawable.telur_resep)
            };
        } else if (onClikSayur.equalsIgnoreCase("terung")){
            nama_sayur = new String[] {
                    "Terung","Telur"
            };
            desc_sayur = new String[]{
                    "Terung Desc","Telur Goreng Desc"
            };
            img_sayur = new String[]{
                    Integer.toString(R.drawable.ayam_resep),Integer.toString(R.drawable.telur_resep)
            };
        }


        //memberikan event ketika listview diklik
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // inten ke detail.java dengan mengirimkan parameter yang berisi nama dan gambar
                Intent a = new Intent(getApplicationContext(), bahansayur_resep.class);
                //kirimkan parameter
                a.putExtra("Nama", nama_sayur[position]);
                a.putExtra("Gambar", desc_sayur[position]);
                a.putExtra("Deskripsi", img_sayur[position]);

                //kirimkan ke detail.java
                startActivity(a);
            }
        });



        mylist = new ArrayList<HashMap<String, String>>();

        for (int i=0; i<nama_sayur.length; i++){
            map = new HashMap<String, String>();
            map.put("judul", nama_sayur[i]);
            map.put("Keterangan", desc_sayur[i]);
            map.put("Gambar", img_sayur[i]);
            mylist.add(map);
        }
        adapter = new SimpleAdapter(this, mylist, R.layout.item_sayur,
                new String[]{"judul", "Keterangan", "Gambar"}, new int[]{R.id.txtNamaSayur,(R.id.txtDescSayur),(R.id.imgSayur)});
        listView.setAdapter(adapter);
    }

    public void pindahResep_sayur(View view) {
        Intent intent = new Intent(bahansayur_suggestion.this, bahansayur_resep.class);
        startActivity(intent);
    }
}
