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

        if (pilihanResep.equalsIgnoreCase("Sop Wortel")){
            bahanResep.setText("-1 buah wortel ukuran sedang \n-1 batang bawang daun \n-1 buah tomat kecil \n-1 siung bawang putih \n-2 siung bawang merah \n-3 buah cabai rawit");
            caraResep.setText("1. Cuci wortel, kentang, kol, lalu potong sesuai selera. \n2. Iris tipis bawang putih, bawang merah, bawang daun, seledri, tomat dan cabai.\n3. Tumis bawang merah, dan bawang putih sampai harum, lalu masukan air.\n4.Biarkan hingga mendidih lalu masukan wortel, cabai, dan kol.\n5. Beri garam, merica, dan kaldu sesuai selera, tes rasa dan kematangan kemudian sajikan. ");
            imgResep.setImageResource(R.drawable.sop_wortel);
        } else if (pilihanResep.equalsIgnoreCase("Nugget Wortel")){
            bahanResep.setText("-1,5 ons wortel\n-1 ons daging ayam giling\n-1/2 sdt merica bubuk\n-1/2 sdt kaldu ayam bubuk\n-1 butir telur\n-2 siung bawang putih");
            caraResep.setText("1. Campurkan ikan tengiri, ayam dan tepung sagu. Aduk rata.\n2. Masukkan sisa bahan kecuali tepung panir, aduk rata.\n3. Kukus adonan selama 30 menit.\n4. Biarkan adonan dingin, potong-potong sesuai selera.\n5. Celupkan pada air sebentar lalu gulingkan di atas tepung panir. \n6. Goreng dengan api kecil hingga berwarna keemasan. ");
            imgResep.setImageResource(R.drawable.nugget_wortel);
        } else if (pilihanResep.equalsIgnoreCase("Wortel Goreng")){
            bahanResep.setText("-300 gram wortel \n-1/2 sendok teh ketumbar \n-1/2 liter air putih\n-30 gram tepung beras\n-30 gram tepung sagu\n-300 gram tepung terigu");
            caraResep.setText("1. Haluskan bumbu-bumbu.\n2. Tambahkan tepung terigu, tepung beras, dan tempung sagu, aduk rata.\n3. Panaskan minyak sayur untuk menggoreng.\n4. Celupkan wortel ke dalam adonan tepung renyah, angkat.\n5. Masukkan wortel ke dalam minyak sayur panas, goreng sampai matang dan kering, angkat, tiriskan. \n6. Susun di wadah saji, wortel goreng siap dinikmati. ");
            imgResep.setImageResource(R.drawable.wortel_goreng);
        } else if (pilihanResep.equalsIgnoreCase("Kroket Wortel")) {
            bahanResep.setText("-500 gram kentang kukus\n-100 gr wortel\n-100 gr terigu\n-25 gr tepung panir\n-1 butir telur\n-3 siung bawang putih");
            caraResep.setText("1. Haluskan semua bumbu-bumbu yakni bawang putih, garam, merica, dan ketumbar.\n2. Buat adonan kroket dengan mencampurkan kentang kukus, wortel, terigu, dan telur.\n3. Campurkan adonan dengan bumbu sampai menyatu.\n4. Bentuk adonan kroket dan gulingkan diatas tepung panir.\n5. Kroket kentang wortel siap disajikan.");
            imgResep.setImageResource(R.drawable.kroket_kentang_wortel);
        } else if (pilihanResep.equalsIgnoreCase("Tumis Wortel")){
            bahanResep.setText("-1 buah wortel\n-2 siung bawang putih\n-5 buah bakso sapi\n-5-6 buah jagung muda\n-garam secukupnya\n-merica secukupnya");
            caraResep.setText("1. Potong wortel, jagung, lalu rebus sampai lunak.\n2. Tumis bawang putih sampai harum.\n3. Masukkan bakso, wartel, dan jagung.\n4. Tambahkan bumbu seperti saos tiram, saos tomat, merica, dan garam.\n5. Koreksi rasa, lalu hidangkan.");
            imgResep.setImageResource(R.drawable.tumis_wortel);
        } else if (pilihanResep.equalsIgnoreCase("Oseng Oseng Jagung")) {
            bahanResep.setText("-12 buah Jagung muda\n-1 sdm Kecap inggris\n-1 sdm Kecap manis\n-1 sdm Saus tiram\n-Garam & gula sesuai selera\n-200 ml Air kaldu atau air putih biasa\n-PALMIA MARGARIN SERBAGUNA untuk menumis");
            caraResep.setText("1. Cuci jagung muda,potong jadi 2 belah memanjang.\n2. Panaskan sedikit PALMIA MARGARIN SERBAGUNA tumis duo bawang hingga matang & harum.\n3. tambahkan lada halus,jagung & cabe merah keriting bersamaan,aduk rata,bubuhi garam,gula,kecap manis,saus tiram & kecap inggris,\n" +
                    "aduk rata.\n4. tuangkan air kaldu,masak hingga matang sebentar saja,koreksi rasa,sajikan.");
            imgResep.setImageResource(R.drawable.oseng_oseng_jagung);
        } else if (pilihanResep.equalsIgnoreCase("Tumis Sawi")) {
            bahanResep.setText("-2 ikat sawi hijau\n-3 buah cabe rawit\n-2 siung bawang putih\n-1 siung bawang merah\n-secukupnya garam\n-secukupnya gula");
            caraResep.setText("1. Potong ukuran sedang sawi hijau dan cuci sampai bersih\n2. Iris tipis-tipis bawang merah, bawang putih, dan cabe rawit\n3. Panaskan minyak dan tumis bumbu\n4. Tambahkan gula, garam secukupnya\n5. Masukkan sawi yang sudah di cuci dan aduk rata agar bumbu meresap\n6. Tambahkan sedikit air agar bumbu lebih meresap dengan sawi\n7. Siap disajikan");
            imgResep.setImageResource(R.drawable.tumis_sawi);
        } else if (pilihanResep.equalsIgnoreCase("Cah Brokoli")){
            bahanResep.setText("-1 buah brokoli\n-1 buah tomat\n-5 buah cabe hijau\n-2 siung bawang merah\n-1 siung bawang putih\n-secukupnya Garam");
            caraResep.setText("1. Bersihkan brokoli dan potong2\n2. Cincang/iris bawang merah, bawang putih, cabe, jahe dan tomat.\n3. Panaskan minyak diwajan.\n4. Masukkan bahan cincangan cabe, tumis sampai sedikit layu, masukkan brokoli, \n" +
                    "kemdian tambahkan garam, kaldu jamur, tumis sampai matang dengan api sedang cenderung kecil.\n5. Tumis brokoli siap dinikmati.");
            imgResep.setImageResource(R.drawable.cah_brokoli);
        } else if (pilihanResep.equalsIgnoreCase("Cah Kangkung")){
            bahanResep.setText("-Kangkung\n-Bawang putih\n-Bawang merah\n-Cabai merah\n-Garam\n-Saus tiram");
            caraResep.setText("1. Tumis bumbu iris sampai matang, masukkan kangkung (bagian tangkai/gagangnya).\n2. Masak sampai setengah matang, tambahkan air sedikit, beri gula, garam dan saus tiram. \n" +
                    "Kemudian masukkan kangkung (bagian daunnya), masak sebentar saja\n3. Sajikan.");
            imgResep.setImageResource(R.drawable.cah_kangkung);
        } else if (pilihanResep.equalsIgnoreCase("Tumis Bayam Tomat")){
            bahanResep.setText("-1 ikat bayam\n-3 buah tomat\n-5 Siung Bawang merah\n-2 Buah Cabai\n-3 siung bawang putih\n-Saus tiram\n-2 sdm kecap manis");
            caraResep.setText("1. Tumis bumbu halus hingga harum dan matang, beri sedikit air bila perlu.\n2. Masukkan jagung yang sudah disisir,tunggu hingga jagung matang.\n3. Masukkan bayam, bumbui dengan kecap manis, saos tiram, kecap asin, gula, garam, merica dan kaldu bubuk, aduk-aduk hingga rata.\n4. Terakhir masukkan potongan tomat, koreksi rasa, angkat dan sajikan.");
            imgResep.setImageResource(R.drawable.tumis_bayam_tomat);
        } else if (pilihanResep.equalsIgnoreCase("Tumis Jamur")){
            bahanResep.setText("-1 Bungkus Jamur Tiram Putih\n-2 Siung Bawang Putih (Iris)\n-2 Siung Bawang merah\n-3 Buah Cabai\n-1/4 Sachet Ladaku\n-Saus tiram\n-1 Sdm Saus Sambal");
            caraResep.setText("1. Cuci bersih jamur tiram, sambil di suwir*. Lalu peras hingga airnya berkurang.\n2. Tumis semua bumbu yang telah di iris.\n3. Setelah bumbu semua layu, masukan jamur, oseng2 hingga layu\n4. Lalu masukan lada, saus tiram, gula putih, micin, royco dan saus sambal. Tambahkan sedikit air dan masak -+5 menit\n 5. Sajikan");
            imgResep.setImageResource(R.drawable.tumis_jamur);
        } else if (pilihanResep.equalsIgnoreCase("Balado Terong")){
            bahanResep.setText("-1 buah terong ungu uk. sedang\n-1 sdm kecap manis\n-1 buah tomat ukuran sedang\n-secukupnya garam, gula pasir, merica, masako ayam (opsi lain)\n-3 siung bawang merah\n-1 siung bawang putih\n-15 buah cabe");
            caraResep.setText("1. 1. Sambil nunggu bumbu halusnya diulek, rendam irisan terong dalam air yg ditambah sedikit garam \n2. Setelah bumbu halus selesai dikerjakan sisihkan dulu\n3. goreng siterong ungunya semua dlm minyak panas tp apinya sedang cenderung kecil, digoreng setengah matang/ \n" +
                    "sesuai selera\n4. angkat & sisihkan\n 5. Tumis bumbu halus dgn api sedang, setelah wangi tambahkan potongan tomat\n6. dalam tumisan, aduk dan tambahkan jg air sedikit, garam, gula pasir, merica, kecap manis & masako. \n" +
                    "   Icip utk koreksi rasa. Terahir masukan terong yg sudah digoreng, \n" +
                    "   aduk rata setelah itu matikan kompor dan siap dihidangkan");
            imgResep.setImageResource(R.drawable.balado_terong);
        }
    }


}
