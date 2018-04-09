/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 */
public class MainClass {
    
    public static void main(String[] args) {
        //Se crea un caretaker
        Caretaker caretaker = new Caretaker();
        
        //Se crea una nueva persona
        Persona p = new Persona();
        //le asignamos un nombre a la persona 
        
        p.setNombre("Jose");
        //le cambiamos el nombre a la persona
        p.setNombre("Ararat");
        
        //Aqui agregamos un memento dentro del caretaker
        //p.saveToMemento() te crea el memento
        caretaker.addMemento(p.saveToMemento());
        
        //cambiamos el nombre de nuevo
        p.setNombre("Pedro");
        
        //Agregamos otro memento en el caretaker
        caretaker.addMemento(p.saveToMemento());
        
        //Le cambiamos el nombre
        p.setNombre("Juan");
        
        System.out.println("\n------------------ Nombre actual -----------------\n");
        System.out.println("nombre actual = " + p.getNombre());
    
        //obtienes del caretaker el memento en la posicion 0 del array
        Memento m1 = caretaker.getMemento(0);
        //obtienes del caretaker el memento en la posicion 1 del array
        Memento m2 = caretaker.getMemento(1);
        
        System.out.println("\n------- Mementos guardados en el caretaker -------\n");
        //Obtenemos el estado del memento m1
        System.out.println("nombre m1 = " + m1.getSavedState());
        //Obtenemos el estado del memento m2
        System.out.println("nombre m2 = " + m2.getSavedState());
        
        System.out.println("\n---------------- Nombre restaurado ---------------\n");
        
        //Restaura el nombre actual de la persona dependiendo el memento
        p.restoreFromMemento(m1);
        
        System.out.println("Nombre Restaurado = " + p.getNombre());
        
        System.out.println("\n--------------------------------------------------\n");
    }
    
}
