package com.android.cintro.dalviik.proyandroidcei.model;

public class Bebida {

    private String marca;
    private String cantidad;
    private int precio;

    public Bebida(String m, String c, int p){
        marca=m;
        cantidad=c;
        precio=p;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
