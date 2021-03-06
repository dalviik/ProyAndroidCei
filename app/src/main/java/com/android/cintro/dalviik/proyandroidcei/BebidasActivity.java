package com.android.cintro.dalviik.proyandroidcei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.cintro.dalviik.proyandroidcei.adapters.BebidaAdapter;
import com.android.cintro.dalviik.proyandroidcei.adapters.ComidaAdapter;
import com.android.cintro.dalviik.proyandroidcei.model.Bebida;
import com.android.cintro.dalviik.proyandroidcei.model.Comida;

import java.util.ArrayList;

public class BebidasActivity extends AppCompatActivity {
    RecyclerView bebidasRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);


        bebidasRecyclerView = (RecyclerView) findViewById(R.id.bebidasRecyclerView);
        bebidasRecyclerView.setHasFixedSize(true);
        bebidasRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Bebida> datos = new ArrayList<Bebida>();

        Bebida b1 = new Bebida("Coca Cola", "Botella 2 Litros", 13);
        datos.add(b1);
        b1 = new Bebida("Pepsi", "Botella 1 Litro", 8);
        datos.add(b1);
        b1 = new Bebida("Fanta", "Botella 2 Litros", 13);
        datos.add(b1);
        b1 = new Bebida("Sprite", "Botella Personal", 2);
        datos.add(b1);
        b1 = new Bebida("Coca Cola Light", "Botella 2 Litros", 13);
        datos.add(b1);



        BebidaAdapter adaptador = new BebidaAdapter();
        adaptador.colocarDatos(datos);

        bebidasRecyclerView.setAdapter(adaptador);
    }
}
