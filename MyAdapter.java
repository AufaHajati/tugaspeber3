package com.example.tugaspeber2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private static OnItemClick onItemClick;
    private Context context;
    private List<Item> items;
    private ItemClickListener itemClickListener;

    public static void setOnItemClick(MyAdapter.OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    public static MyAdapter.OnItemClick getOnItemClick() {
        return onItemClick;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(view, itemClickListener);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Item currentItem = Item.get(position);
        holder.namaTextView.setText(currentItem.get(position).getNama());
        holder.nimTextView.setText(currentItem.get(position).getNim());
        holder.imageView.setImageResource(currentItem.get(position).getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClick.onItemClick(currentItem);
            }
        });
    }


    @Override
    public int getItemCount() {
        return items.size();

    }

    public interface OnItemClick {
        void onItemClick(com.example.tugaspeber2.MyViewHolder MyViewHolder, int position);

        void onItemClick(Item Item);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView namaTextView, nimTextView;
        ImageView imageView;
        ItemClickListener itemClickListener;

        public MyViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
            super(itemView);
            namaTextView = itemView.findViewById(R.id.nama);
            nimTextView = itemView.findViewById(R.id.nim);
            imageView = itemView.findViewById(R.id.imageview);
            this.itemClickListener = itemClickListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            itemClickListener.onItemClick(v, getAdapterPosition());
        }
    }
}






