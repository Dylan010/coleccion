package listas;

import java.util.Queue;
import java.util.LinkedList;

public class Cola {
	
    private Queue<Integer> cola;

    public Cola() { // constructor
        cola = new LinkedList<>();  // puede ser  ArrayDeque<Integer>(); tambien
    }

    public void agregar(int x) {
        cola.offer(x);   // agrega ala cola
    }

    public int sacarYMostrar() {
        return cola.poll(); // saca y devuelve el  elemento mas antiguo en la cola
    }

    public int mostrarPrimero() {
        return cola.peek(); // devuelve el elemento mas antiguo de la cola sin eliminarlo
    }

    public boolean estaVacia() {
        return cola.isEmpty(); // te dice si esta vacia 
    }

    public int obtenerTamano() {
        return cola.size(); // te dice el tamano
    }

    public boolean buscarElemento(int x) {
        return cola.contains(x); // te devuelve true o false si encuentra el elemento en la cola
    }

    public void agregarEspecifico(Queue<Integer> colax, int elemento) {
        colax.offer(elemento); // cola como si fuera un parametro
    }
}

