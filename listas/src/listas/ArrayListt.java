package listas;

import java.util.ArrayList;

public class ArrayListt {
	
	    private ArrayList<Integer> arrayL;

	    public ArrayListt() {
	        arrayL = new ArrayList<>();
	    }

	    public void agregarElemento(int elemento) {
	        arrayL.add(elemento); // agrega el elemento
	    }

	    public int obtenerElemento(int posicion) {
	        return arrayL.get(posicion); // muestra el elemento  de x posicion que le pasan
	    }

	    public void eliminarElemento(int posicion) {
	        arrayL.remove(posicion); // elimina el elemento de x posicion que le pasan
	    }

	    public int obtenerTamaño() {
	        return arrayL.size(); // muestra el tamano
	    }
	}