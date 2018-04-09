/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 * Objeto memento. (Originator)
 * 
 */
public class Persona {
    
    private String nombre;
    
    //Creacion de un memento.
    public Memento saveToMemento(){
        System.out.println("Originator: Guardando Memento...");
        return new Memento(getNombre());
    }
    
    //Restaurar el estado de Persona a partir de un memento.
    public void restoreFromMemento(Memento m){
        nombre = m.getSavedState();
    }
    
     /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
