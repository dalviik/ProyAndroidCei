package com.android.cintro.dalviik.proyandroidcei;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.android.cintro.dalviik.proyandroidcei.adapters.ComidaAdapter;
import com.android.cintro.dalviik.proyandroidcei.model.Comida;

import java.util.ArrayList;

public class ComidaActivity extends AppCompatActivity {
    RecyclerView comidaRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida);

        comidaRecyclerView = (RecyclerView) findViewById(R.id.comidaRecyclerView);
        comidaRecyclerView.setHasFixedSize(true);
        comidaRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Comida> datos = new ArrayList<Comida>();
        Comida c1 = new Comida("Hamburguesa Simple", 12);
        datos.add(c1);
        c1 = new Comida("Hamburguesa Con Doble", 18);
        datos.add(c1);
        c1 = new Comida("Hamburguesa Con Queso", 18);
        datos.add(c1);
        c1 = new Comida("Hamburguesa Con Jamon y Queso", 25);
        datos.add(c1);
        c1 = new Comida("Hamburguesa Doble Con Jamon y Queso", 29);
        datos.add(c1);


        ComidaAdapter adaptador = new ComidaAdapter();
        adaptador.colocarDatos(datos);

        comidaRecyclerView.setAdapter(adaptador);


    }


}
