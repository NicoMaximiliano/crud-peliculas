package com.nicode.crud_peliculas.model;

public class Pelicula {
    
    private int id;
    private String titulo;
    private int anio;
    private String categoria;
    private double puntaje;
    private String descripcion;

    public Pelicula() {
    }
    
    public Pelicula(int id, String titulo, int anio, String categoria, double puntaje, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.categoria = categoria;
        this.puntaje = puntaje;
        this.descripcion = descripcion;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String[] datosPelicula(){
        String datos[] = {String.valueOf(id),titulo,String.valueOf(anio),categoria,String.valueOf(puntaje),descripcion};
        
        return datos;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id: " + id + "| titulo: " + titulo + "| añoo: " + anio + "| categoria: " + categoria + "| puntaje: " + puntaje + "| descripcion: " + descripcion + '}';
    }
    
}
