package com.example.petagrama;

public class Modelo_mascotas {
    private String nombre;
    private  int rating;
    private int imagen;


    public Modelo_mascotas(){

    }

    public Modelo_mascotas(String nombre, int rating, int imagen) {
        this.nombre = nombre;
        this.rating = rating;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}