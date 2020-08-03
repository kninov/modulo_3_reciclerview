package com.example.petagrama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView  recyclerViewMascota;
    private Adaptador adaptadorMascota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
try{
    Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
    setSupportActionBar(miActionBar);

    recyclerViewMascota=(RecyclerView)findViewById(R.id.recyclerMascota);
    recyclerViewMascota.setLayoutManager(new LinearLayoutManager(this));

    adaptadorMascota=new Adaptador(obtenermascotas());
    recyclerViewMascota.setAdapter(adaptadorMascota);

}
        catch (Exception e){

        }

    }
    public List<Modelo_mascotas> obtenermascotas(){
        List<Modelo_mascotas> mascota= new ArrayList<>();
        mascota.add(new Modelo_mascotas("mascota1",0,R.drawable.mascota1));
        mascota.add(new Modelo_mascotas("mascota2",0,R.drawable.mascota2));
        mascota.add(new Modelo_mascotas("mascota3",0,R.drawable.mascota3));
        mascota.add(new Modelo_mascotas("mascota4",0,R.drawable.mascota4));
        mascota.add(new Modelo_mascotas("mascota5",0,R.drawable.mascota5));
        mascota.add(new Modelo_mascotas("mascota6",0,R.drawable.mascota6));
        mascota.add(new Modelo_mascotas("mascota7",0,R.drawable.mascota7));
        mascota.add(new Modelo_mascotas("mascota8",0,R.drawable.mascota8));



        return mascota;
    }

    public void irMascotasFavoritas(View v) {
        Intent intent = new Intent(this, Favoritas_macotas.class);
        startActivity(intent);
    }

}