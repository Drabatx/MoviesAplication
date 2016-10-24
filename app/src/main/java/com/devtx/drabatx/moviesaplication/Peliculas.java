package com.devtx.drabatx.moviesaplication;

/**
 * Created by Jose Luis on 19/10/2016.
 */
public class Peliculas {

    private int id;
    private String Titulo;
    private String Descripcion;

    private Peliculas() {
    }

    public Peliculas(int id, String titulo, String descripcion) {
        this.id = id;
        Titulo = titulo;
        Descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
