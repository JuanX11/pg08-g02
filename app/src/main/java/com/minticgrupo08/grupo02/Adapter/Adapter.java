package com.minticgrupo08.grupo02.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.minticgrupo08.grupo02.R;

import java.util.ArrayList;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;


    ArrayList<Mascota> list;

    public Adapter(Context context, ArrayList<Mascota> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Mascota mascota = list.get(position);
        holder.NombreMascota.setText(mascota.getNombreMascota());
        holder.descripciontxt.setText(mascota.getdescripciontxt());
        Glide.with(context).load(mascota.getUrl()).into(holder.imagen);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends  RecyclerView.ViewHolder{

        TextView NombreMascota,descripciontxt;
        ImageView imagen;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.ImagenMascota);

            NombreMascota=itemView.findViewById(R.id.NombreMascota);
            descripciontxt=itemView.findViewById(R.id.descripciontxt);
        }
    }
}
