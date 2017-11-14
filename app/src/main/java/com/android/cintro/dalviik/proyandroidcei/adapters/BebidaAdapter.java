package com.android.cintro.dalviik.proyandroidcei.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.cintro.dalviik.proyandroidcei.R;
import com.android.cintro.dalviik.proyandroidcei.model.Bebida;

import java.util.ArrayList;


public class BebidaAdapter extends RecyclerView.Adapter<BebidaAdapter.ViewHolder> {


    private ArrayList<Bebida> datos;

    public BebidaAdapter() {
        datos = new ArrayList<Bebida>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bebida, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Bebida b = datos.get(position);
        holder.marcaBebidaTextView.setText("" + b.getMarca());
        holder.cantidadBebidaTextView.setText("" + b.getCantidad());
        holder.precioBebidaTextView.setText("" + b.getPrecio());


    }

    @Override
    public int getItemCount() {
        return datos.size();

    }

    public void colocarDatos(ArrayList<Bebida> datos) {
        this.datos = datos;
        notifyDataSetChanged();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView marcaBebidaTextView;
        TextView cantidadBebidaTextView;
        TextView precioBebidaTextView;


        public ViewHolder(View itemView) {
            super(itemView);

            marcaBebidaTextView = itemView.findViewById(R.id.marcaBebidaTextView);
            cantidadBebidaTextView = itemView.findViewById(R.id.cantidadBebidaTextView);
            precioBebidaTextView = itemView.findViewById(R.id.precioBebidaTextView);


        }
    }


}
