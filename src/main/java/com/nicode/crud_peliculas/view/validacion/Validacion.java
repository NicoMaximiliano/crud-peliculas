package com.nicode.crud_peliculas.view.validacion;

import com.nicode.crud_peliculas.dao.PeliculaDao;
import com.nicode.crud_peliculas.model.Pelicula;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Validacion {

    public Validacion() {}
    
  
    public boolean validarId(JTextField campoId){
        
        boolean esValido = true;

        if(campoId.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "El campo id esta vacio, ingrese un id.");
            esValido = false;
        }
        else if(!(validarSiEsNumerico(campoId.getText()))){
            JOptionPane.showMessageDialog(null, "El id ingresado es incorrecto, ingrese un id valido.");
            esValido = false;
        }
        else if(!(validarIdSiEstaEnBaseDeDatos(campoId.getText()))){
            JOptionPane.showMessageDialog(null, "El id ingresado no existe, ingrese un id valido.");
            esValido = false;
        }
        
        return esValido;
    }
    
    
    public boolean validarTitulo(JTextField campoTitulo){

        if(campoTitulo.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "El campo titulo esta vacio, ingrese un titulo.");
            return false;
        }
                
        return true;
    }
    
    
    public boolean validarAnio(JTextField campoAnio){
        
        boolean esValido = true;
        
        if(campoAnio.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "El campo año esta vacio, ingrese un año.");
            esValido = false;
        }
        else if(!(validarSiEsNumerico(campoAnio.getText()))){
            JOptionPane.showMessageDialog(null, "El año ingresado es incorrecto, ingrese un año valido.");
            esValido = false;
        }
        
        return esValido;
    }
    
    
    public boolean validarCategoria(JTextField campoCategoria){

        boolean esValido = true;
        
        if(campoCategoria.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "El campo categoria esta vacio, ingrese una categoria.");
            esValido = false;
        }
        else if(validarSiEsNumerico(campoCategoria.getText())){
            JOptionPane.showMessageDialog(null, "El campo categoria es incorrecto, ingrese una categoria valida.");
            esValido = false;
        }
                
        return esValido;
    }
    
    
    public boolean validarPuntaje(JTextField campoPuntaje){
        
        boolean esValido = true;

        if(campoPuntaje.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "El campo puntaje esta vacio, ingrese un puntaje.");
            esValido = false;
        }
        else if(!(validarSiEsNumerico(campoPuntaje.getText()))){
            JOptionPane.showMessageDialog(null, "El puntaje ingresado es incorrecto, ingrese un puntaje valido.");
            esValido = false;
        }
        else if(validarSiEsNumerico(campoPuntaje.getText())){
            double puntaje = Double.parseDouble(campoPuntaje.getText());
            
            if(puntaje > 10){
                JOptionPane.showMessageDialog(null, "El puntaje ingresado no puede ser mayor a 10, ingrese un puntaje valido.");
                esValido = false;
            }
        }
      
        return esValido;
    }
    
    
    public boolean validarDescripcion(JTextArea campoDescripcion){

        boolean esValido = true;
        
        if(campoDescripcion.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "El campo descripcion esta vacio, ingrese una descripcion.");
            esValido = false;
        }
        else if(validarSiEsNumerico(campoDescripcion.getText())){
            JOptionPane.showMessageDialog(null, "El campo descripcion es incorrecto, ingrese una descripcion valida.");
            esValido = false;
        }
                
        return esValido;
    }
    
    
    private boolean validarSiEsNumerico(String str){
            return str != null && str.matches("[0-9.]+");
    }
    
    
    private boolean validarIdSiEstaEnBaseDeDatos(String str){
        PeliculaDao peliculaDao = new PeliculaDao();
        List<Pelicula> peliculas = peliculaDao.mostrarPeliculas();
        int id = Integer.parseInt(str);              
        boolean estaId = false;
        
        for(Pelicula p: peliculas){
            if(p.getId() == id){
                estaId = true;
                break;
            }
        }
        
        return estaId;
    }
    
}
