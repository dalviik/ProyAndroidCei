package com.android.cintro.dalviik.proyandroidcei.model;

public class Comida {

    private String nombre;
    private int precio;

    public Comida(String n, int p){
        nombre=n;
        precio=p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
