package com.devtx.drabatx.moviesaplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jose Luis on 19/10/2016.
 */
public class PeliculasAdapter extends RecyclerView.Adapter<PeliculasAdapter.PeliculasViewHolder> {

    ArrayList<Peliculas> peliculas;

    public PeliculasAdapter(ArrayList<Peliculas> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public PeliculasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);
        PeliculasViewHolder itemViewHolder = new PeliculasViewHolder(itemView);
        return  itemViewHolder;
    }

    @Override
    public void onBindViewHolder(PeliculasViewHolder holder, int position) {
        Peliculas peli = peliculas.get(position);
        holder.bindItem(peli);
    }

    @Override
    public int getItemCount() {
        return peliculas.size();
    }

    public static class PeliculasViewHolder extends RecyclerView.ViewHolder{

        TextView titulo;
        TextView subtitulo;
        ImageView imagen;
        public PeliculasViewHolder(View itemView) {
            super(itemView);
            titulo = (TextView)itemView.findViewById(R.id.tituloTxt);
            subtitulo = (TextView)itemView.findViewById(R.id.subtituloTxt);
            imagen = (ImageView)itemView.findViewById(R.id.imageView);
        }
        public  void bindItem(Peliculas item){
            titulo.setText(item.getTitulo());
            subtitulo.setText(item.getDescripcion());
            imagen.setImageResource(R.drawable.neo);
        }
    }
}
