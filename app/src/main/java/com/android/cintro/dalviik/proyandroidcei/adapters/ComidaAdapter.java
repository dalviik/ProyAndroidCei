package com.android.cintro.dalviik.proyandroidcei.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.cintro.dalviik.proyandroidcei.R;
import com.android.cintro.dalviik.proyandroidcei.model.Comida;

import java.util.ArrayList;



public class ComidaAdapter extends RecyclerView.Adapter<ComidaAdapter.ViewHolder> {


    private ArrayList<Comida> datos;

    public ComidaAdapter() {
        datos = new ArrayList<Comida>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comida, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Comida c = datos.get(position);
        holder.nombreTextView.setText(""+c.getNombre());
        holder.precioTextView.setText("Precio: "+c.getPrecio()+" Bs.");


    }

    @Override
    public int getItemCount() {
        return datos.size();

    }
    public void colocarDatos(ArrayList<Comida> datos) {
        this.datos = datos;
        notifyDataSetChanged();
    }



    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView nombreTextView;
        TextView precioTextView;


        public ViewHolder(View itemView) {
            super(itemView);

            nombreTextView = itemView.findViewById(R.id.nombreTextView);
            precioTextView = itemView.findViewById(R.id.precioTextView);


        }
    }


}
