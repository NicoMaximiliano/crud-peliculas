package com.nicode.crud_peliculas.dao;

import com.nicode.crud_peliculas.model.Pelicula;
import com.nicode.crud_peliculas.util.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class PeliculaDao implements IPeliculaDao<Pelicula>{
    
    public PeliculaDao() {}
    
    
    private Connection conectarBaseDeDatos(){
        return DatabaseConnection.establecerConexion();
    }

    
    @Override
    public void agregarPelicula(Pelicula pelicula) {
        
        try{
            Connection conexion = conectarBaseDeDatos();
            PreparedStatement st = conexion.prepareStatement("INSERT INTO peliculas (titulo,año,categoria,puntaje,descripcion) VALUES (?,?,?,?,?)");
            
            st.setString(1,pelicula.getTitulo());
            st.setInt(2,pelicula.getAnio());
            st.setString(3,pelicula.getCategoria());
            st.setDouble(4,pelicula.getPuntaje());
            st.setString(5,pelicula.getDescripcion());
            
            st.executeUpdate();
            
            st.close();
            conexion.close();
        }
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("Error controlado");
        }
    }

    @Override
    public List<Pelicula> mostrarPeliculas(){
        List <Pelicula> peliculas = new ArrayList<>();
                
        try{
            Connection conexion = conectarBaseDeDatos();
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM peliculas");
            
            while(rs.next()){
                int id = Integer.parseInt(rs.getString("id"));
                String titulo = rs.getString("titulo");
                int anio = Integer.parseInt(rs.getString("año"));;
                String categoria = rs.getString("categoria");
                double puntaje = Double.parseDouble(rs.getString("puntaje"));;
                String descripcion = rs.getString("descripcion");
                
                peliculas.add(new Pelicula(id,titulo,anio,categoria,puntaje,descripcion));

            }
            
            st.close();
            conexion.close();
        }
        catch(SQLException e){
            e.printStackTrace();
            System.out.println("Error controlado");
        }
 
        return peliculas;
    }

    
    @Override
    public void actualizarPelicula(Pelicula pelicula) {
     
        try{           
            Connection conexion = conectarBaseDeDatos();   
                      
            PreparedStatement st = conexion.prepareStatement("UPDATE peliculas SET titulo = ?, año = ?, categoria = ?, puntaje = ?, descripcion = ? WHERE id = ?");            

            st.setString(1, pelicula.getTitulo());
            st.setInt(2, pelicula.getAnio());
            st.setString(3,pelicula.getCategoria());
            st.setDouble(4, pelicula.getPuntaje());
            st.setString(5, pelicula.getDescripcion());
            st.setInt(6,pelicula.getId());
           
            st.executeUpdate();
            st.close();
            
            conexion.close();
            
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Error controlado");
        }
    }

    @Override
    public void borrarPelicula(Pelicula pelicula) {
        try{
            Connection conexion = conectarBaseDeDatos();
            
            PreparedStatement st = conexion.prepareStatement("DELETE FROM peliculas WHERE id = ?"); 
            st.setInt(1,pelicula.getId());
            st.executeUpdate();
            
            st.close();
            conexion.close();
            
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Error controlado");
        }
    }
    
}
