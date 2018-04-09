/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;

/**
 * Clase que se encarga de registrar los cambios del Originador y
 * por mantener a salvo el memento.
 * 
 */
public class Caretaker {
    
    //Se crea arreglo de estados(Memento)
    private ArrayList<Memento> estados = new ArrayList<Memento>();
    
    //Se agrega un memento al array
    public void addMemento(Memento m){
        estados.add(m);
    }
    
    //Regresa el memento
    public Memento getMemento(int index){
        return estados.get(index);
    }
    
}
