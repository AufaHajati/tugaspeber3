package com.example.tugaspeber2;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
public class  MyViewHolder extends AppCompatActivity {
    ImageView imageView;
    TextView nameView, nimView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_view);

        ImageView imageView = findViewById(R.id.imageview);
        TextView nameTextView = findViewById(R.id.nama);
        TextView nimTextView = findViewById(R.id.nim);

    }
}
