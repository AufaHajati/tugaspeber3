package com.example.aufahajati;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class activity_hasil extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        ImageView imageView = findViewById(R.id.imageview);
        TextView nameView = findViewById(R.id.nama);
        TextView nimView = findViewById(R.id.nim);

        Intent intent = getIntent();
        if (intent != null) {
            String nama = intent.getStringExtra("nama");
            String nim = intent.getStringExtra("nim");
            int gambar = intent.getIntExtra("gambar", 0);

            imageView.setImageResource(gambar);
            nameView.setText(nama);
            nimView.setText(nim);
        }
    }
}
