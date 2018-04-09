/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * Clase que almacena el estado del objeto tipo Persona.
 * 
 */
public class Memento {
    
    private String estado;

    //constructor del memento
    public Memento(String estado) {
        this.estado = estado;
    }
    
    //Obtiene el estado del memento (que es el nombre).
    public String getSavedState(){
        return estado;
    }
    
}
