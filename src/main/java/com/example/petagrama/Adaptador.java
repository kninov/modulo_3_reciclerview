package com.example.petagrama;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder>{

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            context =itemView.getContext();
            recyclerMascota= itemView.findViewById(R.id.recyclerMascota);

            imgMascota = (ImageView) itemView.findViewById(R.id.imgMascota);
            tvNombreMascota = (TextView) itemView.findViewById(R.id.tvNombreMascota);
            tvRating = (TextView) itemView.findViewById(R.id.tvRating);
            btnRating  = (ImageButton) itemView.findViewById(R.id.btnRating);

        }

        private ImageView imgMascota;
        private TextView tvNombreMascota;
        private TextView tvRating;
        private ImageButton btnRating;

        Context context;

        RecyclerView recyclerMascota;

    }

    public List<Modelo_mascotas> mascotaLista;

    public Adaptador(List<Modelo_mascotas> cantantelista) {
        this.mascotaLista = cantantelista;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Modelo_mascotas mascota = mascotaLista.get(position);

        holder.tvNombreMascota.setText(mascota.getNombre());
        holder.imgMascota.setImageResource(mascota.getImagen());
        holder.tvRating.setText(Integer.toString(mascota.getRating()));

        holder.btnRating.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                if (mascota.getRating() <5){
                    mascota.setRating(mascota.getRating()+1);
                }
                else {
                    mascota.setRating(5);
                }
                holder.tvRating.setText( Integer.toString(mascota.getRating()));
            }
        });
    }


    @Override
    public int getItemCount() {
        return mascotaLista.size();
    }

}