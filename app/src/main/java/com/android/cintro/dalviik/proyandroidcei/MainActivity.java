package com.android.cintro.dalviik.proyandroidcei;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void irAComidas(View v){
        Intent i = new Intent(this, ComidaActivity.class);
        startActivity(i);
    }
    public void irABebidas(View v){
        Intent i = new Intent(this, BebidasActivity.class);
        startActivity(i);
    }
    public void enviarCorreo(View v){
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"duglasapazaa@gmail.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "Pedido de comida, demo app");
        i.putExtra(Intent.EXTRA_TEXT, "Me gustaría el pedido de .. y lo necesito urgente, tengo mucha hambre!");
        startActivity(i);
    }

}
