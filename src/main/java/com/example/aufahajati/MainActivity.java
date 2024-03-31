package com.example.aufahajati;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Nama: Abmi Sukma Edri", "NIM: 1205012o0341", R.drawable.ami));
        items.add(new Item("Nama: Ahmad Kurniawan", "NIM: 12250111514", R.drawable.ahmad));
        items.add(new Item("Nama: Aufa Hajati", "NIM: 12250120338", R.drawable.aufa));
        items.add(new Item("Nama: Daffa Finanda", "NIM: 12250111603", R.drawable.daffin));
        items.add(new Item("Nama: Daffa Ikhwan Nurfauzan", "NIM: 12250110979", R.drawable.dafa));
        items.add(new Item("Nama: Dwi Jelita Adhliyah", "NIM: 12250120331", R.drawable.jelita));
        items.add(new Item("Nama: Dwi Mahdini", "NIM: 12250111298", R.drawable.dwi));
        items.add(new Item("Nama: Fajri", "NIM: 1225011082", R.drawable.fajri));
        items.add(new Item("Nama: Fakhri", "NIM: 12250111381", R.drawable.fahri));
        items.add(new Item("Nama: Farras Lathief", "NIM: 12250111328", R.drawable.faras));
        items.add(new Item("Nama: Gilang Ramadhan Indra", "NIM: 12250111323", R.drawable.gilang));
        items.add(new Item("Nama: Hafidz Alhadid Rahman", "NIM: 12250111794", R.drawable.hafiz));
        items.add(new Item("Nama: Haritsah Naufaldy", "NIM: 12250110361", R.drawable.aldi));
        items.add(new Item("Nama: M. Nabil Dawami", "NIM: 12250111527", R.drawable.nabil));
        items.add(new Item("Nama: M. Zaki Erbay Syas", "NIM: 12250111134", R.drawable.zaki));
        items.add(new Item("Nama: M. Aditya Rinaldi", "NIM: 12250111048", R.drawable.adit));
        items.add(new Item("Nama: M. Dhimas Hadid", "NIM: 12250111231", R.drawable.dimas));
        items.add(new Item("Nama: M. Faruq", "NIM: 12250111791", R.drawable.faruq));
        items.add(new Item("Nama: M. Rafly Wirayudha", "NIM: 12250111489", R.drawable.rafli));
        items.add(new Item("Nama: Nurika Dwi Wahyuni", "NIM: 12250120360", R.drawable.nurika));
        items.add(new Item("Nama: Ogya Secio Noegroho.s", "NIM: 12250111346", R.drawable.ogi));
        items.add(new Item("Nama: Rahma Laksita", "NIM:12250124357", R.drawable.rahma));
        items.add(new Item("Nama: Surya Hidayatullah Firdaus", "NIM: 12250111759", R.drawable.surya));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));

    }
}


