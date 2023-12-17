package com.nicode.crud_peliculas.dao;

import java.util.List;


public interface IPeliculaDao <T>{
    
    void agregarPelicula(T t);
    List<T> mostrarPeliculas();
    void actualizarPelicula(T t);
    void borrarPelicula(T t);
}
