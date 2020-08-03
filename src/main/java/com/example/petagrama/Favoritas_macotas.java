package com.example.petagrama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Favoritas_macotas extends AppCompatActivity {
    ArrayList<Modelo_mascotas> mascotaLista;
    private RecyclerView rvMascotasFavoritas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favoritas_activity);

        Toolbar miActionBarFavoritos = (Toolbar) findViewById(R.id.miActionBarFavoritos);

        setSupportActionBar(miActionBarFavoritos);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        rvMascotasFavoritas = (RecyclerView) findViewById(R.id.rvMascotasFavoritas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rvMascotasFavoritas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

    }
    public void inicializarAdaptador(){
        Adaptador adaptador = new Adaptador(mascotaLista);
        rvMascotasFavoritas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotaLista = new ArrayList<Modelo_mascotas>();
        mascotaLista.add(new Modelo_mascotas("Hamster",5,R.drawable.hamster));
        mascotaLista.add(new Modelo_mascotas("Conejo",5,R.drawable.conejo));
        mascotaLista.add(new Modelo_mascotas("Loro",5,R.drawable.loro));
        mascotaLista.add(new Modelo_mascotas("Gato",5,R.drawable.gato));
        mascotaLista.add(new Modelo_mascotas("Pez",5,R.drawable.pez));

    }

}
